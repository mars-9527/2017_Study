package cn.helloan.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.helloan.entity.Employee;
import cn.helloan.mapper.EmployeeMapper;
import cn.helloan.service.EmployeeService;
@Service
@Transactional(readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper personMapper;
	
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public void add(Employee user) {
		personMapper.add(user);
		
	}
	
	public List<Employee> getAll(){
		List<Employee> all = personMapper.getAll();
		return all;
	}
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public void delete(Integer id) {
		personMapper.delete(id);
	}

	public Employee getEntityById(Integer id) {
		return personMapper.getPersonById(id);
	}
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public void update(Employee employee) {
		personMapper.update(employee);
	}

}
