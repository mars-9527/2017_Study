package com.multithread.test;

class Runna implements Runnable { 
	private String name; 
	public Runna(String name) {
		super();
		this.name = name;
	}
	public void run() { 
	System.out.println("hello " + name); 
	} 
}

public class ParamDeliveryTest2 {
	
	public static void main(String[] args) {
		Runna runna=new Runna("world");
		new Thread(runna).start();
	}

}
