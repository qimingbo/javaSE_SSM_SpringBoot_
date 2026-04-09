package com.qmb.string;

import java.sql.SQLOutput;

public class StringDemo1 {
    public static void main(String[] args) {
        // 字符串的创建方式，总的来说是两类。
        // 但是内部创建的过程是不同的，可以分为三类,s1, s2, (s3 s4)。

        //字面量直接赋值
        String s1 = "abc";
        //new 一个字符串
        String s2 = new String("abc");
        // new字符数组为字符串
        char[] ch1 = {'a','b','c'};
        String s3 = new String(ch1);
        // new byte数组，是字符串对应的ASCII。
        byte[] ch2 ={97, 98, 99};
        String s4 = new String(ch2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
