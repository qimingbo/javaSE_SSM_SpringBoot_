package com.qmb.a12deadlock;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("线程A");
        mt2.setName("线程B");

        mt1.start();
        mt2.start();
    }
}
