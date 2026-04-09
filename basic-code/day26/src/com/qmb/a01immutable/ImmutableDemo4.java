package com.qmb.a01immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo4 {
    public static void main(String[] args) {
        /*
        创建Map的不可变集合，键值对的数量超过10个
            "张三","南京","李四","北京","王五","上海",
            "赵六","广州","孙七","深圳","周八","杭州",
            "吴九","宁波","郑十","苏州","刘一","无锡",
            "陈二","嘉兴"
         */
        // 添加元素到HashMap中
        HashMap<String,String> hm = new HashMap<>();
        hm.put("张三","南京");
        hm.put("李四","北京");
        hm.put("王五","上海");
        hm.put("赵六","广州");
        hm.put("孙七","深圳");
        hm.put("周八","杭州");
        hm.put("吴九","宁波");
        hm.put("郑十","苏州");
        hm.put("刘一","南京");
        hm.put("陈二","嘉兴");
        hm.put("aaa","111");

        // 获取键值对集合
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        // 将键值对集合转为Map.Entry数组
        // 如果参数中的数组长度小于set集合的大小,会重新创建个新的
        // 否则,会拷贝到参数中的数组中
        Map.Entry[] arr1 = entries.toArray(new Map.Entry[0]);
        Map map1 = Map.ofEntries(arr1);
        System.out.println(map1);
        // 和上面对应
        Map<Object, Object> map2 = Map.ofEntries(entries.toArray(new Map.Entry[0]));
    }
}
