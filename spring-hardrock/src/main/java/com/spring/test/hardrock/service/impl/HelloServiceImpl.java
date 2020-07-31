package com.spring.test.hardrock.service.impl;

import com.spring.test.hardrock.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class HelloServiceImpl implements HelloService {


	@Override
	public String sayHello(String name) {
		return "hello " + name;
	}
}
