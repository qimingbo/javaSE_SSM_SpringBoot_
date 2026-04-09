package com.qmb.a06testcase2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> result = new ArrayList<>();
        while (true)
        {
            synchronized (MyThread.class)
            {
                if(list.size() == 0)
                {   // 打印
                    int sum = 0;
                    System.out.println("在此次抽奖过程中，"+getName()+"总共产生了"+ result.size() +"个奖项分别为：");
                    for (Integer i : result) {
                        sum += i;
                        System.out.print(i + ",");
                    }
                    System.out.println("最高奖项为"+Collections.max(result)+"元，总计额为"+ sum +"元");
                    break;
                }

                else {
                    // 打乱
                    Collections.shuffle(list);
                    // 获得奖品
                    int prize = list.get(0);
                    // 移除奖品
                    list.remove(0);
                    result.add(prize);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
