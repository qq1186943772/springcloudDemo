package com.xiuyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableDiscoveryClient		// eureka 注册
@EnableZuulProxy			// Zuul 网管路由
public class EurekaZuul9000 {
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaZuul9000.class, args);
	}
}
