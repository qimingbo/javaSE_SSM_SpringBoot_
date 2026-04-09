package com.qmb.a05doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

public class PokerGame {
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
        list.add("大王");
        list.add("小王");
    }

    public PokerGame(){
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
        // 看牌
        lookPoker("底牌",lord);
        lookPoker("张三",player1);
        lookPoker("李四",player2);
        lookPoker("王五",player3);
    }
    public void lookPoker(String name, ArrayList<String> list)
    {
        System.out.print(name + "：");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
