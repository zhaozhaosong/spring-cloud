package com.soy.serviceRibbon.controller;

import com.soy.serviceRibbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

	@Autowired
	private HelloService helloService;

	@RequestMapping("/h")
	public String hello(@RequestParam String name){
		return helloService.hisService(name);
	}
}
