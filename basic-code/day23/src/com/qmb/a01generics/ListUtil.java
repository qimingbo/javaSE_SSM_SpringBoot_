package com.qmb.a01generics;

import java.util.List;

/*
     泛型方法
     定义一个工具类ListUtil
     类中定义一个静态方法addAll，用来添加多个元素 */
public class ListUtil {
    private ListUtil(){}

    public static<E> void addAll(List<E> list, E e1, E e2, E e3)
    {
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }

    // 这个是扩展的，不定参数，暂时没讲，了解一下
    public static <E> void addAll(List<E> list,E ... e)
    {
        for (E element : e) {
            list.add(element);
        }
    }
}
