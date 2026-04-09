package com.qmb.polymorphism01;

public class Test {
    public static void main(String[] args) {
        // 演示多态调用变量和方法的不同之处
        // 变量调用：编译看左边，运行也看左边
        // 方法调用：编译看左边，运行看右边
        Animal a = new Dog();
        Dog d = new Dog();
        System.out.println(a.name);
        a.aaa();
        d.aaa();

    }
}
