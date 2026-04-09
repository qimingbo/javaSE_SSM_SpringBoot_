package com.qmb.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        // 学习字符串的split
        String str = ",a,b,,c,,";
        // limit 有三种情况，
        // 1、默认不写为0,分割所有匹配项，但会去除末尾的空字符串。
        // 2、大于0，最多分割limit - 1次，数组长度最多为limit。
        // 3、小于0，分割所有匹配项，包括末尾的空字符串。

        String[] arr1 = str.split(",", 0);
        String[] arr2 = str.split(",", 6);
        String[] arr3 = str.split(",", 7);
        String[] arr4 = str.split(",", -1);
        System.out.println(Arrays.toString(arr1));
    }





}
