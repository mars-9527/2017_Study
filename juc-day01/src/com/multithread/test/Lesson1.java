package com.multithread.test;

class Thread2 implements Runnable{  
    private String name;  
  
    public Thread2(String name) {  
        this.name=name;  
    }  
    private int num=10;
  
    @Override  
    public void run() {  
          for (int i = 0; i < 5; i++) {  
                System.out.println(Thread.currentThread().getName()+"--"+name + "运行  :  " + num++);  
                try {  
                    Thread.sleep((int) Math.random() * 10);  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
          
    }  
      
}  
public class Lesson1 {  
  
    public static void main(String[] args) {  
        
        Thread2 thread = new Thread2("C");
        new Thread(thread).start();
        new Thread(thread).start(); 
        
//        new Thread(new Thread2("C")).start();  
//        new Thread(new Thread2("D")).start();  
  
    }  
}
