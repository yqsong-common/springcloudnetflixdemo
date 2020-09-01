package com.yqsong.springcloudopenfeigndemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <p>
 * Version  1.0.0
 *
 * @author yq.song
 * <p>
 * Date     2020/8/31 11:50
 */
@RestController
public class ServiceDemoController {

	@GetMapping("servicedemo")
	public String serviceDemo(){
		return "hello world";
	}

}
