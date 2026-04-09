package com.qmb.a08threadmethod5;

public class ThreadMethod5 {
    public static void main(String[] args) throws InterruptedException {
        /*
            public final void join()  插入线程/插队线程(了解)
       */
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();



        mt1.start();
        mt1.join();
        mt2.start();
    }
}
