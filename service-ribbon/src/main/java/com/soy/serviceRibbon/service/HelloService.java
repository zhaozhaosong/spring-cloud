package com.soy.serviceRibbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService
{
	@Autowired
	private RestTemplate restTemplate;

	public String hisService(String name){

		return  restTemplate.getForObject("http://service-helloworld/hi?name="+name,String.class);
	}
}
