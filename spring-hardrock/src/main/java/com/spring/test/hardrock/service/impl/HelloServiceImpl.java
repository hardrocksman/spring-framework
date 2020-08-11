package com.spring.test.hardrock.service.impl;

import com.spring.test.hardrock.service.HelloService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class HelloServiceImpl implements HelloService {


	@Override
	public String sayHello(String name) {
		String result = this.sayBye(name);

		System.out.println("hello " + name);
		return "hello " + name;
	}

	@Override
	public String sayBye(String name) {
		System.out.println("bye " + name);
		return "bye " + name;
	}
}
