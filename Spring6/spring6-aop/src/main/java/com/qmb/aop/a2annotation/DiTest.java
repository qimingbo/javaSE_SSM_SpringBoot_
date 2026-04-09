package com.qmb.aop.a2annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DiTest {
    @Test
    public void testDemo1()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1,2);
    }
}
