package com.skcc.springboot.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skcc.springboot.user.dao.User;
import com.skcc.springboot.user.service.UserService;
import com.skcc.springboot.user.service.UserServiceImpl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(path="/test", method=RequestMethod.GET)
@RequestMapping(path="/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	@RequestMapping(path="/errorTest", method=RequestMethod.GET )
	@ResponseBody
	public String getError() {
		
		throw new RuntimeException("manually raise Error!!!");
	}
	
		
	@ResponseBody
	@RequestMapping(path={"","/"}, method=RequestMethod.GET)
	public List<User> getUserList() {
		logger.info("ServiceStart >>>>>>>>>>> !!!!");
		//UserService userService = new UserServiceImpl();
		userService.getUserList();
		logger.info("Result >>>>>>>>>>> {}", userService.getUserList());
		return userService.getUserList();
//		return null;
		
	}
	@RequestMapping(path="/{id}", method=RequestMethod.GET )
	@ResponseBody
	public User getUserById(@PathVariable int id) {		
		return userService.getUserById(id);
		
	}
	
	@RequestMapping(path= {"","/"}, method=RequestMethod.POST )
	@ResponseBody
	public int postUser(@RequestBody User user) {		
		return userService.insertUser(user);
		
	}
}
