package com.qmb.a01immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    /*
    创建不可变的Map集合
        "张三","南京","李四","北京","王五","上海",
        "赵六","广州","孙七","深圳","周八","杭州",
        "吴九","宁波","郑十","苏州","刘一","无锡",
        "陈二","嘉兴"

        细节:
            1.键不能重复
            2.Map.of方法中,参数是有上限的,最多传20个参数,10个键值对,不使用可变参数
            3.Map.ofEntries传递键值对对象,数量可以超过10个,使用的是可变参数
    */
    public static void main(String[] args)
    {
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "上海",
                "赵六", "广州", "孙七", "深圳", "周八", "杭州",
                "吴九", "宁波", "郑十", "苏州", "刘一", "无锡",
                "陈二", "嘉兴");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key + "  = " + value);
        }
    }

}
