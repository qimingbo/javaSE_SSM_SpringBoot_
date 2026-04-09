package com.qmb.a04extend;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
    }
}

class Ye{
    String ww = "ye";
}

class Fu extends Ye{
    String name = "fu";
}

class Zi extends Fu{
    String name = "zi";

    public void show(){
        String name = "showmaker";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
        System.out.println(super.ww);
    }
}
