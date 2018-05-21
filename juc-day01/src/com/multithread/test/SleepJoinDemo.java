package com.multithread.test;

class Sleeper extends Thread {  
    // 可以传参设定睡眠时间  
    private int sleepTime;  
  
    public Sleeper(String name, int sleepTime) {  
        super(name);  
        this.sleepTime = sleepTime;  
        start();// 在构造方法中启动  
    }  
  
    @Override  
    public void run() {  
        try {  
            sleep(sleepTime);  
        } catch (InterruptedException e) {  
            System.out.println(getName() + " was interrupted.\n"  
                    + "isInterrupted():" + isInterrupted());  
            return;  
        }  
        System.out.println(getName() + " has awakened");  
    }  
}  
  
class Joiner extends Thread {  
    private Sleeper sleeper;  
  
    public Joiner(String name, Sleeper sleeper) {  
        super(name);  
        this.sleeper = sleeper;  
        start();  
    }  
  
    public void run() {  
        try {  
            sleeper.join();//合并，异步变同步  
        } catch (InterruptedException e) {  
            System.out.println("interrupted");  
        }  
        System.out.println(getName() + " join completed");  
    }  
}  


public class SleepJoinDemo {
	
	public static void main(String[] args) {
		Sleeper sleep1 = new Sleeper("sleep1", 1500);  
		Sleeper sleep2 = new Sleeper("sleep2", 1500);  
		Joiner join1 = new Joiner("join1", sleep1);  
		Joiner join2 = new Joiner("join2", sleep1);  
		sleep2.interrupt();
	}
   

}
