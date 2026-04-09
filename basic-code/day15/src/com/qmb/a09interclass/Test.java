package com.qmb.a09interclass;

public class Test {
    /*
    /*需要大家理解匿名内部类的格式，而不是硬记：
     new 类名或者接口名(){
     重写方法；
     };
     */
    // 没有名字的成员内部类
    Swim swim = new Swim(){

        @Override
        public void swim() {
            System.out.println("重写了游泳的方法");
        }
    };
    public static void main(String[] args) {

        // 书写匿名内部类
        new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };


        new Person(){

            @Override
            public void work() {

            }
        };
        new Animal(){

        };

        // 没有名字的局部内部类
        Swim swim = new Swim(){

            @Override
            public void swim() {
                System.out.println("重写了游泳的方法");
            }
        };
    }

}
