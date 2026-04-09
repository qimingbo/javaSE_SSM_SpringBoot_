package com.qmb.a04testcase1;

import java.util.Random;

public class MyRunnable implements Runnable {
    private double money = 100.0;
    private int num = 3;
    private static  final double MIN = 0.01;

    @Override
    public void run() {
        // 同步代码块
            synchronized (MyRunnable.class) {
                // 没有红包
                if (num == 0) {
                    System.out.println(Thread.currentThread().getName() + "没有抢到");
                }
                // 还有红包
                else {
                    double prize = 0;
                    // 只剩一个红包
                    if(num == 1)
                    {
                        prize = money;
                    }
                    // 多余一个红包
                    else{
                        Random rd = new Random();
                        double bound = money - (num - 1) * MIN;
                        prize = rd.nextDouble(bound);
                        if(prize < MIN) prize = MIN;
                    }
                    num--;
                    money -= prize;
                    System.out.println(Thread.currentThread().getName() + "抢到了" + prize + "元");
                }

            }
    }

}
