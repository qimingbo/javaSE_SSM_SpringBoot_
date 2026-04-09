package com.qmb.polymorphism02;

public class Test {
    // 多态综合练习
    public static void main(String[] args) {
        Animal animal1 = new Dog(2, "黑");
        Person p1 = new Person("老王", 30);
        p1.keepPet(animal1, "骨头");

        Animal animal2 = new Cat(3, "灰");
        Person p2 = new Person("老李", 25);
        p2.keepPet(animal2, "鱼");
    }
}
