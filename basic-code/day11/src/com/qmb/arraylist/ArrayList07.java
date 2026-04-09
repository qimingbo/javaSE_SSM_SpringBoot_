package com.qmb.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {
    // 需求：main方法中定义一个集合，存入三个用户对象，用户属性为id,username,password
    // 要求：定义一个方法，根据id查找对应的用户信息。如果存在，则返回true,如果不存在，返回false。
    // 改变这个函数：定义一个方法，根据id查找对应的用户信息。如果存在，则返回索引,如果不存在，返回 -1。
    public static void main(String[] args) {
        User u1 = new User("111", "zhangsan", "123");
        User u2 = new User("222", "lisi", "123");
        User u3 = new User("333", "wangwu", "123");
        List<User> list = new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println(getIndexById("111", list));
        System.out.println(contains("111", list));
    }

    public  static boolean contains(String id,List<User> list)
    {
        return getIndexById(id, list) >= 0;

    }

    public  static int getIndexById(String id, List<User> list)
    {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id))
                return i;
        }
        return -1;
    }
    public int aaa()
    {
        return 1;
    }
}
