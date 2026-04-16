package com.qmb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class Springboot06EnableApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Springboot06EnableApplication.class, args);
        Object user = context.getBean("user");
        System.out.println(user);


        Jedis jedis1 = (Jedis) context.getBean("jedis");
        System.out.println(jedis1.getClass());
        System.out.println(jedis1);
    }

    @Bean
    public Jedis jedis()
    {
        return new Jedis();
    }
}
