package com.qmb.controller;

import com.qmb.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // 方式1 @value
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    @Value("${address[0]}")
    private String address;
    @Value("${msg1}")
    private String msg1;
    @Value("${msg2}")
    private String msg2;
    // 方式2 Environment
    @Autowired
    private Environment environment;
    // 方式3
    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("name=>" + name);
        System.out.println("age=>" + age);
        System.out.println("address=>" + address);
        System.out.println("msg1=>" + msg1);
        System.out.println("msg2=>" + msg2);
        System.out.println("--------------");
        System.out.println(environment.getProperty("name"));
        System.out.println(environment.getProperty("person.name"));
        System.out.println(environment.getProperty("person.age"));
        System.out.println("--------------");
        System.out.println(person);
        return "Hello SpringBoot222";
    }
}
