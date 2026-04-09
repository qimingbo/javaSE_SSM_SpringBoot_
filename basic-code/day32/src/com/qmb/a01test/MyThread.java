package com.qmb.a01test;

public class MyThread extends Thread {
    private static int ticket = 1000;

    @Override
    public void run() {
        while (true)
        {
            synchronized (MyThread.class)
            {
                if(ticket == 0) break;
                else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket--;
                    System.out.println(getName() + "卖出电影票，剩余票数:" + ticket);
                }
            }
        }
    }
}
