package com.spring.test.zhl.service.impl;

import com.spring.test.zhl.model.MyOrder;
import com.spring.test.zhl.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Override
	public MyOrder getOrder(int id) {

//		createOrder(3, "333");

		MyOrder o = new MyOrder();
		o.setId(id);
		o.setName("product name:" + id);
		return o;
	}

	@Override
	public void createOrder(int id, String name) {
		System.out.println("create order id:" + id + ", product name:" + name);
	}
}
