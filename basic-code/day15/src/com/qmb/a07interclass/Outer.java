package com.qmb.a07interclass;

public class Outer  {
        int a = 10;
        static int b = 20;

    static class Inner{
        public void show1(){
            System.out.println(b);
            System.out.println("非静态方法被调用");
        }
        public static void show2(){
            System.out.println("静态方法被调用");
        }
    }
}
