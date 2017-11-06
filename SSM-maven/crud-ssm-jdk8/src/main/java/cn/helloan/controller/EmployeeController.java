package cn.helloan.controller;

import cn.helloan.entity.Employee;
import cn.helloan.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value="/empoyee")
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloAction.class);
	@Resource
	private EmployeeService employeeService;
	
	/**
	 * 列表查询
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String getList(Map<String, Object> map){
		logger.debug("getList 开始执行！");
		List<Employee> all = employeeService.getAll();
		map.put("list", all);
		return "person/list";
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Integer id){
		employeeService.delete(id);
		return "redirect:/empoyee/list";
	}
	/**
	 * 跳转到新增页面
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String input( Map<String, Object> map){
		map.put("employee", new Employee());
		return "person/input";
	}
	/**
	 * 保存操作
	 * @param employee
	 * @return
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(Employee employee){
		
		employeeService.add(employee);

		return "redirect:/empoyee/list";
	}
	/**
	 * 跳转到编辑页面
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/{id}")
	public String edit(@PathVariable("id") Integer id,Map<String, Object> map){
		Employee employee=employeeService.getEntityById(id);
		map.put("employee", employee);
		return "person/edit";
	}
	/**
	 * 更新操作
	 * @param employee
	 * @return
	 */
	@RequestMapping(value="update",method=RequestMethod.PUT)
	public String update(Employee employee){
		
		
		employeeService.update(employee);
		
		return "redirect:/empoyee/list";
	}

}
