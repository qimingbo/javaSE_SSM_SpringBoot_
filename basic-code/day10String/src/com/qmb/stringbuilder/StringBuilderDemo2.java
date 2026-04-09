package com.qmb.stringbuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder();
       // StringBuilder的默认容量是16，length是实际存储的长度
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // 添加元素
        sb.append("abcdefghijklmnopqrstuvwxyz123456789");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // 添加到超过默认扩容数
//        sb.append("123456789");
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());



    }


}
