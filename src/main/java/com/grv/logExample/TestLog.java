package com.grv.logExample;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
	
	private static Logger log = LoggerFactory.getLogger("test1");
	private static Logger log2 = LoggerFactory.getLogger("test2");
	
	public static void testMethod() {
		log.info("Hello log1");
		log2.info("Hello log2");
		log.warn("Warning for log1");
		log2.warn("Warning for log2");
	}
}
