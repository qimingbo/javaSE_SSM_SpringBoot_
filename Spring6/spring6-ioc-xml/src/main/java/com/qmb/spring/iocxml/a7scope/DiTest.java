package com.qmb.spring.iocxml.a7scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

    // 测试单实例bean
    @Test
    public void testDemo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user1", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }
    // 测试多实例bean
    @Test
    public void testDemo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        User user1 = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user1);
        System.out.println(user2);
    }
}
