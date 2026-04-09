package com.qmb.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList08 {
    /* 需求：定义javabean类：Phone
       Phone的属性：品牌、价格
       main方法中定义一个集合，存入三个手机对象，
       分别是小米，1000；苹果，8000；锤子，2999
       定义一个方法：将价格低于3000的手机信息返回
        */
    public static void main(String[] args) {
        // 1、定义集合
        List<Phone> list = new ArrayList<>();
        // 2、添加元素
        Phone phone1 = new Phone("小米", 1000);
        Phone phone2 = new Phone("苹果", 8000);
        Phone phone3 = new Phone("锤子", 2999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        // 3、调用方法
        List<Phone> phoneList = returnInfo(list);
        // 4、输出结果或者继续遍历
        System.out.println(phoneList);
    }

    /* 方法功能：将价格低于3000的手机信息返回
    返回值 List<Phone>
    参数： List<Phone> list
     */
    public static  List<Phone> returnInfo(List<Phone> list)
    {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() >= 3000)
                list.remove(i);
        }
        return list;
    }
}
