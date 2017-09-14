package com.skcc.springboot.user.service;

import java.util.List;
import com.skcc.springboot.user.dao.*;

public interface UserService {

	public List<User> getUserList();
	public User getUserById(int id);
	public int insertUser(User user);
	public int updateUser(User user);
	public int deleteUser(int id);
}
