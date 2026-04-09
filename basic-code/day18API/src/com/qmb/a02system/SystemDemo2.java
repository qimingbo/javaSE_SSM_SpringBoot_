package com.qmb.a02system;

public class SystemDemo2 {
    public static void main(String[] args) {
        // public static void arraycopy(源数据,起始索引,目标数组,起始索引,拷贝个数)  拷贝数组
        // 细节：
        // 1.如果数据源数组和目标数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        // 2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        // 3.如果源数组和目标数组都是引用数据类型，那么子类类型可以赋值给父类类型

        Student s1 = new Student("zhangsan", 20);
        Student s2 = new Student("lisi", 22);
        Student s3 = new Student("wangwu", 25);
        Student[] arr1 = {s1, s2, s3};
        Person[] arr2 = new Person[3];
        // 把arr1中的对象的地址值赋值给arr2
        System.arraycopy(arr1,0, arr2, 0,3);
        for(Person s : arr2){
            System.out.println(s.getName()+"," + s.getAge());
        }
    }
}


class Person{
    private  String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

}
