package com.qmb.method2;

import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        getCode();
    }

    /* 定义方法实现随机产生一个5位的验证码
     验证码格式：
     长度为5
     前四位是大写字母或者小写字母
    ​最后一位是数字
    */
    public static void getCode()
    {
        // ASCII码 A = 65，'a' = 97
        // 1.创建数组存储26个字母大小写
        char[] ch1 = new char[52];
        // 定义随机类对象
        Random rd = new Random();
        // 定义输出字符串
        String codeStr = "";
        // 2.循环存储字母
        for (int i = 0; i < ch1.length; i++) {
            if(i < 26){
                // 添加大写字母
                ch1[i] = (char) ('A' + i);
            }
            else
                // 添加小写字母
                ch1[i] = (char) ('a' + i - 26);
        }
        // 3.随机生成4次索引
        for (int i = 0; i < 4; i++) {
            int randomIndex = rd.nextInt(52);
            codeStr += ch1[randomIndex];
        }
        // 4.拼接最后一位数字
        codeStr += rd.nextInt(10);
        System.out.println(codeStr);




    }
}
