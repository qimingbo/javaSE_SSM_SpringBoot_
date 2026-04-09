package com.qmb.test;

public class Test02 {
    public static void main(String[] args) {
        /* 给定两个数被除数和除数（都是正数不超过int的范围）
        将两数相除，要求不能用乘法、除法、取模运算
        得到商和余数
        被除数 / 除数 = 商 ...... 余数
        100 / 10 = 10 ......0
        90 - 10 =80
        80 - 10 =70
        70 - 10 =60
        60 - 10 =50
        50 - 10 =40
        40 - 10 =30
        ......
         */
        // 1、定义被除数
        int dividend = 10;
        // 2、定义除数
        int divisor = 3;
        // 3、定义商
        int count = 0;
        // 4、循环当被除数大于等于除数时执行
        while (dividend >=divisor)
        {
            dividend -= divisor;
            count++;
        }
        System.out.println("余数："+ dividend);
        System.out.println("商："+ count);
    }
}
