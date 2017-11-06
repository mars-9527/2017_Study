package cn.helloan.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.helloan.entity.User;
import cn.helloan.mapper.UserMapper;
import cn.helloan.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper dao;
	
	public boolean doUserLogin(User user) {
		List<User> list = dao.selectId(user.getUsername());
		if(list.size() == 0){
			return false;
		}else{
			if(list.get(0).getPassword().equals(user.getPassword())){				
				return true;
			}else{
				return false;
			}			
		}
	}	
}
