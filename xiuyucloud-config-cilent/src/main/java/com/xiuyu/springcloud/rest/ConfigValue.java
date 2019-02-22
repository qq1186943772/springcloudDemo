package com.xiuyu.springcloud.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigValue {

	@Value("${server.servlet.session.timeout}")
	private String timeout;

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${server.port}")
	private String port;

	@RequestMapping("/config")
	public String getConfig()
	{
		String json = "timeout : " + timeout + "   url : " + url + "   port" + port ;
		System.out.println(json);
		return json;
	}
}
