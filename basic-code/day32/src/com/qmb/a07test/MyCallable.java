package com.qmb.a07test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> result = new ArrayList<>();
        while (true){
            synchronized (MyCallable.class)
            {
                if(list.size() == 0)
                {
                    int sum = 0;
                    System.out.println("在此次抽奖过程中，"+Thread.currentThread().getName()+"总共产生了"+ result.size() +"个奖项分别为：");
                    for (Integer i : result) {
                        sum += i;
                        System.out.print(i + ",");
                    }
                    System.out.println("最高奖项为"+Collections.max(result)+"元，总计额为"+ sum +"元");
                    break;
                }
                else {
                    Collections.shuffle(list);
                    int e = list.remove(0);
                    result.add(e);
                }
            }
        }
            if(result.size() == 0) return null;
            else return Collections.max(result);
    }
}
