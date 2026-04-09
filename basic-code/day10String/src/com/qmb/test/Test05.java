package com.qmb.test;

import javax.sound.midi.Soundbank;

public class Test05 {
    public static void main(String[] args) {
        /* 需求：给定两个字符串形式表示的非负整数num1和num2的乘积，它们的乘积也用字符串表示。
        不需要考虑乘积过大之后的结果
        默认乘积一定小于int的最大值
        * */
        // 1、定义两个字符串
        String str1 = "9999";
        String str2 = "123456789";
        // 2、字符串转数字
        int strNum1 = strToInt(str1);
        int strNum2 = strToInt(str2);
        System.out.println(strNum1);
        System.out.println(strNum2);
        // 3、计算结果
        long result = (long)strNum1 * strNum2;
        System.out.println(result);
    }

    // 方法功能：将数字字符串转为整型
    public static int strToInt(String str)
    {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ge = ch - '0';
            num  = num * 10 + ge;
        }
        return num;
    }
}
