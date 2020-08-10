package com.spring.test.hardrock.service.impl;

import com.spring.test.hardrock.dao.TestDao;
import com.spring.test.hardrock.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	TestDao testDao;

	@Override
	@Transactional
	public boolean saveOrders(List<String> names) {
		for (String name : names) {
			testDao.insert(name);
		}
		return true;
	}
}
