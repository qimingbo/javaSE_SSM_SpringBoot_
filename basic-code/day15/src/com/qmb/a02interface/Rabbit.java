package com.qmb.a02interface;

public class Rabbit extends Animal {
    public Rabbit() {
    }

    public Rabbit(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }
}
