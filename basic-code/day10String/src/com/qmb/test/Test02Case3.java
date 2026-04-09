package com.qmb.test;

public class Test02Case3 {
    public static void main(String[] args) {
       /*
        练习2：给定两个字符串A和B,A的旋转操作是将A最左边的字符移到最右边。例如A="abcde",移动一次后位"bcdea"。
        经过若干次调整操作之后，A能变成B,则返回true。若不能返回false。
        */
       // 1、定义字符串
       String strA = "abcde";
       String strB = "deabc";
       // 2 、判断
        boolean result = check(strA, strB);

        // 3、输出结果
        System.out.println(result);
            }
       // 方法功能：移动字符串
       // 两种方法：1、利用substring截取进行拼接
       // 2、string -> 字符数组(进行修改) -> string
    public static String moveRightStr(String str)
    {
        // 字符串转字符数组
        char[] chs = str.toCharArray();
        // 修改字符数组，把第一位移到最后一位
        char first = chs[0];
        for (int i = 0; i < chs.length - 1; i++) {
            chs[i] = chs[i+1];
        }
        chs[chs.length-1] = first;
        return new String(chs);
    }

    // 方法功能：判断一个字符串旋转后是否与另外一个字符串相同

    public static boolean check(String strA, String strB)
    {
        for (int i = 0; i < strA.length(); i++) {
            strA = moveRightStr(strA);
            if(strA.equals(strB)) return true;
        }
        return  false;
    }
        }

