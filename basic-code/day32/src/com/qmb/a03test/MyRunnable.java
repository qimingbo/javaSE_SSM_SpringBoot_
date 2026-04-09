package com.qmb.a03test;

public class MyRunnable implements Runnable {
    private int num = 1;
    @Override
    public void run() {
        while (true){
            synchronized (MyRunnable.class)
            {
                if(num > 100) break;
                else {
                    if(num % 2 != 0)
                    {
                        System.out.println(Thread.currentThread().getName() + "执行：" + num);
                    }
                    num++;
                }
            }
        }
    }
}
