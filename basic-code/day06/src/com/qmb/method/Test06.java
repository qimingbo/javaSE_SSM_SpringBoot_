package com.qmb.method;

import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
        lottery();
    }

    //一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
    public static void lottery()
    {
        // array数组记录五个奖金数额
        int[] array = {2, 588, 888, 1000, 10000};
        // 已经抽过的奖励对应标记为true
        boolean[] brr = new boolean[5];
        //
        int index = 0;
        //
        Random rd = new Random();
        while(index < array.length){
            int i = rd.nextInt(0,5);
            if(!brr[i])
            {
                System.out.println(array[i]+"奖金被抽出");
                brr[i] = true;
                index++;
            }
        }

    }
}
