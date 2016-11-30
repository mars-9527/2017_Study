package cn.helloan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/test")
public class HelloAction {
	/**
	 * 这是范例
	 * @return
	 * @author Lou Ge
	 */
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		System.out.println("hello,Mr zhou!");
		System.out.println("hello world!");
		return "ok";
	}

}
