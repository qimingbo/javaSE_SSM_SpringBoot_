package com.qmb.a09threadsafe1;

public class ThreadDemo {
    public static void main(String[] args) {
        /*
           需求：
                某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
       */
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("窗口1");
        mt2.setName("窗口2");
        mt3.setName("窗口3");

        mt1.start();
        mt2.start();
        mt3.start();
    }
}
