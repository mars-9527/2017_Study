package cn.helloan.mapper;

import java.util.List;

import cn.helloan.entity.Employee;






/**
 * 配置文件形式
 * @author Mars
 *
 */
public interface EmployeeMapper{
	
	public void add(Employee person);
	public void delete(Integer id);
	public void update(Employee person);
	public Employee getPersonById(Integer id);
	public List<Employee> getAll();
}

//PersonDao----PersonDaoImpl.java---->

//PersonMapper--PersonMapper.xml