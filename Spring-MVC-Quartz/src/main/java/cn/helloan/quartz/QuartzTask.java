package cn.helloan.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;


public class QuartzTask {


	public void run() {
		
		System.out.println(new SimpleDateFormat("yy年MM月dd日 HH时mm分ss秒").format(new Date()));
		
	}

}
