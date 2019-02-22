package com.xiuyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient			// eureka 客户端
@EnableDiscoveryClient		// eureka 注册
public class EurekaClient8081 {
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaClient8081.class, args);
	}
}
