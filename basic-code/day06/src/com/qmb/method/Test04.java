package com.qmb.method;
import java.util.Scanner;
public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printNum(a, b, c);
    }

    // 在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量
    public static void printNum(int a, int b, int c)
    {
        int max = a;
        int min = a;
        max = max < b ? b : max;
        max = max < c ? c : max;
        min = min > b ? b : min;
        min = min > c ? c : min;
        System.out.print(max + " ");
        System.out.print(a+b+c-max-min + " ");
        System.out.println(min);
    }

}
