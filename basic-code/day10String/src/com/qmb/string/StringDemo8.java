package com.qmb.string;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        // 练习4 金额转换:键盘输入一个不超过七位的数字，把他转换为中文格式，比如3215 ---->零佰零拾零万叁仟贰佰壹拾伍元
        // 1、输入一个数字
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 2、定义数组和输出字符串
        // 索引对应数字 0 -> 零
        char[] chs= {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '镹'};
        // 单位
        char[] chs2 = {'佰', '拾', '万', '仟', '佰', '拾', '元'};
        String str = "";
        String result = "";
        // 3、 依次取出各位
        while (true){
            int ge = num % 10;
            num /= 10;
            str = chs[ge] + str;
            if(num == 0) break;
        }
        int len = str.length();
        // 4、补齐前面的零
        for (int i = 0; i < 7 - len; i++) {
            str = '零' + str;
        }
        // 5、拼接单位
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            result = result + ch + chs2[i];
        }
        System.out.println(result);


    }
}
