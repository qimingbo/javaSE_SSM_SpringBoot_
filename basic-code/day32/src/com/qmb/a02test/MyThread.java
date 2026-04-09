package com.qmb.a02test;

public class MyThread  extends Thread{
    private static int count = 100;

    @Override
    public void run() {
        while (true)
        {
            synchronized (Thread.class)
            {
                if(count < 10) break;
                else{
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                    System.out.println(getName() + "送出礼物，剩余数量:" + count);
                }
            }
        }
    }
}
