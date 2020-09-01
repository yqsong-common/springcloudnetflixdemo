package com.yqsong.springcloudopenfeigndemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages ={} )
@SpringBootApplication
public class SpringCloudOpenfeignDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOpenfeignDemoApplication.class, args);
	}
	
}
