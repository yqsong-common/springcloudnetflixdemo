package com.yqsong.springcloudopenfeigndemo.controller;

/**
 * TODO: 文件注释
 * <p>
 * Version  1.0.0
 *
 * @author yq.song
 * <p>
 * Date     2020/9/1 17:16
 */
public class Parent {
	
	public void test(){
		System.out.println(this.test1());
	}
	
	public String test1() {
		return "11";
	}
}
