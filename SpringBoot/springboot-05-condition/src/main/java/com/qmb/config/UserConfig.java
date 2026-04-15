package com.qmb.config;

import com.qmb.condition.ConditionOnClass;
import com.qmb.condition.MyCondition;
import com.qmb.entity.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    @Conditional(value = MyCondition.class)
    public User user()
    {
        return new User();
    }

    @Bean
    @ConditionOnClass("redis.clients.jedis.Jedis")
    public User user2()
    {
        return new User();
    }

    @Bean
    @ConditionalOnProperty(name = "qimingbo",havingValue = "1234")
    public User user3()
    {
        return new User();
    }
}
