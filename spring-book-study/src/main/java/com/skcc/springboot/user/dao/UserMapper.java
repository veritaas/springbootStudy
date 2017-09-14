package com.skcc.springboot.user.dao;

import org.apache.ibatis.annotations.*; 
import java.util.List;

import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	@Select("select * from users")
	List<User> selectAll();
	
	@Select("select * from users where id = #{id}")
	User selectById(int id);
	
	@Insert("insert into users(id, name, age) values(#{id}, #{name}, #{age});")
	int insert(User user);
	
	@Update("update users set name = #{name}, age = #{age} where id = #{id}")
	int update(User user);
	
	@Delete("delete from users where id = #{id}")
	int delete(int id);
	
}
