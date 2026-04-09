package com.qmb.a3resource;

import com.qmb.a3resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    @Test
    public void testDemo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-annotation.xml");
        UserController myUserController = (UserController)context.getBean("myUserController");
        myUserController.addUser();
    }

    // 全注解开发，使用配置类
    @Test
    public void testDemo2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController myUserController = (UserController)context.getBean("myUserController");
        myUserController.addUser();
    }

}
