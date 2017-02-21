package net.cloudsun.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import net.cloudsun.entity.Blog;
import net.cloudsun.entity.BlogUser;
import net.cloudsun.service.BlogService;
import net.cloudsun.service.BlogUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/blog")
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	@Autowired
	private BlogUserService userService;
	
	/**
	 * 查询
	 * @param map
	 * @return
	 * @author 娄建膑
	 * @date 2016年5月5日
	 */
	@RequestMapping("/query")
	public String list(Map<String, Object> map){
		
		List<Blog> list = blogService.query();
		
		map.put("list", list);
				
		return "list";
	}
	/**
	 * 
	 * @param id
	 * @return
	 * @author 娄建膑
	 * @date 2016年5月5日
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		blogService.delete(id);
		return "redirect:/blog/query";
	}
	
	
	
	/**
	 * 转到新增页面
	 * @param map
	 * @return
	 * @author 娄建膑
	 * @date 2016年5月5日
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String input( Map<String, Object> map){
		List<BlogUser> users=userService.getAllUser();
		
		map.put("users", users); 
		map.put("blog", new Blog());
		
		return "input";
	}
	
	/**
	 * 保存
	 * @param blog
	 * @return
	 * @author 娄建膑
	 * @date 2016年5月5日
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(Blog blog){
		
		blog.setCreatedTime(new Date());
		blogService.save(blog);

		return "redirect:/blog/query";
	}
	
	/**
	 * 转到编辑页面
	 * @param id
	 * @param map
	 * @return
	 * @author 娄建膑
	 * @date 2016年5月5日
	 */
	@RequestMapping(value="/{id}")
	public String edit(@PathVariable("id") Integer id,Map<String, Object> map){
		
		List<BlogUser> users=userService.getAllUser();		
		map.put("users", users); 
		map.put("blog", blogService.getEntityById(id));
		
		return "edit";
		
	}
	
	/**
	 * 更新
	 * @param blog
	 * @return
	 * @author 娄建膑
	 * @date 2016年5月5日
	 */
	@RequestMapping(value="update",method=RequestMethod.PUT)
	public String update(Blog blog){
		
		blog.setModifiedTime(new Date());
		blogService.update(blog);
		
		return "redirect:/blog/query";
	}
}
