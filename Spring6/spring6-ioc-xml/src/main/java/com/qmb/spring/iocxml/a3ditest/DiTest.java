package com.qmb.spring.iocxml.a3ditest;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    @Test
    public void diTest1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Employee emp = context.getBean("emp3", Employee.class);
        emp.work();
    }

    @Test
    public void diTest2()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Employee emp = context.getBean("emp4", Employee.class);
        System.out.println(emp);
    }

    @Test
    public void diTest3()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ditest.xml");
        Department dept = context.getBean("dept3",Department.class);
        System.out.println(dept);
    }

    @Test
    public void diTest4()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dilist.xml");
        Department dept = context.getBean("dept",Department.class);
        System.out.println(dept);
    }
}
