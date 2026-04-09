package com.qmb.test;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 需求：输入一个字符串，打乱里面的内容

        // 1、输入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        // 2、string -> char[] ,从i开始，随机产生数字0-str.length()-1的数字进行交换。
        char[] chs = str.toCharArray();
        Random rd = new Random() ;
        int len = chs.length;
        for (int i = 0; i < chs.length; i++) {
            int j = rd.nextInt(0,len);
            char temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
        }
        // 3、char[] -> String   并输出
        str = new String(chs);
        System.out.println(chs);

    }
}
