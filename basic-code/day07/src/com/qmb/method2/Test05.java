package com.qmb.method2;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        // 需求：数字加密 某系统的数字密码（大于0），比如1983，采用加密方式进行传输。先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。

        // 1、定义一个变量，接收键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字: ");
        int num = sc.nextInt();
        // 2、加密过程
        System.out.println("输出结果是: ");
        while (true)
        {
            // ge从右到左依次记录各个位
            int ge = num % 10;
            // 加密
            ge = (ge + 5) % 10;
            // 去除个位数
            num = num / 10;
            // 加密有反转，所以先输出个位
            System.out.print(ge);
            // 循环跳出条件
            if(num == 0) break;
        }
    }
}
