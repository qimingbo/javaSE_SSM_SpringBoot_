package com.qmb.a05source;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // TreeMap源码分析
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("aaa",111);
        tm.put("bbb",222);
        tm.put("ccc",333);
        tm.put("ddd",444);
        tm.put("eee",555);
    }
}
