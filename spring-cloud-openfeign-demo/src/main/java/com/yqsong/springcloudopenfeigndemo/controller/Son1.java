package com.yqsong.springcloudopenfeigndemo.controller;

/**
 * TODO: 文件注释
 * <p>
 * Version  1.0.0
 *
 * @author yq.song
 * <p>
 * Date     2020/9/1 17:18
 */
public class Son1 extends Son {
	
	
	public void test2(){
		this.test();
	}
	
	public static void main(String[] args) {
		Son1 son1=new Son1(){
			@Override
			public String test1() {
				return "super.test1()";
			}
		};
		son1.test2();
	}
}
