package com.test.juc;

public class threads2 {
	public static void main(String[] args) {
		Thread1 td=new Thread1();
		new Thread(td).start();
		new Thread(td).start();
		
	}

}




class Thread1 implements Runnable {

	private int ticket = 20;
	 
    public void run() {
        while (ticket > 0) {
            ticket--;
            System.out.println(Thread.currentThread().getName()+"当前票数为：" + ticket);
        }
 
    }
	
}
