/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.test.test.dao.test;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.test.test.entity.test.TestUser;

/**
 * 测试DAO接口
 * @author Mars9527
 * @version 2017-09-25
 */
@MyBatisDao
public interface TestUserDao extends CrudDao<TestUser> {
	
}