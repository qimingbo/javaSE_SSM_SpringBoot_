package com.qmb.a03test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestDemo1 {
    public static void main(String[] args) {
        /*
        练习1 自动点名器1
        班机有N个学生,学生属性:姓名、年龄、性别
        实现点名器
          */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");
        //System.out.println(list);
        // 方式1
//        Random rd = new Random();
//        int size = list.size();
//        int index = rd.nextInt(size);
//        System.out.println(list.get(index));

         // 方式2
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
