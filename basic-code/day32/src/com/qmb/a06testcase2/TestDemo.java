package com.qmb.a06testcase2;

import java.util.ArrayList;
import java.util.Collections;

public class TestDemo {
    public static void main(String[] args) {
        // 方式2:线程栈的思想

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        MyThread mt1 = new MyThread(list);
        MyThread mt2 = new MyThread(list);

        mt1.setName("抽奖箱1");
        mt2.setName("抽奖箱2");

        mt1.start();
        mt2.start();
    }
}
