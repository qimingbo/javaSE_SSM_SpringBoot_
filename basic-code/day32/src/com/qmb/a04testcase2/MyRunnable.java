package com.qmb.a04testcase2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyRunnable implements Runnable {
    private BigDecimal money = BigDecimal.valueOf(100.0);
    private int num = 3;
    private static final BigDecimal MIN = BigDecimal.valueOf(0.01);

    // 将这个方法改为精确小数
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
                    BigDecimal prize;
                    // 只剩一个红包
                    if(num == 1)
                    {
                        prize = money;
                    }
                    // 多余一个红包
                    else{
                        Random rd = new Random();
                        // 获取抽奖范围
                        double bound = money.subtract(BigDecimal.valueOf(num - 1).multiply(MIN)).doubleValue();
                        prize = BigDecimal.valueOf(rd.nextDouble(bound));
                    }
                    // 设置抽中红包，小数点保留两位，四舍五入
                    prize = prize.setScale(2, RoundingMode.HALF_UP);
                    //在总金额中去掉对应的钱
                    money = money.subtract(prize);
                    //红包少了一个
                    num--;
                    System.out.println(Thread.currentThread().getName() + "抢到了" + prize + "元");
                }

            }
    }

}
