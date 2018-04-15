package cn.redrat.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.redrat.interfaces.Spider;

import cn.redrat.pojo.Message;

/**
 * 进行搜索的Servlet
 * @author jimisun
 *
 */
@WebServlet("/doSearch")
public class DoSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//设置从页面获取值的编码
		request.setCharacterEncoding("utf-8");
		
		//从页面获取key的值
		String key = request.getParameter("key");
		
		//获取页面传递过来的页码
		String currentPage = request.getParameter("currentPage");
		
		//过滤传递过来的key的值,使特殊符号变成+,支持多次搜索
		key = key.replaceAll("<(S*?)[^>]*>.*?|<.*? />", "");
		key = key.replaceAll(" ", "+");
		
		//判断currentPage是否为空,如果为Null使其赋值为第一页
		if (currentPage == null || "".equals(currentPage))
			currentPage = "1";
		int first = (Integer.parseInt(currentPage) - 1) * 10 + 1;
		
		//拼接url的路径
		String url = "http://cn.bing.com/search?q=site%3Apan.baidu.com+" + key+ "&first=" + first;
		
		//new 爬虫接口的实现类
		Spider spider = new Spider();
		List<Message> list = spider.getList(url);
		
		//将得到的数据存到request域对象中 Application Session request PageContext
		request.setAttribute("list", list);
		request.setAttribute("key", key);
		
		//请求转发到搜索结果页面
		request.getRequestDispatcher("content.jsp").forward(request, response);
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
