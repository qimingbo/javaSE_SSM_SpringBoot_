package com.qmb.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {

        // 创建对象,以"---"为分隔符
        StringJoiner sj = new StringJoiner("---");
        // 添加元素
        sj.add("aaa").add("bbb").add("ccc");

        // 转为字符串
        String s = sj.toString();

        System.out.println(s);
    }


}
