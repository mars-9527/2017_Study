package net.cloudsun.dao;

import java.util.List;

import javax.persistence.Query;

import net.cloudsun.entity.BlogUser;

import org.springframework.stereotype.Repository;

@Repository("blogUserDao")
public class BlogUserDaoImpl extends GenericDaoImpl<BlogUser> implements BlogUserDao {

	
	@Override
	public List<BlogUser> getAll() {
		String sql="SELECT * FROM blog_user";
		Query query = this.em.createNativeQuery(sql,BlogUser.class);
		
		@SuppressWarnings("unchecked")
		List<BlogUser> list = query.getResultList();
		return list;
	}


}
