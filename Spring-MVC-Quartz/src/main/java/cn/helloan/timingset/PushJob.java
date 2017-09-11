package cn.helloan.timingset;

import java.text.SimpleDateFormat;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class PushJob implements Job {

	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		
        System.out  
        .println("-----------------------定时发送----------------------------------------------");  
		Object object = context.getJobDetail().getJobDataMap().get("message");  
		Object msgService = context.getJobDetail().getJobDataMap().get(  
		        "msgService");  
		 
		  
		System.out.println("定时消息启动，消息标题为:" + "消息ID"   );  
		 
		SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd" + " "  
		        + "HH:mm:ss");  
		String pushTime = tempDate.format(new java.util.Date());  
		
		System.out.println(" ad msgMessage:" );  
		
		try {  
		    System.out.println("进入推送");  
		   
		} catch (Exception e) {  
		    
		    e.printStackTrace();  
		}  
		
		System.out  
		        .println("-----------------------定时发送结束----------------------------------------------");  
}  


}
