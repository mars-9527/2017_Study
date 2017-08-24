package aop;

import aop.entity.User;
import aop.service.UserService;
import aop.service.impl.UserServiceImpl;

public class StaticProxyDemo2 {
	
	public static void main(String[] args) 
	{
		User user = new User();
		user.setName("张三");
		user.setPassword("1234");
		
		UserService service = new UserServiceImpl();
		service.add(user);
		service.delete(3);
		service.update(3);
		service.getUserInfo(3);
	}


}
