package com.spring.demo.service.impl;

import com.spring.demo.service.TestAService;

public class TestAServiceImpl implements TestAService {

	@Override
	public void sayHello(String name) {
		System.out.println("say hello to " + name + " in A");
	}

	@Override
	public void sayBye(String name) {
		System.out.println("say bye to " + name + " in A");
	}
}
