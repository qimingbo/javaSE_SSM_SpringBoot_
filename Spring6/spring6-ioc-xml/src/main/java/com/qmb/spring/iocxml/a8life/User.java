package com.qmb.spring.iocxml.a8life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class User{
    private String name;
    private int age;


    public User() {
        System.out.println("1.无参构造执行...");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        System.out.println("2.依赖注入...");
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 初始化方法
    public void initMethod()
    {
        System.out.println("4.初始化方法执行...");
    }

    // 销毁方法
    public void destroyMethod()
    {
        System.out.println("7.销毁方法执行");
    }


}
