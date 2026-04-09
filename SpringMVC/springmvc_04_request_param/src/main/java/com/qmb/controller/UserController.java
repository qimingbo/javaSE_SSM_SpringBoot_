package com.qmb.controller;

import com.qmb.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    // 接收普通类型
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name,String age)
    {
        System.out.println("user save...");
        System.out.println("name=> " + name );
        System.out.println("age=> " + age );
        return "{'info':springmvc}";
    }

    // 普通类型-不同名参数
    @RequestMapping("/differentParamName")
    @ResponseBody
    public String differentParamName(@RequestParam("name") String userName, String age)
    {
        System.out.println("name=> " + userName );
        System.out.println("age=> " + age );
        return "{'info':springmvc}";
    }

    // 接收pojo类型
    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user)
    {
        System.out.println(user);
        return "{'info':springmvc}";
    }

    // 接收复合pojo类型
    @RequestMapping("/pojoContainParam")
    @ResponseBody
    public String pojoContainParam(User user)
    {
        System.out.println(user);
        return "{'info':springmvc}";
    }

    // 接收数组类型的参数
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] ids)
    {
        System.out.println(Arrays.toString(ids));
        return "{'info':springmvc}";
    }

    // 接收集合类型的参数
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<Integer> ids)
    {
        System.out.println(ids);
        return "{'info':springmvc}";
    }


    // 日期参数 在框架中的格式是yyyy/mm/dd hh:mm:ss
    @RequestMapping("/dateParam")
    @ResponseBody
    public String dateParam(Date date,@DateTimeFormat(pattern = "yyyy-mm-dd hh:mm:ss") Date date1)
    {
        System.out.println(date);
        System.out.println(date1);
        return "{'info':springmvc}";
    }

    // 接收json类型的参数,只能用@RequestBody
    // 1.接收json数组
    @RequestMapping("/jsonArrayParam")
    @ResponseBody
    public String jsonArrayParam(@RequestBody String[] str)
    {
        System.out.println("str=> " + Arrays.toString(str));
        return "{'info':springmvc}";
    }

    // 2.接收json polo对象
    @RequestMapping("/jsonPoloParam")
    @ResponseBody
    public String jsonPoloParam(@RequestBody User user)
    {
        System.out.println(user);
        return "{'info':springmvc}";
    }

    // 2.接收json polo对象
    @RequestMapping("/jsonListParam")
    @ResponseBody
    public String jsonListParam(@RequestBody List<User> list) {
        System.out.println(list);
        return "{'info':springmvc}";
    }


}
