package cn.helloan.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.helloan.entity.User;
/**
 * 注解形式
 * @author Mars
 *
 */
public interface UserMapper{
	
	@Select(value = { "select username, password  from user where username = #{username,jdbcType=VARCHAR}" })
	List<User> selectId(@Param("username") String username);
}