package cn.helloan.test;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.helloan.entities.Person;
import cn.helloan.service.PersonService;

public class Test_MyBatis {
	
	private ApplicationContext ctx = null;
	
	private PersonService personService;
	
	
	@Before
	public void init()
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		personService=ctx.getBean(PersonService.class);
	}

	@Test
	public void testConn() {
		System.out.println(personService);
	}
	@Test
	public void testAdd() {
		Person person = new Person();
		person.setAge(22);
		person.setBirth(new Date());
		person.setName("z4");
		person.setRegisterTime(new Date());
		person.setSalary(9500.35);
		try {
			personService.add(person);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testGetAll() {
		List<Person> all = personService.getAll();
		for (Person person : all) {
			System.out.println(person);
		}
	}

}
