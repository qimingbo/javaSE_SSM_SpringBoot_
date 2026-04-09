package com.qmb.a02stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.IntFunction;

public class StreamDemo9 {
    public static void main(String[] args) {
         /*
            终结方法:
            void forEach(Consumer<? super T> action)        遍历
            long count()                                    统计
            toArray()                                       收集流中的数据，放到数组中
       */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");
        // 统计
        long count = list.stream().count();
        System.out.println(count);
        System.out.println("--------------------------");

        // 收集流中的数据，放到数组中   默认参数：Object类型
        Object[] objects = list.stream().toArray();
        for (Object o : objects) {
            System.out.println(o);
        }
        System.out.println("--------------------------");

        // 收集流中的数据，放到数组中   指定参数
        // IntFunction的泛型：具体类型的数组
        // apply形参：流中的数据个数，要跟数组长度一致
        // 返回值：具体类型的数组
        // 方法体：创建数组

        // toArray方法的参数的作用：负责创建一个指定类型的数组
        // toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        // toArray方法的返回值：是一个装着流里面所有数据的数组
        String[] strings = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
