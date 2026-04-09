package com.qmb.a01threadcase1;

import com.qmb.a01threadcase1.MyThread;

public class ThreadCase1 {
    public static void main(String[] args) {
        /*
           创建多线程的第一种方式：
           1.定义一个类继承Thread类
           2.重写run方法
           3.创建子类对象
           4.启动线程
         */
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("线程1");
        mt2.setName("线程2");

        mt1.start();
        mt2.start();
    }
}
