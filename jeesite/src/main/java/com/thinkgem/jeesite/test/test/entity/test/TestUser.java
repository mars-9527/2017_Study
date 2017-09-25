/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.test.test.entity.test;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 测试Entity
 * @author Mars9527
 * @version 2017-09-25
 */
public class TestUser extends DataEntity<TestUser> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// name
	private String age;		// age
	private String job;		// job
	private String office;		// 归属部门
	
	public TestUser() {
		super();
	}

	public TestUser(String id){
		super(id);
	}

	@Length(min=1, max=64, message="name长度必须介于 1 和 64 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=1, max=11, message="age长度必须介于 1 和 11 之间")
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Length(min=1, max=64, message="job长度必须介于 1 和 64 之间")
	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	@Length(min=0, max=64, message="归属部门长度必须介于 0 和 64 之间")
	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
	
}