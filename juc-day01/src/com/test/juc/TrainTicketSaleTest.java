package com.test.juc;

public class TrainTicketSaleTest extends Thread {
    private static int ticket = 100;
    public static void main(String[] args) {
           new Thread() {
                  public void run() {
                        Thread.currentThread().setName("窗口1");
                        while (true) {
                               if (ticket > 0) {
                                      System.out.println(Thread.currentThread().getName() + "售出的车票，ticket号为：" + ticket--);
                               } else
                                      break;
                        }
                  }
           }.start();

           new Thread() {
                  public void run() {
                        Thread.currentThread().setName("窗口2");
                        while (true) {
                               if (ticket > 0) {
                                      System.out.println(Thread.currentThread().getName() + "售出的车票，ticket号为：" + ticket--);
                               } else
                                      break;
                        }
                  }
           }.start();

           new Thread() {
                  public void run() {
                        Thread.currentThread().setName("窗口3");
                        while (true) {
                               if (ticket > 0) {
                                      System.out.println(Thread.currentThread().getName() + "售出的车票，ticket号为：" + ticket--);
                               } else
                                      break;
                        }
                  }
           }.start();
    }
}
