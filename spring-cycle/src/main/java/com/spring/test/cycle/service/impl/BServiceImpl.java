package com.spring.test.cycle.service.impl;

import com.spring.test.cycle.service.AService;
import com.spring.test.cycle.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BServiceImpl implements BService {

	@Autowired
	private AService aService;

	public BServiceImpl() {
		System.out.println("-----------------b-----------------");
	}

	@Override
	public void hello(String name) {
		System.out.println("hello:" + name);
	}
}
