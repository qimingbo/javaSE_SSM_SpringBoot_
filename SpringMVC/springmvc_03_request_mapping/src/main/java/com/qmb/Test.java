package com.qmb;

import com.qmb.config.SpringConfig;
import com.qmb.config.SpringMVCConfig;
import com.qmb.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringMVCConfig.class);
        UserController userController = context.getBean(UserController.class);
        System.out.println(userController);
    }
}
