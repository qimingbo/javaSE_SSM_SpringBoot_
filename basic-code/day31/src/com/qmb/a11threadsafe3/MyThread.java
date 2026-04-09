package com.qmb.a11threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread  extends Thread{
    private static  int ticket = 0;
    // 锁对象
    private static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {

                    Thread.sleep(100);
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
