package com.qmb.spring.iocxml.a5dimap;

import com.qmb.spring.iocxml.a4dilist.Department;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

    // 测试为map集合注入
    @Test
    public void testDemo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student stu = context.getBean("student", Student.class);
        System.out.println(stu);
    }

    // 测试引用集合类型的bean
    @Test
    public void testDemo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Department dept = context.getBean("dept", Department.class);
        System.out.println(dept);
    }

    @Test
    public void testDemo3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student stu = context.getBean("student", Student.class);
        System.out.println(stu);
    }

    // 测试p命名空间
    @Test
    public void testDemo4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dip.xml");
        Department dept = context.getBean("dept", Department.class);
        System.out.println(dept);
    }
}
