package com.qmb.controller;

import com.qmb.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    // 跳转页面
    @RequestMapping("/toJumpPage")
    public String toJumpPage()
    {
        System.out.println("page.jsp");
        return "page.jsp";
    }

    // 响应文本数据
    @RequestMapping("/toText")
    @ResponseBody
    public String toText()
    {
        System.out.println("返回文本数据");
        return "response text";
    }
    // 响应pojo对象
    @RequestMapping("/toJsonPojo")
    @ResponseBody
    public User toJsonPojo()
    {
        User user = new User("zhangsan",20);
        System.out.println("返回Pojo对象");
        return user;
    }
}
