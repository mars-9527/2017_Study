package com.redrat.interfaces;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import cn.redrat.pojo.Message;

/**
 * 爬虫接口的实现类
 * @author jimisun
 *
 */
public class Spider implements ISpider {
	
	//爬虫的来源
	protected String crawSource (String url) throws Exception, Exception {
/*		使用HttpClient发送请求、接收响应很简单，一般需要如下几步即可。
		1. 创建HttpClient对象。
		2. 创建请求方法的实例，并指定请求URL。如果需要发送GET请求，创建HttpGet对象；如果需要发送POST请求，创建HttpPost对象。
		3. 如果需要发送请求参数，可调用HttpGet、HttpPost共同的setParams(HetpParams params)方法来添加请求参数；对于HttpPost对象而言，也可调用setEntity(HttpEntity entity)方法来设置请求参数。
		4. 调用HttpClient对象的execute(HttpUriRequest request)发送请求，该方法返回一个HttpResponse。
		5. 调用HttpResponse的getAllHeaders()、getHeaders(String name)等方法可获取服务器的响应头；调用HttpResponse的getEntity()方法可获取HttpEntity对象，该对象包装了服务器的响应内容。程序可通过该对象获取服务器的响应内容。
		6. 释放连接。无论执行方法是否成功，都必须释放连接*/
		CloseableHttpClient httpClient = HttpClientBuilder.create().build();
		CloseableHttpResponse httpResponse = httpClient.execute(new HttpGet(url));
		String result = EntityUtils.toString(httpResponse.getEntity());
		
		return result;
		
	}
	public List<Message> getList(String url) {
		String result = null;
		
		//创建用于返回的list数组 储存Message
		List<Message> list = new ArrayList<Message>();
		
		//创建一个空的Message对象
		Message msg = null;
		
		try {
			result = crawSource(url);
			//根据爬虫来源返回的数据 解析成doc文档
			org.jsoup.nodes.Document doc = Jsoup.parse(result);
			//重doc文档中查找指定节点 返回该节点
			Elements es = doc.select(".b_algo h2 a");
			//从es中解析每条搜索结果赋值并添加到List<Message>()中
			for (Element e : es) {
					msg = new Message();
					msg.setTitle(e.html());
					msg.setUrl(e.attr("href"));
					msg.setContent(e.parent().parent().select(".b_caption").html());
					list.add(msg);
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

}
