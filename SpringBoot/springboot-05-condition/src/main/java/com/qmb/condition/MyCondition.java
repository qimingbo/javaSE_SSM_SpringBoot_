package com.qmb.condition;

import io.lettuce.core.output.BooleanOutput;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.data.redis.core.RedisTemplate;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 这里只是用来演示
        // 需求1：导入Jedis坐标后创建bean
        // 思路：判断redis.clients.jedis.Jedis.class是否存在
        boolean flag = true;
        try {
            Class<?> clazz = Class.forName("redis.clients.jedis.Jedis");
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;
    }
}
