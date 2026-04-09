package com.qmb.test;

import java.util.Scanner;

public class Test01Case2 {
    public static void main(String[] args) {
        // 要求：输入一个字符串，长度不超过九位，只能是数字，将内容转为罗马数字，最后输出；
        // 0没有对应罗马数字，用""代替
        // 1、Ⅰ、Ⅱ、Ⅲ、Ⅳ、Ⅴ、Ⅵ、Ⅶ、Ⅷ、Ⅸ
        Scanner sc = new Scanner(System.in);
        String str ="";
        while (true)
        {
            System.out.println("请输入一个不超过9位的数字：");
            str = sc.next();
            boolean flag = checkInput(str);
            if(flag)
                break;
            else
                System.out.println("不符合要求");
        }

        StringBuilder sb = new StringBuilder();

        // 2 、使用StringBuilder进行字符串拼接
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i) -'0';
            sb.append(toRoman(index));
        }
        System.out.println(sb.toString());
    }

    // 检查输入是否合法
    public static boolean checkInput(String str)
    {
        if(str.length() > 9) return false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch < '0' || ch >'9') return false;
        }
        return  true;
    }
    // 数字转罗马数字
    public static String toRoman(int num)
    {
//        // Ⅰ、Ⅱ、Ⅲ、Ⅳ、Ⅴ、Ⅵ、Ⅶ、Ⅷ、Ⅸ
//        String str = switch (num){
//            case 0 -> "";
//            case 1 -> "Ⅰ";
//            case 2 -> "Ⅱ";
//            case 3 -> "Ⅲ";
//            case 4 -> "Ⅳ";
//            case 5 -> "Ⅴ";
//            case 6 -> "Ⅵ";
//            case 7 -> "Ⅶ";
//            case 8 -> "Ⅷ";
//            case 9 -> "Ⅸ";
//            default ->"";
//        };
        return null;
    }

}
