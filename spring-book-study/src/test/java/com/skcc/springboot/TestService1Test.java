package com.skcc.springboot;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("s1")
public class TestService1Test {

	@Autowired
	private TestService1 testService1;
	@Test
	public void test1() {
		assertThat(testService1.getString(), is("Test Strign from Properties file"));
	}
	@Test(expected=AssertionError.class)
	public void test2() {
		assertThat(testService1.getString(), is("some"));
	}

}
