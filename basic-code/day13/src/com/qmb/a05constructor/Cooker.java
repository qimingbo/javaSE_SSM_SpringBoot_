package com.qmb.a05constructor;

public class Cooker extends Employee {

    public Cooker(){}

    public Cooker(String id, String name, double salary){
        super(id, name, salary);
    }

    public void work()
    {
        System.out.println("炒菜");
    }


}
