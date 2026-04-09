package com.qmb.a01test;

public class HuskyDog extends Dog {
    public HuskyDog() {
    }

    public HuskyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫做"+getName()+"的，X"+getAge()+"岁的哈士奇，正在吃骨头，边吃边拆家");
    }
}
