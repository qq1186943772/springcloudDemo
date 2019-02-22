package com.xiuyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class Config_Server_StartSpringCloudApp {
	public static void main(String[] args)
	{
		SpringApplication.run(Config_Server_StartSpringCloudApp.class, args);
	}
	
}
