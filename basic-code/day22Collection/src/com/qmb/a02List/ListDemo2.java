package com.qmb.a02List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        // List集合的删除方法的区别

        // 1.创建集合并添加元素
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // 删除元素
        //方法重载时，优先调用形参和实参类型一样的方法。
        list.remove(1);
        System.out.println(list);

        // 手动装箱,手动把基本数据类型1变为Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(list);
    }
}
