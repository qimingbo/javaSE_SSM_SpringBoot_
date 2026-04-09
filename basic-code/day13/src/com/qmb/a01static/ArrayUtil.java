package com.qmb.a01static;

import java.util.StringJoiner;

/*
 请按照如下要求编写一个数组的工具类：ArrayUtil
 提供一个工具类方法printArr,用于返回整数数组的内容。返回的字符串格式如：「10,20,50,34,100]（只考虑整数数组，且只考虑一维数组)》
 提供这样一个工具方法getAverage,用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
 定义一个测试类TestDemo,调用该工具类的工具方法，并返回结果。
 **/
public class ArrayUtil {
    // 私有化构造方法，避免外界创建对象。
    private ArrayUtil(){};

    // 方法定义为静态的
    public static String printArr(int[] arr){
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add("" + arr[i]);
        }
        return sj.toString();
    }

    public static double getAverage(double[] arr){
        double sum = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        return sum / len;
    }
}
