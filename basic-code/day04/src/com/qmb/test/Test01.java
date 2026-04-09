package com.qmb.test;

public class Test01 {
    public static void main(String[] args) {
        // 回文数：一个数正着和反着是同一个数。
        // 1、定义一个数
        int a = 121;
        int num = 0;
        int temp = a;
        // 2、
        while(a != 0) {
            // 从右向左依次获得每个数
            int ge = a % 10;
            a = a / 10;
            // 把当前的数拼接到最右边
            num = num * 10 + ge;
        }
        if(temp == num)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
