package com.immo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.immo.service.InvokingImmoClient;

@RestController
public class FeignController {
	
	@Autowired
	private InvokingImmoClient invokingImmoClient;
	
	@Value("${spring.application.name}")
	private String serverName;
	
	@RequestMapping(value="getServerName",method=RequestMethod.GET)
	public String getServerName(){//用于zuul演示
		return serverName;
	}
	
	@RequestMapping(value="invoking",method=RequestMethod.GET)
	public String invoking(@RequestParam(value="name",required=false)String name){
		return invokingImmoClient.invoking(name);
	}



}
