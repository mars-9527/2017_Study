package cn.helloan.timingset;

import java.util.Calendar;
import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleS {
	
	public static void main(String[] args) {
		try {
			new SimpleS().task();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	
	public void task() throws SchedulerException 

	{ 

	//通过SchedulerFactory来获取一个调度器 

	SchedulerFactory schedulerFactory = new StdSchedulerFactory(); 

	Scheduler scheduler = schedulerFactory.getScheduler(); 

	//引进作业程序 

	JobDetail jobDetail = 

	new JobDetail("jobDetail-s1", "jobDetailGroup-s1", SimpleQuartzJob.class); 

	//new一个触发器 

	SimpleTrigger ssTrigger = 

	new SimpleTrigger("ssTrigger", "triggerGroup-s1"); 

	//设置作业启动时间 

	Calendar calendar = Calendar.getInstance();
    
    /**
     * 指定触发的时间      现在指定时间为   2013年10月27号  15点  43 分 1 秒时触发
     */
	calendar.set(Calendar.YEAR,2017);
    calendar.set(Calendar.DAY_OF_MONTH,4);//设置日期为27号
    calendar.set(Calendar.MONTH, 8);//设置日期为11月份   这里10表示11月份    11就表示12月份
    calendar.set(Calendar.HOUR_OF_DAY, 17); //设置15点的时候触发
    calendar.set(Calendar.MINUTE, 24); //设置43分钟的时候触发
    calendar.set(Calendar.SECOND, 1); //设置第一秒的时候触发
    
    Date ctime = calendar.getTime();
    System.out.println("定时任务指定时间为:"+ctime.toLocaleString()+",当前时间为:"+new Date().toLocaleString());

	ssTrigger.setStartTime(ctime); 

	//设置作业执行间隔 

	ssTrigger.setRepeatInterval(0); 

	//设置作业执行次数 

	ssTrigger.setRepeatCount(0); 
	
	

	//设置作业执行优先级默以为5 

	//ssTrigger.setPriority(10); 

	//作业和触发器设置到调度器中 
	

	scheduler.scheduleJob(jobDetail, ssTrigger); 

	//启动调度器 

	scheduler.start(); 

	} 

}
