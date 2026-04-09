package com.qmb.a05test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MyThread  extends Thread{
    private ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true)
        {
            synchronized (MyThread.class)
            {
                if(list.size() == 0) break;
                else {
                    // 打乱
                    Collections.shuffle(list);
                    // 获得奖品
                    int prize = list.get(0);
                    // 移除奖品
                    list.remove(0);
                    System.out.println(getName() + " 又产生了一个" + prize + "元大奖");
                }

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
