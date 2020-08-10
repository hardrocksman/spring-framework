package com.spring.test.hardrock.dao;

import com.spring.test.hardrock.Test;
import com.spring.test.hardrock.entity.TestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insert(String name) {
		String sql = "INSERT INTO test(name) VALUES(?)";
		jdbcTemplate.update(sql, name);
	}
}
