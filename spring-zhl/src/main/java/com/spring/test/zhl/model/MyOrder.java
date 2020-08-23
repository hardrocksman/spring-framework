package com.spring.test.zhl.model;

import lombok.Builder;
import lombok.Data;

public class MyOrder {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyOrder{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
