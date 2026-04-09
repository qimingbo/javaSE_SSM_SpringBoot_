package com.qmb.polymorphism02;

public class Person {
    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void keepPet(Animal animal, String something){
        if(animal instanceof Dog) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getColor() + "颜色的" + animal.getAge() + "的狗");
            Dog dog = (Dog) animal;
            dog.eat(something);
        }
        else if(animal instanceof Cat) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + animal.getColor() + "颜色的" + animal.getAge() + "的猫");
            Cat cat = (Cat) animal;
            cat.eat(something);
        }
        else System.out.println("没有这种动物");
    }
}
