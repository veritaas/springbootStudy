package com.skcc.springboot.user.dao;

import com.skcc.springboot.user.dao.User;
import org.junit.Test; 
import org.junit.runner.RunWith; 
//import org.slf4j.Logger; 
//import org.slf4j.LoggerFactory; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.context.SpringBootTest; 
import org.springframework.test.context.junit4.SpringRunner; 


@RunWith(SpringRunner.class) 
@SpringBootTest 
public class UserMapperTest { 
 
//     private final Logger logger = LoggerFactory.getLogger(this.getClass()); 
 
     @Autowired 
     UserMapper userMapper; 
 
 
     @Test 
     public void test() { 
         User user = userMapper.selectById(0); 
         assert user.getName().equals("Rex"); 
     } 
 
 
     @Test 
     public void test2() { 
         int count = userMapper.selectAll().size(); 
         User user = new User(1, "Kim", 30); 
         
         userMapper.insert(user); 
         assert userMapper.selectById(1).getName().equals("Kim"); 
 
         userMapper.delete(1); 
         assert userMapper.selectAll().size() == count; 

 
     }

}
