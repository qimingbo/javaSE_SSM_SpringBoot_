package com.qmb.string;

public class StringDemo6 {
    public static void main(String[] args) {
        // 练习2 定义一个方法，把int数组中的数据按照一定格式拼接成一个字符串返回，调用该方法，并在控制台输出结果
        // 例如 数组为int[] arr={1, 2, 3}    执行方法后的输出结果为{1, 2, 3}
        int[] arr = {1, 2, 3, 4, 5};
        // 定义字符串
        String str = "{";
        for (int i = 0; i < arr.length; i++) {

            if(i == arr.length-1) str += arr[i] + "}";
            else str += arr[i] + ", ";
        }
        System.out.println(str);
    }
}
