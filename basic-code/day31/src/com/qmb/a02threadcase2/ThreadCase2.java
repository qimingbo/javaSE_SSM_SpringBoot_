package com.qmb.a02threadcase2;

public class ThreadCase2 {
    public static void main(String[] args) {
        /*
            多线程的第二种创建方式:
            1.创建一个类实现Runable接口
            2.实现run方法
            3.创建Thread对象
            4.启动线程
         */
        MyRun mr1 = new MyRun();

        Thread t1 = new Thread(mr1,"线程1");
        Thread t2 = new Thread(mr1,"线程2");

        t1.start();
        t2.start();


    }
}
