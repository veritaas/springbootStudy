package com.skcc.springboot.user.service;

import org.slf4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;

import com.skcc.springboot.user.dao.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@Test
	public void selectOne() {
		User user = userService.getUserById(0);
		logger.info("{}", user);
	}
	
	@Test
	public void update() {
		User userParam = new User(0,"이십오",30);
		int result = userService.updateUser(userParam);
		logger.info("{}", result);
	}
	@Test
	public void insert() {
		User userParam = new User(20,"이십오",30);
		int result = userService.insertUser(userParam);
		logger.info("{}", result);
	}
	@Test
	public void delete() {
		
		int result = userService.deleteUser(0);
		logger.info("{}", result);
	}
}
