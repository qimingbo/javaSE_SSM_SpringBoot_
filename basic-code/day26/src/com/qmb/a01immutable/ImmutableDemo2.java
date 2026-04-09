package com.qmb.a01immutable;

import java.util.Set;

public class ImmutableDemo2 {
    /*
    创建不可变的Set集合
        "张三", "李四", "王五", "赵六"
     细节:
        元素不能重复
    */
    public static void main(String[] args)
    {
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        // set.add("aaa");
        System.out.println(set);
    }

}
