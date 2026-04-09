package com.qmb.a04object;


import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // protected object clone(int a)  对象克隆

        // 1.先创建一个对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        User u1 = new User(1, "qimingbo", "123", "girl11", data);

        // 2.克隆一个对象
        // 细节：方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去。
        // 书写细节：
        // 1.重写Object类中的clone()方法
        // 2.让javabean类实现cloneable接口
        User u2 = (User) u1.clone();
        int[] arr = u1.getData();
//        arr[0]  = 100;

        // 3. 打印两个对象
        System.out.println(u1);
        System.out.println(u2);
        System.out.println("第三方工具类来完成深克隆");
        // 使用第三方工具类来深克隆深克隆对象 gson
        // 1.创建对象
        Gson gs = new Gson();
        // 2.讲被克隆对象转为字符串
        String str = gs.toJson(u1);
        // 3.将字符串变为对象
        User u3 = gs.fromJson(str, User.class);
        arr[0]  = 100;
        System.out.println(u1);
        System.out.println(u3);

    }
}
