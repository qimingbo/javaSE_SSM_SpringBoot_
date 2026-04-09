package com.qmb.a2autowired;

import com.qmb.a1annotation.User;
import com.qmb.a2autowired.controller.UserController;
import com.qmb.a2autowired.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {
    @Test
    public void testDemo1()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-annotation.xml");
        UserController userController = (UserController)context.getBean("userController");
        userController.addUser();
    }
}
