package aop;

import aop.entity.User;
import aop.proxy.CGlibProxyImpl;
import aop.service.impl.UserServiceImpl;

public class CGlibProxyDemo {
	
	public static void main(String[] args) 
	{
		User user = new User();
		user.setName("张三");
		user.setPassword("1234");
		
		UserServiceImpl service = (UserServiceImpl)new CGlibProxyImpl().getProxyInstance(new UserServiceImpl());
		service.add(user);
		service.delete(3);
		service.update(3);
		service.getUserInfo(3);
	}


}
