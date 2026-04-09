package com.qmb.spring.iocxml.a4dilist;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

    // 测试为list集合注入
    @Test
    public void TestDemo1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Department dept = context.getBean("dept", Department.class);
        System.out.println(dept);
    }
}
