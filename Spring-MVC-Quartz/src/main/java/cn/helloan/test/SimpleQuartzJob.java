package cn.helloan.test;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SimpleQuartzJob implements Job {

	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		
		System.out.println("定时任务执行时间为 " 

		+ new Date().toLocaleString() + " by " + context.getJobDetail().getName()); 

	}

}
