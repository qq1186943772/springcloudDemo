package com.xiuyu.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value="/test")
	public String test() {
		return "这里是 《xiuyucloud-eureka-client-8082》 所提供的服务 ！~ ";
	}
	
}
