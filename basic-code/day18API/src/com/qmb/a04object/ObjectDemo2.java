package com.qmb.a04object;

public class ObjectDemo2 {
    public static void main(String[] args) {
        // public boolean equals(object obj)  比较两个对象是否相等

        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("zhangsan",20);

        boolean result = s1.equals(s2);
        System.out.println(result);
    }
}
