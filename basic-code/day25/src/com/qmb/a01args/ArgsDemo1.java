package com.qmb.a01args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        // JDK5引入的
        // 可变参数，方法的参数可以发生变化的 0,1,2,3,4,5
        // 格式:属性类型 ... 变量名字
        getSum(1,23,2);
    }

    // 底层:
    // 可变参数底层就是一个数组
    // 只不过不需要我们自己创建了，Java会帮我们创建好
    public static int getSum(int ...num){
        return 0;
    }
}
