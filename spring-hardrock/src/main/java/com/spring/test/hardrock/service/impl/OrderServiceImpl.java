package com.spring.test.hardrock.service.impl;

import com.spring.test.hardrock.dao.TestDao;
import com.spring.test.hardrock.service.AccountService;
import com.spring.test.hardrock.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	TestDao testDao;

	@Autowired
	AccountService accountService;

	@Transactional
	@Override
	public boolean saveOrders(List<String> names) {
		for (String name : names) {
			testDao.insert(name);
		}

		accountService.addAccount(1, new BigDecimal("3"));
		return true;
	}
}
