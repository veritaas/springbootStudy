package com.skcc.springboot;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.skcc.springboot.user.dao.User;
import com.skcc.springboot.user.service.UserService;
import com.skcc.springboot.user.service.UserServiceImpl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping(path="/test", method=RequestMethod.GET)
@RequestMapping(path="/test")
public class TestController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	private TestService testService;
	
	public TestController(TestService testService){
		this.testService = testService;
	}
	
	@RequestMapping(path="/string", method=RequestMethod.GET )
	@ResponseBody
	public String getString() {
		
		String result = testService.getString();
		logger.debug("debug >>>>>>>>>>> {}", result);
		logger.info("info >>>>>>>>>>> {}", result);
		logger.error("Error >>>>>>>>>>> {}", result);
		return result;
	}
	@RequestMapping(path="/errorTest", method=RequestMethod.GET )
	@ResponseBody
	public String getError() {
		
		throw new RuntimeException("manually raise Error!!!");
	}
	
	@Autowired
	UserService userService;
	@RequestMapping(path="/userlist", method=RequestMethod.GET )
	@ResponseBody
	public List<User> getUserList() {
		logger.info("ServiceStart >>>>>>>>>>> !!!!");
		//UserService userService = new UserServiceImpl();
		userService.getUserList();
		logger.info("Result >>>>>>>>>>> {}", userService.getUserList());
		return userService.getUserList();
//		return null;
		
	}
	@RequestMapping(path="/user", method=RequestMethod.GET )
	@ResponseBody
	public User getUserById(int id) {
		UserService userService = new UserServiceImpl();
		return userService.getUserById(id);
		
	}
}
