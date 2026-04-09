package com.qmb.a04treemap;

import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        /*
         需求：
            字符串“aababcabcdabcde”
            请统计字符串中每一个字符出现的次数，并按照以下格式输出
            输出结果：
            a（5）b（4）c（3）d（2）e（1）
                新的统计思想：利用map集合进行统计

            如果题目中没有要求对结果进行排序，默认使用HashMap
            如果题目中要求对结果进行排序，请使用TreeMap

            键：表示要统计的内容
            值：表示次数
        */
        // 1.创建TreeMap并计数
        String str = "aababcabcdabcde";
        TreeMap<Character,Integer> tm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if(!tm.containsKey(key))
            {
                tm.put(key,1);
            }else{
                Integer count = tm.get(key);
                count++;
                tm.put(key,count);
            }
        }
        // 2.拼接
        StringJoiner sj = new StringJoiner("");
        Set<Map.Entry<Character, Integer>> entries = tm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            sj.add(entry.getKey() + "").add("(" + entry.getValue() + ")");
        }
        System.out.println(sj);
    }
}
