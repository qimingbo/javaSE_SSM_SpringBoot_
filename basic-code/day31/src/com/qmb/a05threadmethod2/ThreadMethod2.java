package com.qmb.a05threadmethod2;

public class ThreadMethod2 {
    public static void main(String[] args) {
         /*
            setPriority(int newPriority)        设置线程的优先级
            final int getPriority()             获取线程的优先级
            优先级范围是1-10,默认是5
       */
        System.out.println(Thread.currentThread().getPriority());
        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr,"线程1");
        Thread t2 = new Thread(mr,"线程2");
        t1.setPriority(9);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
