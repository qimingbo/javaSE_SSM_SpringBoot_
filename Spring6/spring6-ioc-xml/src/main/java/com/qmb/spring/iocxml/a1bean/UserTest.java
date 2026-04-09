package com.qmb.spring.iocxml.a1bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    // 如果一个接口有多个实现类，这些实现类都配置了 bean，根据接口类型可以获取 bean 吗？
    //  不行，因为bean不唯一
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao bean = context.getBean(UserDao.class);
        System.out.println(bean);
    }
}
