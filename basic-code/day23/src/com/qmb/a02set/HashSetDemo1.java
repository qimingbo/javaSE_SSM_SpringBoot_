package com.qmb.a02set;

import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args) {
        /*哈希值：对象的整数表现形式
            1.如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
            2.如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
            3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）
         */

        // 自定义类没有重写hashCode方法，默认哈希值是地址值.
        Student s1 = new Student("zhangsan",22);
        Student s2 = new Student("lisi",25);
        Student s3 = new Student("lisi",25);
        //ystem.out.println(s1); // com.qmb.a02set.Student@a09ee92
        //System.out.println(s2); // com.qmb.a02set.Student@30f39991
        //System.out.println(s3); // com.qmb.a02set.Student@452b3a41
        //System.out.println(s1.hashCode()); // 168423058(上面的地址是16进制的,这里是10进制，本质是一样的)
        //System.out.println(s2.hashCode()); // 821270929
        //System.out.println(s3.hashCode()); // 1160460865

        // 自定义类重写hashCode方法,不同的对象只要属性值相同，计算出的哈希值就是一样的
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println("---------------");

        // 但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
