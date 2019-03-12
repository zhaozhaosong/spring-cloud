package com.soy.feign.controller;

import com.soy.feign.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController
{

	@Autowired
	private FeginService feginService;

	@RequestMapping("/fe")
	public String name(@RequestParam String name ){

		return feginService.sayHello(name);
	}
}
