package com.qmb.a2autowired.controller;

import com.qmb.a1annotation.User;
import com.qmb.a2autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller()
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;
    // 1.写在字段上
    /*@Autowired
    private UserService userService;*/


     // 2.写在setter上
    /*@Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }*/

    // 3.写在构造器上
/*    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }*/

    // 4.写在形参上
    /*public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }*/

    // 5.只有一个构造方法时可以省略
/*    public UserController(UserService userService) {
        this.userService = userService;
    }*/


    public void addUser()
    {
        System.out.println("UserController.....");
        userService.addUser();
    }
}
