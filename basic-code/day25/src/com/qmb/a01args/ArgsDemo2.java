package com.qmb.a01args;

public class ArgsDemo2 {
    public static void main(String[] args) {
        // 可变参数的小细节:
        // 1.在方法的形参中最多只能写一个可变参数
        // 2.在方法中，除了可变参数外还有其他的形参，那么形参要写在可变参数前面
        getSum(1,2,3,4,5,6,7,8,9,10);
    }

    // 底层:
    // 可变参数底层就是一个数组
    // 只不过不需要我们自己创建了，Java会帮我们创建好
    public static int getSum(int ...num)
    {
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        return 0;
    }
}
