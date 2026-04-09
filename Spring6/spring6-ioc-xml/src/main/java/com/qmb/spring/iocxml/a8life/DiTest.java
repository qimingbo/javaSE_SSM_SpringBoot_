package com.qmb.spring.iocxml.a8life;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    // bean的生命周期
    @Test
    public void testDemo1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        User user = context.getBean("user", User.class);
        System.out.println("6.使用bean ");
        System.out.println(user);
        context.close();
    }

}
