package com.grv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.grv.logExample.LogConfig;

@SpringBootApplication
public class SpringBootLoggingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingExampleApplication.class, args);
		LogConfig.testMethod();
	}

}
