package com.qmb.a02interface;

public  abstract class Animal {
    private String name;
    private String age;

    // 抽象方法
    public abstract void eat();

    public Animal() {}

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void show(){
        System.out.println("show方法");
    }
}
