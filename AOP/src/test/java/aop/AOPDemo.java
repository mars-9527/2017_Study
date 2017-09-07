package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.entity.User;
import aop.service.UserService;

public class AOPDemo {

	public static void main(String[] args) {
		User user = new User();
		user.setName("张三");
		user.setPassword("1234");

		ApplicationContext ac = new ClassPathXmlApplicationContext("AOP.xml");
		UserService service = (UserService) ac.getBean("userServiceImpl");
		service.add(user);
		System.out.println();
		service.delete(1);
		System.out.println();
		service.update(1);
		service.getUserInfo(1);
		((ClassPathXmlApplicationContext) ac).close();

	}
}
