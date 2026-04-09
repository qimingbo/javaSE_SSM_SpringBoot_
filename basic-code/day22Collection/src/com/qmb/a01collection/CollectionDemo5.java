package com.qmb.a01collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo5 {
    public static void main(String[] args) {
        /*
        Lambda表达式遍历:
        default void forEach(Consumer<? super T> action)
         */
        // 1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        // 2.利用匿名内部类的形式
        // 底层原理:其实也会遍历集合，依次得到每一个元素，把得到的每一个元素，传递给下面的accept方法中的s
       /* coll.forEach(new Consumer<String>() {
            @Override
            // s依次表示集合中的每一个元素
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        // 利用lambda表达式的形式
        // lambda的格式()->{}
        coll.forEach(s -> System.out.println(s));
    }
}
