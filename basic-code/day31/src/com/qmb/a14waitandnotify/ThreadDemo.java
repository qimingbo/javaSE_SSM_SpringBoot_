package com.qmb.a14waitandnotify;


import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    public static void main(String[] args) {
           /*
           需求：利用阻塞队列完成生产者和消费者（等待唤醒机制）的代码
             细节：
               生产者和消费者必须使用同一个阻塞队列
           */
            ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
            Producer p = new Producer(queue);
            Consumer c = new Consumer(queue);
            p.start();
            c.start();
    }
}
