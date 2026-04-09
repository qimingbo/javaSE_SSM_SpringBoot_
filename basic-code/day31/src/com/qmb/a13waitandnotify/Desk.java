package com.qmb.a13waitandnotify;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Desk {
    /*
     * 作用：控制生产者和消费者的执行
     *
     * */
    // 状态变量.0表示桌子上没有，1表示有
    public static int food = 0;

    // 总个数
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();
}
