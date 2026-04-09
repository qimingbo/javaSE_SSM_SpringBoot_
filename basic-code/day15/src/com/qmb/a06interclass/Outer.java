package com.qmb.a06interclass;

import javax.sound.midi.Soundbank;

public class Outer {
    private int a = 10;

    class Inner{
        private  int a = 20;

        public void show(){
            int a = 30;
            System.out.println(a);//30
            System.out.println(this.a);//20
            System.out.println(Outer.this.a);//10
        }
    }
}
