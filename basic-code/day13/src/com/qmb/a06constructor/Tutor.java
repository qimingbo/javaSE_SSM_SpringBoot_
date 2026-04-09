package com.qmb.a06constructor;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("助教在工作");
    }
}
