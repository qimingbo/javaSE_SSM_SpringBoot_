package com.qmb.a02stream;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        /*创建集合添加元素，完成以下需求：
            1.把所有以"张"开头的元素存储到新集合中
            2.把"张"开头的，长度为3的元素再存储到新集合中
            3.遍历打印最终结果
        */

        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");


        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

        /*// 1.把所有以"张"开头的元素存储到新集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list) {
            if(name.startsWith("张")){
                list2.add(name);
            }
        }
        System.out.println(list2);
        // 2.把"张"开头的，长度为3的元素再存储到新集合中
        ArrayList<String> list3 = new ArrayList<>();
        for (String name : list2) {
            if(name.length() == 3){
                list3.add(name);
            }
        }
        System.out.println(list3);*/
    }
}
