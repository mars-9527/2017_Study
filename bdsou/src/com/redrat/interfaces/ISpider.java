package com.redrat.interfaces;

import java.util.List;

import cn.redrat.pojo.Message;

/**
 * 定义爬虫接口类
 * @author jimisun
 *
 */
public interface ISpider {
	
	public List<Message> getList(String url);

}
