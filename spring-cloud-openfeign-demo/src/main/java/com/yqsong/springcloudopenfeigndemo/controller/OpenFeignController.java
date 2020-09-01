package com.yqsong.springcloudopenfeigndemo.controller;

import com.yqsong.springcloudopenfeigndemo.feignclient.FeignClientDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO: 文件注释
 * <p>
 * Version  1.0.0
 *
 * @author yq.song
 * <p>
 * Date     2020/8/31 11:56
 */
@RestController
public class OpenFeignController {

	@Autowired
	private FeignClientDemo feignClientDemo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	
	@GetMapping("openfigntest")
	public String openFeignTest(){
		return feignClientDemo.serviceDemo();
	}
	
	@GetMapping("restTemplate")
	public String restTemplate1(){
		return restTemplate.getForObject("http://service-demo/",String.class);
	}
	
}
