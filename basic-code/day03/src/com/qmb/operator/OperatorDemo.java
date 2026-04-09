package com.qmb.operator;

public class OperatorDemo {
    public static void main(String[] args) {
        // 扩展复制运算符包含了隐式转换
        byte a = 10;
        byte b = 20;
        // a += b
        a = (byte) (a + b);
        System.out.println(a);
    }
}
