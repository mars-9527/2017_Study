package net.cloudsun.dao;

import java.util.List;

import javax.persistence.Query;

import net.cloudsun.entity.Blog;

import org.springframework.stereotype.Repository;

@Repository
public class BlogDaoImpl extends GenericDaoImpl<Blog> implements BlogDao{
	

	@Override
	public List<Blog> query() {
		String sql="SELECT * FROM blog";
		Query query = this.em.createNativeQuery(sql,Blog.class);
		
		@SuppressWarnings("unchecked")
		List<Blog> list = query.getResultList();

		return list;
	}

	

	@Override
	public Blog find(Integer id) {
		// TODO Auto-generated method stub
		return this.em.find(Blog.class, id);
	}

	@Override
	public void create(Blog blog) {
		this.em.persist(blog);
	}

	@Override
	public void update(Blog blog) {
		this.em.merge(blog);
		
	}

}
