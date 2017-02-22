package cn.helloan.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.helloan.entities.Person;
import cn.helloan.mapper.PersonMapper;

@Service
@Transactional(readOnly = true)
public class PersonService {
	@Autowired
	private PersonMapper personMapper;
	
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false,rollbackFor=Exception.class)
	public void add(Person user) throws IOException
	{
		personMapper.add(user);
		
	}
	
	public List<Person> getAll(){
		List<Person> all = personMapper.getAll();
		return all;
	}

}
