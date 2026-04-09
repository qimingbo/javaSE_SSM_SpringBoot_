package com.qmb.test;

public class Test02Case1 {
    public static void main(String[] args) {
       /*
        练习2：给定两个字符串A和B,A的旋转操作是将A最左边的字符移到最右边。例如A="abcde",移动一次后位"bcdea"。
        经过若干次调整操作之后，A能变成B,则返回true。若不能返回false。
        */
       // 这个题目思路是自己自己写的，使用StringBuilder做的，课程中没有这种解法。
        // 1、定义字符串
       StringBuilder strA = new StringBuilder("abcde");
       StringBuilder strB = new StringBuilder("cdeab");
       // 2 、判断
        boolean result = check(strA, strB);

        // 3、输出结果
        System.out.println(result);
            }
       // 方法功能：移动字符串
    public static StringBuilder moveRightStr(StringBuilder str)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str.charAt(0)).deleteCharAt(0);
        return sb;
    }

    // 方法功能：判断一个字符串旋转后是否与另外一个字符串相同
    public static boolean check(StringBuilder strA, StringBuilder strB)
    {
        for (int i = 0; i < strA.length(); i++) {
            strA = moveRightStr(strA);
            if(strA.toString().equals(strB.toString())) return true;
        }
        return  false;
    }
        }

