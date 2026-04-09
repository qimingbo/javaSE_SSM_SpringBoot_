package com.qmb.arraylist;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        // 需求：定义一个集合ArrayList,添加数字并进行遍历，遍历结果[1, 2, 3]。
        // ArayList中不能添加基本数据类型，如果要添加，需要把泛型改为他的包装类。

        // 1、创建并添加，JDK5以后，int和Integer之间可以互相转化。
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // 2、遍历输出
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1)
                System.out.print(list.get(i) + "]");
            else
                System.out.print(list.get(i) + ", ");
        }
    }
}
