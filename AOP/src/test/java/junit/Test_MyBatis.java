package junit;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.helloan.entity.Employee;
import cn.helloan.service.EmployeeService;

public class Test_MyBatis {
	
	private ApplicationContext ctx = null;
	
	private EmployeeService personService;
	
	
	@Before
	public void init()
	{
		ctx = new ClassPathXmlApplicationContext("/context/spring-root.xml");
		personService=ctx.getBean(EmployeeService.class);
	}

	@Test
	public void testConn() {
		System.out.println(personService);
	}
	@Test
	public void testAdd() throws IOException {
		Employee person = new Employee();
		person.setAge(22);
		person.setBirth(new Date());
		person.setName("z4");
		person.setRegisterTime(new Date());
		person.setSalary(9500.35);
		personService.add(person);
	}
	@Test
	public void testGetAll() {
		List<Employee> all = personService.getAll();
		for (Employee person : all) {
			System.out.println(person);
		}
	}

}
