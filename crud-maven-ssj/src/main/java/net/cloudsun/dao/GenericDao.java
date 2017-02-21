package net.cloudsun.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

public interface GenericDao<T> {
	
	 /**
     * 获得JPA实体管理器（不建议使用，因为数据库的实现可能不是JPA，比如
     * <ul>
     * <li>Hibernate</li>
     * <li>JDO</li>
     * <li>JTO</li>
     * <li>IBatis</li>
     * <li>MyBatis</li>
     * <li>JDBC</li>
     * <li>JDBC-ODBC-Bridge</li>
     * <li>native-ODBC</li>
     * </ul>
     * 
     * @return JPA实体管理器
     */
    EntityManager getEntityManager();
    
    
    /**
     * 通过原始SQL获取int
     * @param sql
     * @return
     */
    int getIntByNativeSQL(String sql);

    /***
     * 通过原始ＳＱＬ获取BigDecimal
     * @param sql
     * @return
     */
	BigDecimal getBigDecimalByNativeSQL(String sql);
	
	
	List<T> getList(String sql);


	void delete(Object id);


}
