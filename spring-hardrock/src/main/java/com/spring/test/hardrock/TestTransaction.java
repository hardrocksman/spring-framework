package com.spring.test.hardrock;

import com.spring.test.hardrock.config.TestConfig;
import com.spring.test.hardrock.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.ArrayList;
import java.util.List;


public class TestTransaction {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);

		OrderService orderService = ac.getBean(OrderService.class);
		List<String> name = new ArrayList<String>();

		name.add("344334");
		name.add("5454545");

		orderService.saveOrders(name);
	}
}
