package com.qmb.a07threadmethod4;

public class ThreadMethod4 {
    public static void main(String[] args) {
        /*
            public static void yield()      出让线程/礼让线程(了解)
       */
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("线程1");
        mt2.setName("线程2");

        mt1.start();
        mt2.start();

    }
}
