package com.qmb.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        // 需求：定义一个集合ArrayList,添加字符产并进行遍历，遍历结果[1, 2, 3]。
        // 1、创建集合并添加元素
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        // 2、遍历输出
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1)
                System.out.print(list.get(i) + ']');
            else System.out.print(list.get(i) + ", ");
        }
    }
}
