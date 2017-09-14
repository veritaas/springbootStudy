package com.skcc.springboot;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggingTest {
	
	
	private final Logger logger = LoggerFactory.getLogger(LoggingTest.class);
	
	@Test
	public void testLogWrite() {
		logger.debug("debug logging");
		logger.info("debug info logging");
		logger.error("debug error logging");
	}
}
