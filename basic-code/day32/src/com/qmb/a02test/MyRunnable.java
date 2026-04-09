package com.qmb.a02test;

public class MyRunnable implements Runnable {
    private int count = 100;

    @Override
    public void run() {
        while (true)
        {
            synchronized (MyRunnable.class)
            {
                if(count < 10) break;
                else{
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    System.out.println(Thread.currentThread().getName() + "送出礼物，剩余数量:" + count);
                }
            }
        }
    }
}
