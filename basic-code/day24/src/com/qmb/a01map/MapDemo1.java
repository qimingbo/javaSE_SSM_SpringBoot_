package com.qmb.a01map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    /*
    V put（K key,V value）添加元素
    V remove（Object key)根据键删除键值对元素
    void clear()移除所有的键值对元素
    boolean containsKey(Object key)判断集合是否包含指定的键
    boolean containsValue（Object value)判断集合是否包含指定的值
    boolean isEmpty()判断集合是否为空
    int size()集合的长度，也就是集合中键值对的个数
    */
    public static void main(String[] args) {
        // 1.创建Map集合对象
        Map<String,String> map = new HashMap<>();

        // 2.添加对象
        // put方法的细节:
        // 添加/覆盖
        // 在添加数据的时候，如果键不存在,那么直接把键值对象添加到map集合中，方法返回null;
        // 在添加数据的时候，如果键存在,那么会把原来的键值对象覆盖，方法返回被覆盖的值;
        // 添加/覆盖
        String value1 = map.put("张三", "黄蓉");
        System.out.println(value1);
        map.put("李四","木健平");
        map.put("王五","小龙女");
        String value2 = map.put("李四", "双儿");
        System.out.println(value2);
        System.out.println(map);
        System.out.println("------------------------");
        // 3.根据键删除键值对元素
        String result = map.remove("张三");
        System.out.println(result);
        System.out.println(map);
        System.out.println("------------------------");

        // 4.移除所有的键值对元素
        //map.clear();
        //System.out.println(map);
        //System.out.println("------------------------");

        // 5.判断集合是否包含指定的键
        boolean result1 = map.containsKey("张三");
        boolean result2 = map.containsKey("李四");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println("------------------------");
        // 6.判断集合是否包含指定的值
        boolean result3 = map.containsValue("双儿");
        boolean result4 = map.containsValue("黄蓉");
        System.out.println(result3);
        System.out.println(result4);
        System.out.println("------------------------");
        // 7.判断集合是否为空
        boolean result5 = map.isEmpty();
        System.out.println(result5);
        // map.clear();
        boolean result6 = map.isEmpty();
        System.out.println(result6);
        System.out.println("------------------------");
        // 8.集合的长度
        int size = map.size();
        System.out.println(size);
    }

}
