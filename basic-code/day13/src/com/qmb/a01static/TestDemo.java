package com.qmb.a01static;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 50, 34, 200};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);

        double[] arr2 = {10.0, 20.0, 30.0, 100.0};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
