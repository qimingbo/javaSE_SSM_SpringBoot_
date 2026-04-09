package com.qmb.a03test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo2 {
    public static void main(String[] args) {
        /*
        练习2 自动点名器2
        班级有N个学生
        要求:
            70%的概率随机到男生
            30%的概率随机到女生
         "范闲", "范建", "范统", "杜子腾",  "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰"
         "杜琦燕", "袁明媛","李猜", "田眯眯"
         */
        // 概率问题：创建一个长度为10的数组，里面存7个1和3个0，随机到1去男生集合里抽，随机到0去女生集合里抽
        int[] prob = {1,1,1,1,1,1,1,0,0,0};
        Random rd = new Random();
        int index = rd.nextInt(prob.length);
        int flag = prob[index];
        System.out.println("1代表男生,0代表女生：" + flag);
        // 分别创建两个集合存男生和女生
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList, "范闲", "范建", "范统", "杜子腾",  "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰");
        Collections.addAll(girlList, "杜琦燕", "袁明媛","李猜", "田眯眯");
        // 判断从男的中抽还是从女的中抽
        if(flag == 1){
            index = rd.nextInt(boyList.size());
            System.out.println(boyList.get(index));
        }else{
            index = rd.nextInt(girlList.size());
            System.out.println(girlList.get(index));
        }


    }
}
