package com.spring.test.hardrock.service.impl;

import org.springframework.stereotype.Component;

@Component
public class TestAopServiceImpl {

	public void hello(String name) {
		this.bye(name);
		System.out.println("hello:" + name);
	}

	public void bye(String name) {
		System.out.println("bye:" + name);
	}
}
