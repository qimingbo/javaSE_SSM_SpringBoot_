package com.qmb.a06doudizhu2;

import java.util.*;

// 排序1：利用序号进行排序
//如果原始数据的规律非常复杂，我们可以先手动排序让每一个数据跟唯一的序号产生对应关系。
public class PokerGame {
    // 存储序号和牌的一一对象关系
    static HashMap<Integer,String> hm = new HashMap<>();
    // 存储1-54，发牌的时候发牌对应的数字
    static ArrayList<Integer> list = new ArrayList<>();
    // 静态代码块
    // 随着类的加载而加载,而且只执行一次
    static {
        // 准备牌
        //         "♦","♣","♥","♠"
        //        "3","4","5","6","7","8","9","10","J","Q","K","A","2"
        String[] color = {"♦","♣","♥","♠"};
        String[] number = { "3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int serialNumber = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber,c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber,"大王");
        list.add(serialNumber);
    }

    public PokerGame(){
        // 洗牌
        Collections.shuffle(list);
        // 发牌
        TreeSet<Integer> lord = new TreeSet<>();//底牌
        TreeSet<Integer> player1 = new TreeSet<>();// 玩家1
        TreeSet<Integer> player2 = new TreeSet<>();// 玩家2
        TreeSet<Integer> player3 = new TreeSet<>();// 玩家3
        for (int i = 0; i < list.size(); i++) {
            int poker = list.get(i);
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
        // 看牌
        lookPoker("底牌",lord);
        lookPoker("张三",player1);
        lookPoker("李四",player2);
        lookPoker("王五",player3);
    }

    public void lookPoker(String name, TreeSet<Integer> list)
    {
        System.out.print(name + "：");
        for (Integer s : list) {
            System.out.print(hm.get(s) + " ");
        }
        System.out.println();
    }
}
