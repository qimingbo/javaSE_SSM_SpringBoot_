package com.qmb.string;

public class StringDemo9 {
    public static void main(String[] args) {
        //  练习5 手机号的屏蔽：18338268981 ——> 183****8981
        // 1、获取一个手机号
        String str = "18338268981";
        // 2、截取前3位
        String strart = str.substring(0,3);
        // 3、截取后四位
        String end = str.substring(7, 11);
        // 4、拼接
        String result = strart + "****" + end;
        // 5、输出
        System.out.println(result);
    }
}
