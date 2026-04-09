package com.qmb.a13waitandnotify;

public class Producer extends Thread {
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock)
            {
                if(Desk.count == 0)
                {
                    break;
                }
                else {
                    if(Desk.food == 1)
                    {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        System.out.println("生产者做了一个食物");
                        Desk.food = 1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
