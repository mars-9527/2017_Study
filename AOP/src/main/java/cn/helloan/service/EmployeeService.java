package cn.helloan.service;

import java.util.List;

import cn.helloan.entity.Employee;

public interface EmployeeService {
	
	void add(Employee user) ;
	
	List<Employee> getAll();

	void delete(Integer id);

	Employee getEntityById(Integer id);

	void update(Employee employee);

}
