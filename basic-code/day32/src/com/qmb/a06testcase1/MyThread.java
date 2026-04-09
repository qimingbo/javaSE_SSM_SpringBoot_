package com.qmb.a06testcase1;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread  extends Thread{
    ArrayList<Integer> list;
    static ArrayList<Integer> listA = new ArrayList<>();
    static ArrayList<Integer> listB = new ArrayList<>();

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true)
        {
            synchronized (MyThread.class)
            {
                if(list.size() == 0)
                {   // 打印
                    int sum = 0;
                    if ("抽奖箱1".equals(getName())) {
                        System.out.println("在此次抽奖过程中，抽奖箱1总共产生了"+ listA.size() +"个奖项分别为：");
                        for (Integer i : listA) {
                            sum += i;
                            System.out.print(i + ",");
                        }
                        System.out.println("最高奖项为"+Collections.max(listA)+"元，总计额为"+ sum +"元");
                    }
                    else {
                        System.out.println("在此次抽奖过程中，抽奖箱2总共产生了" + listB.size() + "个奖项分别为：");
                        for (Integer i : listB) {
                            sum += i;
                            System.out.print(i + ",");
                        }
                        System.out.println("最高奖项为" + Collections.max(listB) + "元，总计额为" + sum + "元");
                    }
                    break;
                }

                else {
                    // 打乱
                    Collections.shuffle(list);
                    // 获得奖品
                    int prize = list.get(0);
                    // 移除奖品
                    list.remove(0);
                    if("抽奖箱1".equals(getName()))
                    {
                        listA.add(prize);
                    }
                    else listB.add(prize);
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
