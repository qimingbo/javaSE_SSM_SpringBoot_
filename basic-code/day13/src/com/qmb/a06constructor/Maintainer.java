package com.qmb.a06constructor;

public class Maintainer extends AdminStaff {
    public Maintainer() {
    }

    public Maintainer(String id, String name, String job) {
        super(id, name, job);
    }

    @Override
    public void work() {
        System.out.println("维护专员在工作");
    }
}
