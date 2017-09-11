package cn.helloan.quartz.concurrent;

import java.util.Date;

public class JobOneS {
	
	public void execute(){  
        System.out.println("execute JobOne("+new Date()+")");  
        try {  
            Thread.sleep(1000000);  
        }catch(InterruptedException ire) {  
              
        }  
    }  

}
