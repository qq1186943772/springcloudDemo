package com.xiuyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaServer10012 {
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaServer10012.class, args);
	}
	
}
