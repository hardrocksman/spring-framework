package com.spring.test.zhl.service;

import com.spring.test.zhl.model.MyOrder;

public interface OrderService {

	MyOrder getOrder(int id);

	void createOrder(int id, String name);
}
