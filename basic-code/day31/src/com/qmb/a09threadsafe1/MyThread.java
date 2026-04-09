package com.qmb.a09threadsafe1;

public class MyThread extends Thread {
    private static int ticket = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if(ticket < 100)
                {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "票");
                }
                else {
                    break;
                }
            }
        }
    }
}

