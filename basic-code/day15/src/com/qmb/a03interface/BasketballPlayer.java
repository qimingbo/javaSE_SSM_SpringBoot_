package com.qmb.a03interface;

public class BasketballPlayer extends Player {

    public BasketballPlayer(){}

    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void learn() {
        System.out.println("学习打篮球");
    }
}
