package com.spring.test.cycle.service.impl;

import com.spring.test.cycle.service.AService;
import com.spring.test.cycle.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AServiceImpl implements AService {

	@Autowired
	private BService bService;

	public AServiceImpl() {
		System.out.println("-----------------a-----------------");
	}

	@Override
	public void say(String order) {
		System.out.println("say:" + order);
	}
}
