package com.qmb.a12deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    private static Lock lockA = new ReentrantLock();
    private static Lock lockB = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            if ("线程A".equals(Thread.currentThread().getName())  )
                synchronized (lockA) {
                    System.out.println("线程A获得A锁");
                    synchronized (lockB) {
                        System.out.println("线程A获得B锁");
                    }
                }
            else {
                synchronized (lockB) {
                    System.out.println("线程B获得B锁");
                    synchronized (lockA) {
                        System.out.println("线程B获得A锁");
                    }
                }
            }
        }
    }
}
