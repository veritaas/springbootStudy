package com.skcc.springboot; 
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import com.skcc.springboot.user.dao.User;

import static org.hamcrest.CoreMatchers.is; 
import static org.hamcrest.CoreMatchers.not; 
import static org.junit.Assert.assertThat; 

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("s1")
public class UserTest { 
     private final Logger logger = LoggerFactory.getLogger(this.getClass()); 
     
     @Test 
     public void test() { 
         User user = new User(0, "Shim", 37); 
         logger.debug("{}", user); 
     } 
     @Test 
     public void test2() { 
    	 User user = new User(0, "Shim", 37); 
    	 logger.debug("{}", user); 
     } 
 
 
     @Test 
     public void equalsTest() { 
         User user1 = new User(0, "Shim", 37); 
         User user2 = new User(0, "Shim", 37); 
         User user3 = new User(1, "Shim", 37); 
 
         assertThat(user1, is(user2)); 
         assertThat(user2, is(not(user3))); 
 
 
     } 
 } 
