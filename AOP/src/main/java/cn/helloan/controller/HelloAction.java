package cn.helloan.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.helloan.entity.Employee;
import cn.helloan.service.EmployeeService;

@Controller
@RequestMapping(value="/test")
public class HelloAction {
	private static final Logger logger = LoggerFactory.getLogger(HelloAction.class);
	@Resource
	private EmployeeService personService;
	/**
	 * 这是范例
	 * @return
	 * @author Lou Ge
	 */
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		logger.debug("hello run!");
		System.out.println("hello world!");
		List<Employee> all = personService.getAll();
		for (Employee person : all) {
			System.out.println(person);
		}
		return "ok";
	}

}
