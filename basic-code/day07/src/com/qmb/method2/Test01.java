package com.qmb.method2;

public class Test01 {
    public static void main(String[] args) {
        double discountPrice = getPrice(1000, 2 ,1);
        System.out.println(discountPrice);
    }

    //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱(1)或经济舱(0)。
    //​	按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折。
    public static double getPrice(double price, int month, int seat)
    {
        double discoutPrice = 0;
        if(month>=5 && month <= 10)
        {
            if(seat == 1)
                discoutPrice = price * 0.9;
            else discoutPrice = price * 0.85;
        }
        else if(seat == 1)
            discoutPrice = price * 0.7;
            else discoutPrice = price * 0.65;
            return discoutPrice;
    }
}
