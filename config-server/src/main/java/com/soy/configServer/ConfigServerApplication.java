package com.soy.configServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer//配置中心
public class ConfigServerApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ConfigServerApplication.class,args);
	}
}
