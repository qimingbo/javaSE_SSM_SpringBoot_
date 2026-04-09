package com.qmb.a02exceptiontest;

import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        /*
        需求：键盘录入自己心仪的女朋友姓名和年龄。
            姓名的长度在3~10之间123
            年龄的范围为18-40岁，
            超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止。
            提示：需要考虑用户在键盘录入时的所有情况。
            比如：录入年龄时超出范围，录入年龄时录入了abc等情况
         */
        // 1.创建输入对象
        Scanner sc = new Scanner(System.in);
        // 2.创建女朋友对象
        GrilFriend1 gf = new GrilFriend1();
        while (true) {
            try {
                //3.输入女朋友名字
                System.out.println("请输入女朋友名字:");
                String name = sc.nextLine();
                //4.输入女朋友年龄
                System.out.println("请输入女朋友年龄:");
                String strAge = sc.nextLine();
                int age = Integer.parseInt(strAge);
                // 5.对象赋值
                gf.setName(name);
                gf.setAge(age);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }catch (RuntimeException e){
                e.printStackTrace();
            }
        }
        // 6.打印对象
        System.out.println(gf);
    }
}
