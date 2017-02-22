package cn.helloan.service;

import java.util.List;

import cn.helloan.entity.Person;

public interface PersonService {
	
	void add(Person user) ;
	
	List<Person> getAll();

}
