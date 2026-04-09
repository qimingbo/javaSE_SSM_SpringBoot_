package com.qmb.a02threadcase2;

public class MyRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " hello world " + i);
        }
    }
}
