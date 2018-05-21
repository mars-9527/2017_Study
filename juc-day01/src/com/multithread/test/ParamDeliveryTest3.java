package com.multithread.test;

import java.util.Random;

class Data { 
	public int value = 0; 
} 

class Work { 
	public void process(Data data, Integer... numbers) { 
		for (int n : numbers) { 
		data.value += n; 
		} 
	} 
} 

class MyThread3 extends Thread {
	private Work work;

	public MyThread3(Work work) {
		this.work = work;
	}
	public void run() {
		Random random = new Random();
		Data data = new Data();
		int n1 = random.nextInt(1000);
		int n2 = random.nextInt(2000);
		int n3 = random.nextInt(3000);
		System.out.println("回调前：");
		System.out.println(String.valueOf(n1) + "+" + String.valueOf(n2) + "+" + String.valueOf(n3) + "=" + data.value);
		work.process(data, n1, n2, n3); // 使用回调函数
		System.out.println("回调后：");
		System.out.println(String.valueOf(n1) + "+" + String.valueOf(n2) + "+" + String.valueOf(n3) + "=" + data.value);
	}
}
public class ParamDeliveryTest3 {
	
	public static void main(String[] args) {
		Thread thread = new MyThread3(new Work()); 
		thread.start(); 
	}

}
