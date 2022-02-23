package com.grv.logExample;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {
	
	private static Logger log = LoggerFactory.getLogger("com.baeldung");
	private static Logger log2 = LoggerFactory.getLogger("com.baeldung.second");
	
	public static void testMethod() {
		log.info("Hello log1");
		log2.info("Hello log2");
		log.warn("Warning for log1");
		log2.warn("Warning for log2");
	}
}
