package com.qmb.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {

        // 1、创建对象,以"---"为分隔符,"[","]"
        StringJoiner sj = new StringJoiner("---","[", "]");
        // 2、添加元素
        sj.add("aaa").add("bbb").add("ccc");

        // 3、转为字符串
        String s = sj.toString();

        System.out.println(s);
    }


}
