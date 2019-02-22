package com.xiuyu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import com.netflix.loadbalancer.RandomRule;


@SpringBootApplication
@EnableDiscoveryClient		// eureka 注册
/*
 * @RibbonClient 注解 启用 ribbon 负载均衡你吗                                      
 * value 负载俊衡器的名字
 * name 带客户的名字,唯一标识一组客户资源,包括一个负载均衡器。
 * configuration 所是有的负载均很策略，默认 IRule 轮询
 * 如需自定义 负载均衡策略 可继承 AbstractLoadBalancerRule 抽象类没重写其方法，然后使用  configuration 只想该类
 */
@RibbonClient(value="xiuyuCloudRibbon",name="XIUYUCLOUD" , configuration=RandomRule.class)
/*
 *@EnableFeignClients 注解用于开启 feigin 服务，提供rest 访问支持
 * 
 */
@EnableFeignClients
/*
 * @EnableCircuitBreaker	启动断路器
 * @EnableHystrixDashboard	启用hystrix仪表盘
 */
@EnableCircuitBreaker
@EnableHystrixDashboard
public class EurekaRibbon10086 {
	public static void main(String[] args)
	{
		SpringApplication.run(EurekaRibbon10086.class, args);
	}
	
	@Bean
	public ServletRegistrationBean getServlet() {
		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
		ServletRegistrationBean registrationBean  = new ServletRegistrationBean(streamServlet);
		registrationBean.setLoadOnStartup(1);
		registrationBean.addUrlMappings("/actuator/hystrix.stream");
		registrationBean.setName("HystrixMetricsStreamServlet");
		return registrationBean;
	}
	
}
