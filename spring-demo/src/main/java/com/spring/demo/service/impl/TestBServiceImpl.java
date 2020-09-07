package com.spring.demo.service.impl;

import com.spring.demo.service.TestBService;

public class TestBServiceImpl implements TestBService {

	@Override
	public void sayHello(String name) {
		System.out.println("say hello to " + name + " in B");
	}

	@Override
	public void sayBye(String name) {
		System.out.println("say bye to " + name + " in B");
	}
}
