package cn.helloan.mapper;

import java.util.List;

import cn.helloan.entity.Person;






/**
 * 配置文件形式
 * @author Mars
 *
 */
public interface PersonMapper{
	
	public void add(Person person);
	public void delete(Integer id);
	public void update(Person person);
	public Person getPersonById(Integer id);
	public List<Person> getAll();
}

//PersonDao----PersonDaoImpl.java---->

//PersonMapper--PersonMapper.xml