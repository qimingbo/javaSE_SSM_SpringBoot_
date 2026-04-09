package com.qmb.controller;

import com.qmb.entity.User;
import org.springframework.web.bind.annotation.*;

/*
@Controller
@ResponseBody
*/
@RestController
@RequestMapping("/users")
public class UserController {

    // 查询全部
//  @RequestMapping(value = "/users",method = RequestMethod.GET)
    @GetMapping()
    public String selectAll()
    {
        return "{'info':selectAll complete}";
    }

    // 查询 按id
//    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String selectById(@PathVariable int id)
    {
        System.out.println("id=>" + id);
        return "{'info':selectById complete}";
    }

    // 添加
//    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @PostMapping()
    public  String  add(@RequestBody User user)
    {
        System.out.println(user);
        return "{'info':save complete}";
    }

    // 修改 按id
//    @RequestMapping(value = "/users/{id}",method = RequestMethod.PUT)
    @PutMapping()
    public String update(@RequestBody User user)
    {
        System.out.println(user);
        return "{'info':update complete}";
    }

    // 删除 按id
//    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id)
    {
        System.out.println("id=>" + id);
        return "{'info':delete complete}";
    }
}
