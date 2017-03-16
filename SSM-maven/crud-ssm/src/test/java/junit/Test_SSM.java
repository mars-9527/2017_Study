package junit;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.helloan.entity.Employee;
import cn.helloan.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:context/spring-root.xml"})//
//locations={"classpath:context/root-context.xml","classpath:common-spring/**.xml"} 多个
public class Test_SSM {
	@Resource
	private EmployeeService personService;

	@Test
	public void test() {
		List<Employee> all = personService.getAll();
		for (Employee person : all) {
			System.out.println(person);
		}
	}

}
