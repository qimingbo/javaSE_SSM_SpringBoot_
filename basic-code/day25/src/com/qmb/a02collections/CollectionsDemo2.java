package com.qmb.a02collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        /*
         public static <T> void sort(List<T>list)排序,默认自然排序
         public static <T> void sort(List<T>list,Comparator<T>c)根据指定的规则进行排序
         public static <T> int binarySearch (List<T>list,T key)以二分查找法查找元素
         public static <T> void copy(List<T>dest, List<T>src)拷贝集合中的元素
         public static <T> void fill (List<T>list,T obj)使用指定的元素填充集合
         public static <T> void max/min(Collection<T>coll)根据默认的自然排序获取最大/小值
         public static <T> void swap(List<?>list,int i,int j)交换集合中指定位置的元素
         */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        Collections.shuffle(list);
        System.out.println("------默认排序前------");
        System.out.println(list);

        // 1.自然排序，默认升序
        Collections.sort(list);
        System.out.println("------默认排序后------");
        System.out.println(list);

        // 2.据指定的规则进行排序，指定降序
        Collections.shuffle(list);
        System.out.println("------指定排序前------");
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("------指定排序后------");
        System.out.println(list);
        //3.以二分查找法查找元素
        System.out.println("------二分查找前元素------");
        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list, 2);
        System.out.println(index);

        // 4.拷贝集合中的元素
        ArrayList<Number> list1 = new ArrayList<>(Collections.nCopies(10,0));
//        Collections.fill(list1,null);
        System.out.println(list1);
        Collections.copy(list1,list);
        System.out.println(list1);

        // 5.根据默认的自然排序获取最大/小值
        Collections.shuffle(list);
        System.out.println("------自然排序的元素-------");
        int max = Collections.max(list);
        System.out.println(max);

        // 6.交换集合中指定位置的元素
        System.out.println("------交换后的元素-------");
        Collections.swap(list,0,1);
        System.out.println(list);
    }
}
