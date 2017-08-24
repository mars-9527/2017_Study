package aop;

import aop.entity.User;
import aop.proxy.StaticProxyUserImpl;
import aop.service.UserService;
import aop.service.impl.UserServiceImpl;

public class StaticProxyDemo3 {
	
	public static void main(String[] args) 
	{
		User user = new User();
		user.setName("张三");
		user.setPassword("1234");
		
		//-------第一步测试
		UserService service = new UserServiceImpl();
		service.add(user);
		service.delete(3);
		service.update(3);
		service.getUserInfo(3);
		System.out.println("===============================================================");
		//-------加了checkSecurity()方法，第二步测试
		UserService service2 = new StaticProxyUserImpl(new UserServiceImpl());
		service2.add(user);
		service2.delete(3);
		service2.update(3);
		service2.getUserInfo(3);		
	}
}
