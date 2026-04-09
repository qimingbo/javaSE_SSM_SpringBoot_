package com.qmb.a04function;

import java.util.Arrays;
import java.util.Comparator;

public class FunctionDemo1 {
    public static void main(String[] args) {
        // 方法引用
        //需求：创建一个数组，进行倒序排列
        Integer[] arr = {3, 5, 4, 1, 6, 2};
        // Arrays.sort(插入排序 + 二分查找)
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
        // Lambda表达式
        Arrays.sort(arr, ((o1, o2) -> o2 - o1));
        System.out.println(Arrays.toString(arr));
        // 方法引用
        Arrays.sort(arr, FunctionDemo1::sort);
        System.out.println(Arrays.toString(arr));
    }



    public static int sort(int o1, int o2)
    {
        return o2 - o1;
    }
}
