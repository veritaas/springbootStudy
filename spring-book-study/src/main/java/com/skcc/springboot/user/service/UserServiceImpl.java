package com.skcc.springboot.user.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.skcc.springboot.user.dao.User;
import com.skcc.springboot.user.dao.UserMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired 
    private UserMapper userMapper;
	 
	
	@Override
	public List<User> getUserList() {
		return userMapper.selectAll();
	}
	
	@Override
	public User getUserById(int id) {
		return userMapper.selectById(id);
	}	
	
	@Override
	public int insertUser(User user) {
		return userMapper.insert(user);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public int updateUser(User user) {
		return userMapper.update(user);
	}
	
	@Override
	public int deleteUser(int id) {
		return userMapper.delete(id);
	}

}
