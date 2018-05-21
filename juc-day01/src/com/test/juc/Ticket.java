package com.test.juc;

public class Ticket extends Thread {
    private int tick = 100;
    public void run() {
           while (true) {
                  synchronized (this) {
                        if (tick > 0) {
                               try {
                                      Thread.sleep(10);
                               } catch (InterruptedException e) {
                                      e.printStackTrace();
                               }
                               System.out.println(Thread.currentThread().getName()
                                             + "卖票，票号为：" + tick);
                               tick--;
                        } else {
                               break;
                        }
                  }
           }
    }
}