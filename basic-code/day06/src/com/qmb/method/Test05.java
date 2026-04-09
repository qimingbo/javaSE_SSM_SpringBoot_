package com.qmb.method;

public class Test05 {
    public static void main(String[] args) {
        double num = -12.056;
        System.out.println(getAbsoluteValue(num));
    }

    //数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。
    public static double getAbsoluteValue(double num)
    {
        if(num < 0)
            return 0-num;
        else return num;
    }
}
