package com.qmb.test;

import java.util.Random;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        /* 需求：生成验证码
        内容可以是小写字母、大写字母、数字
        规则：长度为5,内容位4个字母，1个数字，数字位置任意
        * */
        // 整体思路：先生成固定格式的验证码再随机打乱
        // 1、定义大小写字母数组
        char[] chs = new char[52];
        // 验证码存储数组
        char[] code = new char[5];
        // 2、存储52个大小写祖母
        for (int i = 0; i < 52; i++) {
            if(i < 26) chs[i] = (char)('A' + i);
            else chs[i] = (char)('a' + i - 26);
        }
        // 3、前四位存储字母
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            int index = rd.nextInt(52);
            code[i] = chs[index];
        }
        //4、 最后一位存储数字
        code[4] = (char)(rd.nextInt(10) + '0');
        System.out.println(new String(code));
        // 5、 打乱验证码
        for (int i = 0; i < code.length; i++) {
            int j = rd.nextInt(5);
            char temp = code[i];
            code[i] = code[j];
            code[j] = temp;
        }
        System.out.println(new String(code));
    }
}
