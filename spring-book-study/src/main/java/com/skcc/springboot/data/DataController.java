package com.skcc.springboot.data;

import java.util.LinkedList;
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
@RequestMapping(path="/data")
public class DataController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	DataService dataService;
	
	@ResponseBody
	@RequestMapping(path={"/get"}, method=RequestMethod.GET)
	public String getData() {
		
		return dataService.getData();
	}
	
	@ResponseBody
	@RequestMapping(path={"/put/{strValue}"}, method=RequestMethod.GET)
	public LinkedList<String> setData(@PathVariable String strValue) {
		
		return dataService.putData(strValue);
	}
	
	@ResponseBody
	@RequestMapping(path={"/stat"}, method=RequestMethod.GET)
	public LinkedList<String> getDs() {
		
		return dataService.getDs();
	}
	
	@ResponseBody
	@RequestMapping(path={"/init"}, method=RequestMethod.GET)
	public LinkedList<String> initDs() {
		
		return dataService.DataInit();
	}
	
		
//	@ResponseBody
//	@RequestMapping(path={"","/"}, method=RequestMethod.GET)
//	public List<User> getUserList() {
//		logger.info("ServiceStart >>>>>>>>>>> !!!!");
//		//UserService userService = new UserServiceImpl();
//		userService.getUserList();
//		logger.info("Result >>>>>>>>>>> {}", userService.getUserList());
//		return userService.getUserList();
////		return null;
//		
//	}
//	@RequestMapping(path="/{id}", method=RequestMethod.GET )
//	@ResponseBody
//	public User getUserById(@PathVariable int id) {		
//		return userService.getUserById(id);
//		
//	}
//	
//	@RequestMapping(path= {"","/"}, method=RequestMethod.POST )
//	@ResponseBody
//	public int postUser(@RequestBody User user) {		
//		return userService.insertUser(user);
//		
//	}
}
