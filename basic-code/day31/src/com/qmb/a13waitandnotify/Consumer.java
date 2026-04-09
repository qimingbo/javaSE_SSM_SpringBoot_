package com.qmb.a13waitandnotify;

public class Consumer extends Thread {

    @Override
    public void run() {
        /*
         * 1. 循环
         * 2. 同步代码块
         * 3. 判断共享数据是否到了末尾（到了末尾）
         * 4. 判断共享数据是否到了末尾（没有到末尾，执行核心逻辑）
         * */
        // 1.while循环
        while (true)
        {
            // 2.同步代码块
            synchronized (Desk.lock) {
                if (Desk.count == 0) {
                    break;
                } else {
                    // 3.桌子上没有食物
                    if (Desk.food == 0) {
                        // 等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    // 4.桌子上有食物
                    else {
                        // 吃的总数-1
                        Desk.count--;
                        // 改变桌子上食物的状态
                        Desk.food = 0;
                        System.out.println("消费者还能吃" + Desk.count + "个");
                        // 唤醒其他线程
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
