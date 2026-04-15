package com.qmb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot06EnableApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Springboot06EnableApplication.class, args);
        Object user = context.getBean("user");
        System.out.println(user);
    }

}
