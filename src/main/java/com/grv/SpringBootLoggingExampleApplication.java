package com.grv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.grv.logExample.TestLog;

@SpringBootApplication
public class SpringBootLoggingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingExampleApplication.class, args);
		TestLog.testMethod();
	}

}
