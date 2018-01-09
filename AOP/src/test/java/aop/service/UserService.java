package aop.service;

import aop.entity.User;

public interface UserService {

	public void add(User user);

	public void delete(long uuid);

	public void update(long uuid);

	public void getUserInfo(long uuid);

}

