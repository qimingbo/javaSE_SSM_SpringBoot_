package com.qmb.a04object;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
        public string tostring()  返回对象的字符串表示形式
        public boolean equals(object obj)  比较两个对象是否相等
        protected object clone(int a)  对象克隆
        */

        // 1.toString()
        Object obj = new Object();
        System.out.println(obj);//java.lang.Object@2a84aee7
        // 重写toString
        Student s1 = new Student("zhangsan",20);
        System.out.println(s1);
        // 细节
        // System：类名
        // out:静态变量
        // System.out:获取打印的对象
        // println:方法
        // 核心逻辑：当我们打印一个对象时，底层会调用对象的toString方法,把对象变成字符串，然后再打印在控制台上，打印完后进行换行。
    }
}
