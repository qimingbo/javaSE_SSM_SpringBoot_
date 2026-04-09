package com.qmb.a1annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {
    @Test
    public void TestDemo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-annotation.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
