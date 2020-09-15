package com.spring.test.hardrock.config;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


@ComponentScan("com.spring.test.hardrock")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class TestConfig {

	@Bean
	public DataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser("hard");
		dataSource.setPassword("Qq&l1314zyq");
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://rm-bp1756snr36av4lfufo.mysql.rds.aliyuncs.com:3306/test_tx?serverTimezone=GMT%2B8&useSSL=false");
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}
