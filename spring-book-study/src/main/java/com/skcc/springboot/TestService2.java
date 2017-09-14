package com.skcc.springboot;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("!s1")
public class TestService2 implements TestService{

	@Value("${test.string:Called Test Service 22222}")
	private String testString;
	
	@Override
	public String getString() {
		return testString;
//		return "Returned Stringinging";
	}	
}
