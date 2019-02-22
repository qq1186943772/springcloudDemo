package com.xiuyu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiuyu.springcloud.service.FeignTestService;

@RestController
public class RibbonTestController {
	/*
	 * 使用 feign 之后就不需要自己网络调用了 
	@Autowired
	RestTemplate rest;
	*/
	@Autowired
	FeignTestService FeignTestService;
	
	@RequestMapping(value="/ribbonTest")
	public String ribbonTest() {
		
		// 不在使用 http 请求调用
		// String httpHead ="http://XIUYUCLOUD";
		// return rest.getForObject(httpHead+"/test", String.class);
		
		return FeignTestService.feignTest();
	}
	
}
