package com.qmb.util;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolUtil {
    private static volatile JedisPool jedisPool = null;

    private JedisPoolUtil()
    {
    }

    public static  JedisPool getJedisPoolInstance()
    {
        if(jedisPool == null)
        {
            synchronized (JedisPoolUtil.class)
            {
                if(null == jedisPool)
                {
                    JedisPoolConfig poolConfig = new JedisPoolConfig();
                    poolConfig.setMaxTotal(200);
                    poolConfig.setMaxIdle(32);
                    poolConfig.setMaxWaitMillis(100*1000);
                    poolConfig.setBlockWhenExhausted(true);
                    poolConfig.setTestOnBorrow(true); // ping PONG

                    jedisPool = new JedisPool(poolConfig,"127.0.0.1",6379,60000);
                }
            }
        }
        return jedisPool;
    }
}
