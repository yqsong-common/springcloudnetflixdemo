package com.yqsong.servicedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.yqsong"})
@SpringBootApplication
public class ServiceDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceDemoApplication.class, args);
	}
	
}
