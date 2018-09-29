package com.immo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Value("${spring.application.name}")
	private String serverName;
	
	@RequestMapping(value="getServerName",method=RequestMethod.GET)
	public String getServerName(){
		
		return serverName;
	}
	
	@RequestMapping(value="getMessage",method=RequestMethod.GET)
	public String getMessage(@RequestParam(value="name",required=false) String name){
		
		return name+"您好";
	}

}
