package com.qmb.a02hashmap;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        /*
        需求
            需求某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是(A、B、C、D),每个学生只能选择一个景点，
            请统计出最终哪个景点想去的人数最多。
         */
        // 1.生成学生选择的景点数据
        String[] arr = {"A", "B", "C", "D"};
        String[] student = new String[80];
        Random rd = new Random();
        for (int i = 0; i < 80; i++) {
            int index = rd.nextInt(arr.length);
            student[i] = arr[index];
        }
        // 2.如果统计多个计数问题，选择map
        Map<String,Integer> map = new HashMap<>();
        for (String s : student) {
            if(map.containsKey(s)) {
                int count = map.get(s);
                count++;
                map.put(s, count);
            }else
                map.put(s,1);
        }
        System.out.println(map);
        // 3.找到最大值
        int max = 0;
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            if(max < value) max = value;
        }
        System.out.println(max);
        // 4.打印选择最多的景点
        Set<String> keys = map.keySet();
        for (String key : keys) {
            Integer value = map.get(key);
            if(max == value) System.out.println(key);
        }


    }
}
