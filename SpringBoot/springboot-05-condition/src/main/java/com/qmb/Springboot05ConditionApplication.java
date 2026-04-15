package com.qmb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot05ConditionApplication {

    public static void main(String[] args) {
        // 启动SpringBoot的应用,返回Spring的IoC容器
        ConfigurableApplicationContext context = SpringApplication.run(Springboot05ConditionApplication.class, args);
/*        // 获取bean,redisTemplate
        Object redisTemplate = context.getBean("redisTemplate");
        System.out.println(redisTemplate);*/

/*        Object user = context.getBean("user");
        System.out.println(user);*/

/*        Object user2 = context.getBean("user2");
        System.out.println(user2);*/

        Object user3 = context.getBean("user3");
        System.out.println(user3);
    }


}
