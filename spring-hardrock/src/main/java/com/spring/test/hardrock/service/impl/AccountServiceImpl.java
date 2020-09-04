package com.spring.test.hardrock.service.impl;

import com.spring.test.hardrock.dao.TestDao;
import com.spring.test.hardrock.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	TestDao testDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public int addAccount(int id, BigDecimal acmount) {
		return testDao.addAmount(id, acmount);
	}
}
