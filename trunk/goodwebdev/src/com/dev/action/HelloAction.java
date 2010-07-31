package com.dev.action;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;

@Controller
public class HelloAction implements Action {

	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String execute() throws Exception {
		System.out.println(name);
		return Action.SUCCESS;
	}

}
