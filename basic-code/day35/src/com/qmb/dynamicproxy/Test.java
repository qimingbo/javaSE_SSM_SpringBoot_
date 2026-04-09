package com.qmb.dynamicproxy;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        /*
        需求：
          *   外面的人想要大明星唱一首歌
          *   1. 获取代理的对象
          *      代理对象 = ProxyUtil.createProxy(大明星的对象);
          *   2. 再调用代理的唱歌方法
          *      代理对象.唱歌的方法("只因你太美");
        */
        // 1.创建被代理的对象
        BigStar bigStar = new BigStar("鸡哥");
        // 2.创建代理对象
        Star proxy = ProxyUtil.createProxy(bigStar);
        // 3.调用方法
        String result = proxy.sing("及你太美");
        System.out.println(result);
    }
}
