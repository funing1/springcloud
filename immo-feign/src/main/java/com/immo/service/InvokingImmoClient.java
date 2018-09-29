package com.immo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.immo.service.impl.InvokingImmoClientImpl;

@FeignClient(value = "IMMO-CLIENT",fallback = InvokingImmoClientImpl.class)
public interface InvokingImmoClient {

	@RequestMapping(value = "/getMessage",method = RequestMethod.GET)
	String invoking(@RequestParam(value = "name") String name);

}
