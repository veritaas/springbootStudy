package com.skcc.springboot;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.LinkedList;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DataStructureTest {
	@Test 
	public void test() {
		LinkedList<String> ds = new LinkedList<>();
		ds.add("1");
		ds.add("2");
		ds.add("3");
		ds.add("4");
		ds.add("5");
		ds.add("6");
		
//		log.debug("{}", ds.removeFirst());
	}
}
