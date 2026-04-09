package com.qmb.a14waitandnotify;

import com.qmb.a13waitandnotify.Desk;

import java.util.concurrent.ArrayBlockingQueue;

public class Producer extends Thread {
    private ArrayBlockingQueue<String> queue;

    public Producer(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            //不断的把面条放到阻塞队列当中
            try {
                queue.put("食物");
                System.out.println("生产了一份食物");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
