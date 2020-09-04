package com.spring.test.hardrock.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class TestDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insert(String name) {
		String sql = "INSERT INTO test(name) VALUES(?)";
		jdbcTemplate.update(sql, name);
	}

	public int addAmount(int id, BigDecimal amount) {
		String sql = "update account set amount=amount+? where id=?";
		return jdbcTemplate.update(sql, id, amount);
	}
}
