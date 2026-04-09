package com.qmb.a01immutable;

import java.util.List;

public class ImmutableDemo1 {
    /*
    创建不可变的List集合
        "张三", "李四", "王五", "赵六"
    */
    public static void main(String[] args)
    {
        List<String> list = List.of("张三", "李四", "王五", "赵六");
        System.out.println(list);

    }

}
