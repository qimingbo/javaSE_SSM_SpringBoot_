package com.qmb.method;

public class Test02 {
    public static void main(String[] args) {

        double a = 10.0;
        double b= 15.24;
        System.out.println(getMin(a, b));
    }


    // 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
    public static double getMin(double a, double  b)
    {
        return  a < b ? a : b;
    }
}
