package com.soy.serviceRibbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceRibbonApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ServiceRibbonApplication.class,args);
	}

	/**
	 * 创建服务调用客户端端对象
	 */
	@Bean
	@LoadBalanced //负载均衡
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}
