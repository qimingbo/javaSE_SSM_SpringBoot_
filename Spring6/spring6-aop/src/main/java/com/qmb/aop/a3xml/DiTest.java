package com.qmb.aop.a3xml;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    // 配置切面类
    @Test
    public void testDemo1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1,2);
    }
}
