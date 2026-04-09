package com.qmb.a01test;

public class TeddyDog extends Dog {
    public TeddyDog() {
    }

    public TeddyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("一只叫"+getName()+"的，"+getAge()+"岁的泰迪，正在吃骨头，边吃边蹭");
    }
}
