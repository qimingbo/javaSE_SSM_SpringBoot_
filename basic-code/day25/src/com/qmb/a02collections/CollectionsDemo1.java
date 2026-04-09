package com.qmb.a02collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {
       /*
         public static <T> boolean addAll(Collection<T> c, T...elements)批量添加元素
         public static void shuffle(List<?> list) 打乱List集合元素的顺序
        */
       // 1.创建集合并批量添加元素
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        System.out.println(list);

        // 2.打乱List集合元素的顺序
        Collections.shuffle(list);
        System.out.println(list);

    }
}
