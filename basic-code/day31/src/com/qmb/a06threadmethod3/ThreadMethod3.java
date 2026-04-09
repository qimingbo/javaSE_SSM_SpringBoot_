package com.qmb.a06threadmethod3;

public class ThreadMethod3 {
    public static void main(String[] args) {
        /*
            final void setDaemon(boolean on)    设置为守护线程
            细节：
                当其他的非守护线程执行完毕之后，守护线程会陆续结束
            通俗易懂：
                当女神线程结束了，那么备胎也没有存在的必要了
       */
        MyThread1 mt1 = new MyThread1();
        MyThread2 mt2 = new MyThread2();
        mt2.setDaemon(true);
        mt1.start();
        mt2.start();
    }
}
