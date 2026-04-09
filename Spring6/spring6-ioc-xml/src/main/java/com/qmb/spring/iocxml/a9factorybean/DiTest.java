package com.qmb.spring.iocxml.a9factorybean;


import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

    @Test
    public void testDemo1()
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
