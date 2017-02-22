package cn.helloan.mapper;

import java.util.List;

import cn.helloan.entities.Person;





public interface PersonMapper
{
	public void add(Person person);
	public void delete(Integer id);
	public void update(Person person);
	public Person getPersonById(Integer id);
	public List<Person> getAll();
}

//PersonDao----PersonDaoImpl.java---->

//PersonMapper--PersonMapper.xml