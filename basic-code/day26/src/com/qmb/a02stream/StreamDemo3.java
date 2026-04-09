package com.qmb.a02stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo3 {
    public static void main(String[] args) {
        // 双列集合                无                     无法直接使用Stream流
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("张三",22);
        hm.put("李四",20);
        hm.put("王五",23);
        hm.put("赵六",25);
        hm.put("钱七",19);

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        entries.stream().forEach(s -> System.out.println(s) );
    }
}
