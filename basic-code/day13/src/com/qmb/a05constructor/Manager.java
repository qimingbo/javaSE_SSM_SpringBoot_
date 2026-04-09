package com.qmb.a05constructor;

public class Manager extends Employee {
    private double bonus;

    public Manager(){}

    public Manager(String id, String name, double Salary, double bonus) {
        super(id, name, Salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work()
    {
        System.out.println("管理其他人");
    }
}
