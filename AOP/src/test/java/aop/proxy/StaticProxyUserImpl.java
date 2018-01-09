package aop.proxy;

import aop.entity.User;
import aop.service.UserService;

public class StaticProxyUserImpl implements UserService {

	// 目标接口
	private UserService service;

	// 通过接口关联实现类，在构造方法里面对目标对象进行代理
	public StaticProxyUserImpl(UserService service) {
		this.service = service;
	}

	// 新增方法，需要满足的业务新需求。
	private void checkSecurity() {
		System.out.println("安全检查---------");
	}

	public void add(User user) {
		checkSecurity();
		service.add(user);
	}

	public void delete(long uuid) {
		checkSecurity();
		service.delete(uuid);
	}

	public void update(long uuid) {
		checkSecurity();
		service.update(uuid);

	}

	public void getUserInfo(long uuid) {
		checkSecurity();
		service.getUserInfo(uuid);
	}

}
