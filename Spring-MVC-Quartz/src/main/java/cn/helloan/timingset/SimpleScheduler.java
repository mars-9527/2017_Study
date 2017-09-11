package cn.helloan.timingset;

import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
  
import org.apache.commons.logging.Log;  
import org.apache.commons.logging.LogFactory;  
import org.quartz.JobDetail;  
import org.quartz.Scheduler;  
import org.quartz.SchedulerException;  
import org.quartz.SimpleTrigger;  
import org.quartz.impl.StdSchedulerFactory;  
  

  
public class SimpleScheduler {  
  
    private Scheduler scheduler = null;  
  
    private SimpleScheduler() throws SchedulerException {  
        scheduler = createScheduler();  
    }  
  
    private static SimpleScheduler instance;  
  
    public static synchronized SimpleScheduler getSimpleScheduler()  
            throws SchedulerException {  
        if (instance == null) {  
            instance = new SimpleScheduler();  
        }  
        return instance;  
    }  
  
    static Log logger = LogFactory.getLog(SimpleScheduler.class);  
  
    public static void main(String[] args) throws SchedulerException,  
            ParseException {  
        SimpleScheduler simple = new SimpleScheduler();  
        try {  
            // Create a Scheduler and schedule the Job  
            Scheduler scheduler = simple.createScheduler();  
  
            String ddd = "2017-01-19 17:48:30";  
            Date d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ddd);  
  
            //simple.scheduleJob(d, PushJob.class);  
            scheduler.start();  
            logger.info("Scheduler started at " + new Date());  
        } catch (SchedulerException ex) {  
            logger.error(ex);  
        }  
  
    }  
  
    public Scheduler createScheduler() throws SchedulerException {// 创建调度器  
        return StdSchedulerFactory.getDefaultScheduler();  
    }  
  
    public void scheduleJob(Date date, Object object, Long id  
            ) throws SchedulerException,  
            ParseException {  
        String dateStr = new SimpleDateFormat().format(date);  
        dateStr = id + dateStr;  
        System.out.println("调度类名称为：" + dateStr);  
  
        JobDetail jobDetail = new JobDetail(dateStr, Scheduler.DEFAULT_GROUP,  
                PushJob.class);  
        // jobDetail.getJobDataMap().put("SCAN_DIR", "D:\\Tomcat\\conf");  
        jobDetail.getJobDataMap().put("message", object);  
  
        SimpleTrigger trigger = new SimpleTrigger(dateStr, "triggerGroup-s1");  
        // TriggerUtils.makeSecondlyTrigger(3);// 每10秒触发一次  
        // trigger.setName("scanTrigger");  
        /* 
         * String ddd = "2012-01-05 19:22:00"; Date d = new 
         * SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ddd); 
         * trigger.setStartTime(d);// 设置第一次触发时间 
         */  
        /* 
         * String ddd = "2012-01-06 19:00:00"; Date d = new 
         * SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(ddd); 
         */  
        trigger.setStartTime(date);  
        scheduler.scheduleJob(jobDetail, trigger);  
        System.out.println("创建scheduler");  
  
        // removeJob("ScanDirectory", Scheduler.DEFAULT_GROUP);  
    }  
    /* 
     * public boolean removeJob(String jobName, String group) throws 
     * SchedulerException { scheduler.pauseJob(jobName, group); return 
     * scheduler.deleteJob(jobName, group); } 
     */  
}  
