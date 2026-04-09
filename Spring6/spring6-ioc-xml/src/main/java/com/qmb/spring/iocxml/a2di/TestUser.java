package com.qmb.spring.iocxml.a2di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 1.根据id获取bean
        User user1 = (User)context.getBean("user1");
        System.out.println("user1 "+user1);
        User user2  = (User)context.getBean("user2");
        System.out.println("user2 "+user2);
        // 2.根据类型获取bean
        // 细节：根据类型获取bean时，要求bean唯一
        User user3 = context.getBean(User.class);
        System.out.println("user3 "+user3);
        // 3.根据id+类型获取
        User user4 = context.getBean("user1", User.class);
        User user5 = context.getBean("user2", User.class);
        System.out.println("user4 "+user4);
        System.out.println("user5 "+user5);
    }
}
