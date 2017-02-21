package net.cloudsun.dao;

import java.util.List;

import net.cloudsun.entity.BlogUser;

public interface BlogUserDao extends GenericDao<BlogUser>{

	List<BlogUser> getAll();

}
