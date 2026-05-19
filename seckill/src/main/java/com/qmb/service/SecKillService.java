package com.qmb.service;

import com.qmb.util.JedisPoolUtil;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisSentinelPool;
import redis.clients.jedis.Transaction;
import sun.security.rsa.RSASignature;

import java.util.List;

@Service
public class SecKillService {

    // 秒杀业务逻辑,为了测试效果,默认prodId = 1111
    public boolean secKill(String userId,String prodId)
    {
        // 1.判断id是否为空
        if(userId == null || prodId == null)
        {
            return false;
        }
        // 2.连接redis
        JedisPool jedisPoolInstance = JedisPoolUtil.getJedisPoolInstance();
        Jedis jedis = jedisPoolInstance.getResource();
        // 3.拼接相关的key
        String kcKey = "sk:" + prodId + ":qt";
        String userKey = "sk:" + prodId + ":user";

        // 监视key
        jedis.watch(kcKey);

        // 4.获取库存,如果库存null,秒杀还没开始
        String kcValue = jedis.get(kcKey);
        if (kcValue == null)
        {
            System.out.println("秒杀还没开始,请等待");
            jedis.close();
            return false;
        }
        // 5.判断用户是否重复秒杀操作
        Boolean sismember = jedis.sismember(userKey, userId);
        if(sismember)
        {
            System.out.println("已秒杀,请不要重复秒杀");
            jedis.close();
            return false;
        }
        // 6.判断库存
        int kc = Integer.parseInt(kcValue);
        if (kc < 1)
        {
            System.out.println("秒杀结束");
            jedis.close();
            return false;
        }

        Transaction multi = jedis.multi();
        multi.decr(kcKey);
        multi.sadd(userKey,userId);
        List<Object> exec = multi.exec();
        if (exec == null || exec.size() == 0)
        {
            System.out.println("秒杀失败了");
            jedis.close();
            return false;
        }
        /*// 7.1 库存-1
        jedis.decr(kcKey);
        // 7.2 把秒成功用户添加到清单中
        jedis.sadd(userKey,userId);*/
        System.out.println("秒杀成功");
        jedis.close();
        return true;
    }

    // 使用lua脚本来解决库存遗漏问题
    static String secKillScript = "local userid=KEYS[1];\n" +
            "local prodid =KEYS[2];\n" +
            "local qtkey=\"sk:\"..prodid..\":qt\";\n" +
            "local userkey=\"sk:\"..prodid..\":user\";\n" +
            "local userExists=redis.call(\"sismember\",userkey,userid);\n" +
            "if tonumber(userExists)==1 then\n" +
            "    return 2;\n" +
            "end\n" +
            "local num = redis.call(\"get\",qtkey);\n" +
            "if tonumber(num)<=0 then\n" +
            "    return 0;\n" +
            "else\n" +
            "    redis.call(\"decr\",qtkey);\n" +
            "    redis.call(\"sadd\",userkey,userid);\n" +
            "    return 1;\n" +
            "end";
    /**
     * 使用 Lua 脚本执行秒杀扣减库存逻辑
     *
     * @param userId 用户ID
     * @param prodId 商品ID
     * @return 是否执行成功（注意：这里的 return true 只代表代码没报错，真实的抢购结果看控制台输出）
     */
    public boolean secKillByScript(String userId, String prodId) {

        // 1. 获取 Jedis 连接池实例（这通常是单例模式实现的一个工具类）
        JedisPool jedisPoolInstance = JedisPoolUtil.getJedisPoolInstance();
        // 2. 从连接池中借用一个 Redis 连接
        Jedis jedis = jedisPoolInstance.getResource();

        try {
            // 3. 预加载脚本：将写好的 Lua 脚本 (secKillScript) 加载到 Redis 服务器的缓存中
            // Redis 会返回一个对应该脚本的 SHA1 校验和（摘要），有了这个，以后就不需要重复传输长长的脚本原文了
            String shal = jedis.scriptLoad(secKillScript);

            // 4. 执行脚本：通过 evalsha 命令执行缓存在 Redis 中的 Lua 脚本
            // 参数解析：
            //   shal: 刚才获取的脚本 SHA1 摘要
            //   2:    代表接下来传入的参数中，有 2 个是 KEYS（即对应 Lua 脚本里的 KEYS[1] 和 KEYS[2]）
            //   userId: 会赋值给 Lua 脚本中的 KEYS[1]
            //   prodId: 会赋值给 Lua 脚本中的 KEYS[2]
            Object result = jedis.evalsha(shal, 2, userId, prodId);

            // 5. 解析脚本的返回值（这里完美对应了我们前面讲的 Lua 脚本 return 的 0, 1, 2）
            String reString = String.valueOf(result);
            if ("0".equals(reString)) {
                System.out.println("已抢空");    // 对应脚本的 return 0;
            } else if ("1".equals(reString)) {
                System.out.println("抢购成功");  // 对应脚本的 return 1;
            } else if ("2".equals(reString)) {
                System.out.println("该用户已抢过"); // 对应脚本的 return 2;
            } else {
                System.out.println("抢购异常");
            }
        } finally {
            // 6. 归还连接：无论是否发生异常，务必将连接归还给连接池，防止连接泄漏
            if (jedis != null) {
                jedis.close();
            }
        }

        return true;
    }
}
