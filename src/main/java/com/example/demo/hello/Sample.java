package com.example.demo.hello;

import org.springframework.data.annotation.Id;

public class Sample {
	
	@Id
	private String id;
	private String str;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
}
