package com.xiuyu.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/test")
	/*@HystrixCommand(fallbackMethod="fallbackTest")*/
	public String test() {
		
		System.out.println("我来过 ！~ ");
		int i = 1;
		if(i>0) {
			throw new IndexOutOfBoundsException("找歪报的异常 ~ ");
		}
		
		return "这里是 《xiuyucloud-eureka-client-8081》 所提供的服务 ！~ ";
	}
	
	public String fallbackTest() {
		return "《xiuyucloud-eureka-client-8081》 没有正常提供服务 ！~ ";
	}
	
}
