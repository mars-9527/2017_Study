package cn.helloan.quartz.concurrent;

import java.util.Date;

public class JobTwo {
	
	public   void  execute(){  
        System.out.println("execute JobTwo(" + new  Date()+ ")" );  
    }  

}
