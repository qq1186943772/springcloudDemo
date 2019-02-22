package com.xiuyu.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiuyu.springcloud.hystrix.HystrixTestFactory;

@FeignClient(name="XIUYUCLOUD",fallbackFactory=HystrixTestFactory.class)
public interface FeignTestService {

	@RequestMapping(method = RequestMethod.GET,value="/test")
	public String feignTest();
	
}
