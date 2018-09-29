package com.immo.service.impl;

import org.springframework.stereotype.Component;

import com.immo.service.InvokingImmoClient;
@Component
public class InvokingImmoClientImpl implements InvokingImmoClient {

	@Override
	public String invoking(String name) {
		return name+" sorry  找不着服务";
	}

}
