package com.qmb.method;

public class Test03 {
    public static void main(String[] args )
    {
        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println(getMax(a, b, c));
    }

    // 定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行。
    // 定义方法getMax()，方法的参数是三个int类型变量a,b,c，方法的返回值是int类型。
    public static int getMax(int a, int b, int c)
    {
        int max = a;
        if(max < b)
            max = b;
        if (max < c)
            max = c;
        return max;
    }
}
