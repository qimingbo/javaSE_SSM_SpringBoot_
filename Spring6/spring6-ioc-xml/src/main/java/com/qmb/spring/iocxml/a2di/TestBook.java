package com.qmb.spring.iocxml.a2di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testBook()
    {
        // 测试set注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
    @Test
    public void testConstructor()
    {
        // 测试构造器注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book2", Book.class);
        System.out.println(book);
    }
}
