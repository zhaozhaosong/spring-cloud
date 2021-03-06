package com.soy.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "service-helloworld")
@FeignClient("service-helloworld")
public interface FeginService
{
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHello(@RequestParam(value = "name") String name );
}
