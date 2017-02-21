package net.cloudsun.service;

import java.util.List;

import net.cloudsun.dao.BlogUserDao;
import net.cloudsun.entity.BlogUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
@Transactional
public class BlogUserService {
	
	@Autowired
	private BlogUserDao userDao;

	public List<BlogUser> getAllUser() {
		
		return userDao.getAll();
	}	

}
