package com.qmb.a02set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        /*
        需求：请自行选择比较器排序和自然排序两种方式：
        要求：存入四个字符串，"c","ab","df","qwer"
        按照长度排序，如果一样长则按照首字母排序
        方式一：
            默认排序/自然排序：javabean类实现Comparable接口指定比较规则
        方式二:
            比较器排序；创建TreeSet对象的时候,传递比较器Comparator指定规则
        使用原则:默认使用第一种,如果第一种不能满足当前需求,就使用第二种
         */

        // 1.创建集合并添加元素
        TreeSet<String> ts = new TreeSet<>(( o1, o2) -> {
                // 首先按照长度排序
                int i = o1.length() - o2.length();
                if(i != 0) return i;
                // 长度相同再按首字母排序
                return o1.compareTo(o2);
        });
        // 2.添加元素
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        // 3.打印集合
        System.out.println(ts);

    }
}
