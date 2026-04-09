package com.qmb.a03interface;

public class BasketballCoach extends Coach {

    public BasketballCoach(){}

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教篮球");
    }
}
