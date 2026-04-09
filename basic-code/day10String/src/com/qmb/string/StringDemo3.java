package com.qmb.string;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1、从键盘输入abc
        String s1 = sc.next();
        // 2、创建字符串赋值abc
        String s2 = "abc";
        // 3、输出地址比较结果
        System.out.println(s1 == s2);//false，为什么呢

    }
}
