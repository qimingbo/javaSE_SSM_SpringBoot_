package com.qmb.a01math;

public class MathDemo1 {
    /*
        public static int abs(int a) 绝对值
        public static double ceil(double a) 向上取整
        public static double floor(double a) 向下取整
        public static int  round(float a) 四舍五入
        public static int max(int a, int b) 返回两数中的最大值
        public static double pow(double a, double b) 返回a的b次幂
        public static double random() 返回值为double的随机值，范围[0.0, 1.0)
     */
    public static void main(String[] args) {
        // 绝对值
        System.out.println(Math.abs(-88));
        System.out.println(Math.abs(88));
        // bug:
        // 以int为例子,取值范围:-2147483648-2147483647
        // 如果没有正数与之负数对应。那么传递负数结果有误
        // -2147483648没有与之对应的正数，所以abs会出现bug
        System.out.println(Math.abs(-2147483648));
        // 取到最小值的绝对值会抛出错误
//        System.out.println(Math.absExact(-2147483648));

        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));
    }
}
