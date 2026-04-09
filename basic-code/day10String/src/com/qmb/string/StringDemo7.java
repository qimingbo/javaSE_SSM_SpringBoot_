package com.qmb.string;

public class StringDemo7 {
    public static void main(String[] args) {
        // 练习3 字符串反转
        // 定义一个方法，实现字符串的反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
        String str = "abcdefg";
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
