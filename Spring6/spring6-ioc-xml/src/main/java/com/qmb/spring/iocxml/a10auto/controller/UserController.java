package com.qmb.spring.iocxml.a10auto.controller;

import com.qmb.spring.iocxml.a10auto.service.UserService;

public class UserController {
    private UserService userService;

    public void addUser()
    {
        System.out.println("UserController执行了");
        userService.addUser();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
