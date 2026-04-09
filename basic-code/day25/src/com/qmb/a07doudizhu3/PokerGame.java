package com.qmb.a07doudizhu3;

import com.sun.jdi.Value;

import java.util.*;

// 排序2：给每一张牌计算价值
// 利用拍的价值进行排序
public class PokerGame {
    // 创建一个集合，来记录牌的价值
    static HashMap<String,Integer> hm = new HashMap<>();
    // 存储一副牌
    static ArrayList<String> list = new ArrayList<>();
    // 静态代码块
    // 随着类的加载而加载,而且只执行一次
    static {
        // 准备牌
        //         "♦","♣","♥","♠"
        //        "3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♦","♣","♥","♠"};
        String[] number = { "3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("大王",16);
        hm.put("小王",17);
    }

    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);
        // 发牌
        ArrayList<String> lord = new ArrayList<>();//底牌
        ArrayList<String> player1 = new ArrayList<>();// 玩家1
        ArrayList<String> player2 = new ArrayList<>();// 玩家2
        ArrayList<String> player3 = new ArrayList<>();// 玩家3
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if(i < 3){
                lord.add(poker);
                continue;
            }
            if(i % 3 == 0)
            {
                player1.add(poker);
            }else if(i % 3 == 1){
                player2.add(poker);
            }else {
                player3.add(poker);
            }
        }
        // 排序
        Order(lord);
        Order(player1);
        Order(player2);
        Order(player3);

        // 看牌
        lookPoker("底牌",lord);
        lookPoker("张三",player1);
        lookPoker("李四",player2);
        lookPoker("王五",player3);
    }
    // 看牌
    public void lookPoker(String name, ArrayList<String> list)
    {
        System.out.print(name + "：");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    // 利用拍的价值进行排序
    public void Order(ArrayList<String> list)
    {
        Collections.sort(list, new Comparator<String>() {
            // Arrays.sort(插入排序 + 二分查找)
            @Override
            public int compare(String o1, String o2) {
                // o1:表示当前要插入到有序序列中的牌
                // o2:表示己经在有序序列中存在的牌
                // 负数：o1小插入到前面
                // 正数：o1大插入到后面
                // 0：o1的数字跟o2的数字是一样的，需要按照花色再次排序
                int i = getValue(o1) - getValue(o2);
                String color1 = o1.substring(0,1);
                String color2 = o2.substring(0,1);
                i = i == 0 ? color1.compareTo(color2) : i;
                return i;
            }
        });

    }

    // 计算牌的价值
    public int getValue(String poker) {
        String pokerNumber = poker.substring(1);
        if (!hm.containsKey(pokerNumber)) {
            int value = Integer.parseInt(pokerNumber);
            return value;
        }else {
            return hm.get(pokerNumber);
        }
    }
}
