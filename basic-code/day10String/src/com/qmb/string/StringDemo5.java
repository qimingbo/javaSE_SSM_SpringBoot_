package com.qmb.string;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //练习1 统计一个键入字符串中小写字母、大写字母、数字的个数
        // 1、输入字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // 2、循环统计
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') smallCount++;
            else if(ch >= 'A' && ch <= 'Z') bigCount++;
            else if (ch >= '0' && ch <= '9') numberCount++;
        }
        // 3、输出结果
        System.out.println("大写字母个数:" + bigCount);
        System.out.println("小写字母个数:" + smallCount);
        System.out.println("数字个数:" + numberCount);
    }
}
