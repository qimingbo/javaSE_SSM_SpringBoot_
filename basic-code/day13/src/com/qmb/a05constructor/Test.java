package com.qmb.a05constructor;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("100", "zhangsan", 5000, 1000);
        manager.work();
        manager.eat();
        System.out.println(manager.getId() + "," + manager.getName() + "," + manager.getSalary() + "," + manager.getBonus());
        System.out.println("----------------");
        Cooker cooker = new Cooker("200", "lisi", 4000);
        cooker.work();
        cooker.eat();
        System.out.println(cooker.getId() + "," + cooker.getName() + "," + cooker.getSalary());
    }
}
