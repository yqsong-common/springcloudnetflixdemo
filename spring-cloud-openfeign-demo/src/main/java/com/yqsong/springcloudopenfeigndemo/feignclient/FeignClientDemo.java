package com.yqsong.springcloudopenfeigndemo.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO: 文件注释
 * <p>
 * Version  1.0.0
 *
 * @author yq.song
 * <p>
 * Date     2020/8/31 11:57
 */
@FeignClient("service-demo")
public interface FeignClientDemo {
	
	@GetMapping("servicedemo")
	String serviceDemo();
}
