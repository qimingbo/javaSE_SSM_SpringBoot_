package com.qmb.a3resource.controller;

import com.qmb.a2autowired.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {
    @Resource(name = "myUserService")
    private UserService userService;

    public void addUser()
    {
        System.out.println("UserController.....");
        userService.addUser();
    }
}
