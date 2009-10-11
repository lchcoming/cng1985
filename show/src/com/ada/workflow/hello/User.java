package com.ada.workflow.hello;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -1715840068294097811L;
	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
