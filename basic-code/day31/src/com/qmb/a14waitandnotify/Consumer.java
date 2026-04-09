package com.qmb.a14waitandnotify;

import com.qmb.a13waitandnotify.Desk;

import java.util.concurrent.ArrayBlockingQueue;


public class Consumer extends Thread {

    private ArrayBlockingQueue<String> queue;

    public Consumer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true)
        {
            //不断从阻塞队列中获取面条
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
