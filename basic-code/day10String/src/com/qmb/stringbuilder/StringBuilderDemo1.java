package com.qmb.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        // StringBuilder 相当于一个容器
        StringBuilder sb = new StringBuilder();
        // 添加元素
        sb.append(1);
        sb.append(2.4);
        sb.append(true);
        sb.append("abc");

        // 反转
        sb.reverse();

        //
        System.out.println(sb);
        // 转为字符串
        System.out.println(sb.toString());



    }


}
