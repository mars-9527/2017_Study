package junit;

import java.io.IOException;

import org.apache.commons.beanutils.converters.StringArrayConverter;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;





public class Test_Jsoup {
	

	@Test
	public void test() {
		try
		{
		    Document document = Jsoup.connect("http://fund.eastmoney.com/trade/hb.html#zwf_,ms_100,sc_ljjz,st_desc").get();
		    Elements links = document.select("a[href]");  
		    for (Element link : links) 
		    {
		         System.out.println("link : " + link.attr("href"));  
		         System.out.println("text : " + link.text()); 
		         System.out.println("title : " + link.attr("title"));
		    }
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
	}
	
	@Test
	public void test1() {
		Response res;
		try {
			res = Jsoup.connect("https://fundapi.eastmoney.com/fundtradenew.aspx?ft=hb&sc=ljjz&st=desc&pi=1&pn=100&cp=&ct=&cd=&ms=100&fr=&plevel=&fst=&ftype=&fr1=&fl=0&isab=")
					.header("Accept", "*/*")
					.header("Accept-Encoding", "gzip, deflate")
					.header("Accept-Language","zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3")
					.header("Content-Type", "application/json;charset=UTF-8")
					.header("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64; rv:48.0) Gecko/20100101 Firefox/48.0")
					.timeout(10000).ignoreContentType(true).execute();//.get();
			String body = res.body();
			JSONObject json = JSONObject.fromObject(body);
			System.out.println(json.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//.get();
	}
	@Test
	public void test2() {
		try{
			boolean end=false;
			int page=1;
			while (!end) {
				Document document = Jsoup.connect("https://fundapi.eastmoney.com/fundtradenew.aspx?ft=hb&sc=ljjz&st=desc&pi="+page+"&pn=100&cp=&ct=&cd=&ms=100&fr=&plevel=&fst=&ftype=&fr1=&fl=0&isab=").get();
				Elements link = document.select("body");  
				String text = link.text();
				String pre="var rankData = ";
				String content = text.substring(pre.length(),text.length()-1);
				JSONObject json = JSONObject.fromObject(content);
				JSONArray jsonArray = (JSONArray) json.get("datas");
				for (Object object : jsonArray) {
					String entityStr=object+"";
					char charAt = entityStr.charAt(6);
					String[] entityArray = entityStr.split(charAt+"");
					for (String element : entityArray) {
						System.out.println(element);
					}
				}
				int allPages = Integer.parseInt(json.get("allPages")+"");
				int pageIndex = Integer.parseInt(json.get("pageIndex")+"");
				if(pageIndex==allPages) end=true;
				page++;
			}
		} 
		catch (IOException e){
		    e.printStackTrace();
		}
	}
	@Test
	public void test3() {
		boolean end=false;
		int page=1;
		while (!end) {
			String url="https://fundapi.eastmoney.com/fundtradenew.aspx?ft=hb&sc=ljjz&st=desc&pi="+page+"&pn=100&cp=&ct=&cd=&ms=100&fr=&plevel=&fst=&ftype=&fr1=&fl=0&isab=";
			String result = netWorkUtil(url);
			String pre="var rankData = ";
			String content = result.substring(pre.length(),result.length()-1);
			JSONObject json = JSONObject.fromObject(content);
			System.out.println("content==="+content);
			JSONArray jsonArray = (JSONArray) json.get("datas");
			for (Object object : jsonArray) {
				String entityStr=object.toString();
				System.out.println(entityStr);
				String[] entityArray = entityStr.split("\\|");
				for (String element : entityArray) {
					System.out.println(element);
				}
			}
			int allPages = Integer.parseInt(json.get("allPages")+"");
			int pageIndex = Integer.parseInt(json.get("pageIndex")+"");
			if(pageIndex==allPages) end=true;
			page++;
		}
	}
	
	String netWorkUtil(String url) {
		CloseableHttpClient httpCilent = HttpClients.createDefault();
		RequestConfig config = RequestConfig.custom().
        		setConnectionRequestTimeout(10000 ).setConnectTimeout(10000 )
        		.setSocketTimeout(10000 )
        		.build();
		HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(config);
        String srtResult = "";
        try {
        	CloseableHttpResponse httpResponse = httpCilent.execute(httpGet);
            if(httpResponse.getStatusLine().getStatusCode() == 200){
                srtResult = EntityUtils.toString(httpResponse.getEntity(),"UTF-8");//获得返回的结果
                System.out.println(srtResult);
            }else if(httpResponse.getStatusLine().getStatusCode() == 400){
                //..........
            }else if(httpResponse.getStatusLine().getStatusCode() == 500){
                //.............
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                httpCilent.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
		return srtResult;
	}
}
