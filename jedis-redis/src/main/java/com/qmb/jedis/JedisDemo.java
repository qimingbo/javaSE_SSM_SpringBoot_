package com.qmb.jedis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        String ping = jedis.ping();
        System.out.println(ping);
    }

    @Test
    public  void testKey()
    {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        Set<String> keys = jedis.keys("*");
        for (String key : keys) {
            System.out.println(key);
        }
    }

    @Test
    public void testString()
    {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.mset("k1","lucas","k2","lucy","k3","mary");
        List<String> mget = jedis.mget("k1", "k2", "k3");
        System.out.println(mget);
    }

    @Test
    public void testList()
    {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.lpush("k4","mary","lucas","qimingbo");
        List<String> k4 = jedis.lrange("k4", 0, -1);
        System.out.println(k4);
    }
    @Test
    public void testSet()
    {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.sadd("k5","java","python","c++","java");
        Set<String> k5 = jedis.smembers("k5");
        System.out.println(k5);
    }
    @Test
    public void testHash()
    {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.hset("user:1001","name","zhangsan");
        Map<String,String> map = new HashMap<>();
        map.put("name","lisi");
        map.put("age","20");
        jedis.hmset("user:1002",map);
        Set<String> hkeys = jedis.hkeys("user:1002");
        System.out.println(hkeys);
        List<String> hvals = jedis.hvals("user:1001");
        System.out.println(hvals);
    }
    @Test
    public void testzSet()
    {
        Jedis jedis = new Jedis("127.0.0.1",6379);
        jedis.zadd("k6",100,"java");
        jedis.zadd("k6",300,"python");
        jedis.zadd("k6",200,"c++");
        jedis.zadd("k6",500,"mysql");
        Set<String> k6 = jedis.zrange("k6", 0, -1);
        System.out.println(k6);
    }
}
