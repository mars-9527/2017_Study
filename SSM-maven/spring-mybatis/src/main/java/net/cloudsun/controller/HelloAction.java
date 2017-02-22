package net.cloudsun.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/test")
public class HelloAction {
	private static final Logger logger = LoggerFactory.getLogger(HelloAction.class);
	/**
	 * 这是范例
	 * @return
	 * @author Lou Ge
	 */
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		logger.debug("hello run!");
		System.out.println("hello,Mr zhou!");
		System.out.println("hello world!");
		return "ok";
	}

}
