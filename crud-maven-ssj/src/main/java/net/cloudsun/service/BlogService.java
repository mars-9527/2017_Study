package net.cloudsun.service;

import java.util.List;

import net.cloudsun.dao.BlogDao;
import net.cloudsun.entity.Blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BlogService {
	
	@Autowired
	public BlogDao blogDao;
	
	
	public List<Blog> query(){
		List<Blog> list = blogDao.getList("select * from Blog");
		return list;		
	}


	public void delete(Integer id) {
		
		blogDao.delete(id);
		
	}


	public Blog getEntityById(Integer id) {
		// TODO Auto-generated method stub
		return blogDao.find(id);
	}


	public void save(Blog blog) {
		
		
		blogDao.create(blog);
		
	}


	public void update(Blog blog) {

		blogDao.update(blog);
		
	}

}
