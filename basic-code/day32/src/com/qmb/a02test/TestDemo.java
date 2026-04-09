package com.qmb.a02test;

public class TestDemo {
    public static void main(String[] args) {
        /*
            有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出，
            利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来.
        */
        // 第一种方式创建线程
/*        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        mt1.setName("小明");
        mt2.setName("小王");

        mt1.start();
        mt2.start();*/

        // 第二种方式创建线程
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr,"小明");
        Thread t2 = new Thread(mr,"小王");
        t1.start();
        t2.start();
    }
}
