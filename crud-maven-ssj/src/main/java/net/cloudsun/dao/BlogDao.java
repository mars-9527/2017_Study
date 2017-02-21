package net.cloudsun.dao;

import java.util.List;

import net.cloudsun.entity.Blog;

public interface BlogDao extends GenericDao<Blog> {

	List<Blog> query();

	

	Blog find(Integer id);

	void create(Blog blog);

	void update(Blog blog);

}
