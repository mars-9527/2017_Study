package net.cloudsun.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class GenericDaoImpl<T> implements GenericDao<T> {
	
	final org.slf4j.Logger _log = org.slf4j.LoggerFactory.getLogger(getClass());

	@PersistenceContext()
	protected EntityManager em;
	private Class<T> type;
	
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public GenericDaoImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		type = (Class) (pt.getActualTypeArguments()[0]);
	}

	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return em;
	}

	@Override
	public int getIntByNativeSQL(String sql) {
		Query query = this.em.createNativeQuery(sql);
		Object object = query.getSingleResult();
		if (object == null)
			return 0;
		String result = object.toString();
		return new java.math.BigDecimal(result).intValue();
	}

	@Override
	public BigDecimal getBigDecimalByNativeSQL(String sql) {
		Query query = this.em.createNativeQuery(sql);
		Object object = query.getSingleResult();
		if (object == null)
			return BigDecimal.ZERO;
		String result = object.toString();
		return new java.math.BigDecimal(result);
	}
	@Override
	public List<T> getList(String sql) {
		Query query = this.em.createNativeQuery(sql,type);
		List<T> resultList = query.getResultList();
		if(resultList!=null || resultList.size()!=0) return resultList;
		return null;
	}
	
	@Override
	public void delete(final Object id) {
		this.em.remove(this.em.getReference(type, id));
	}

	
	

}
