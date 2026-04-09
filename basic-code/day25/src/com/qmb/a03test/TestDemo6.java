package com.qmb.a03test;

import java.util.*;

public class TestDemo6 {
    public static void main(String[] args) {
        /*
        练习6 Map集合案例
        需求:定义一个Map集合，键用表示省份名称province,值表示市city,但是市会有多个。
            添加完毕后，遍历结果格式如下：
            江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
            湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
            河北省 = 石家庄市，唐山市，邢台市，保定市，张家口市
         */
        // 创建Map并添加元素
        HashMap<String, ArrayList<String>> mp = new HashMap<>();
        ArrayList<String> city1 = new ArrayList<>();
        Collections.addAll(city1, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        ArrayList<String> city2 = new ArrayList<>();
        Collections.addAll(city2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        ArrayList<String> city3 = new ArrayList<>();
        Collections.addAll(city3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");
        mp.put("江苏省",city1);
        mp.put("湖北省",city2);
        mp.put("河北省",city3);

        // 遍历集合
        Set<Map.Entry<String, ArrayList<String>>> entries = mp.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringJoiner sj = new StringJoiner(", ");
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
                for (String city : value) {
                    sj.add(city);
                }
            System.out.println(key + " = " + sj);
        }
    }
}
