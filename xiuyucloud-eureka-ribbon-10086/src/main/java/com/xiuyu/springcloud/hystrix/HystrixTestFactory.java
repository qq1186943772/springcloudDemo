package com.xiuyu.springcloud.hystrix;


import org.springframework.stereotype.Component;

import com.xiuyu.springcloud.service.FeignTestService;

import feign.hystrix.FallbackFactory;

@Component
public class HystrixTestFactory implements FallbackFactory<FeignTestService>{

	@Override
	public FeignTestService create(final Throwable cause) {
		
		return new FeignTestService() {
			public String feignTest() {
				return "这是备用服务 ~ ";
			}
			
		};
	}

	

}
