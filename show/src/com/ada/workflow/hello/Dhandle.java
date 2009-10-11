package com.ada.workflow.hello;

import org.jbpm.api.jpdl.DecisionHandler;
import org.jbpm.api.model.OpenExecution;

public class Dhandle implements DecisionHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String decide(OpenExecution arg0) {
		User user = (User) arg0.getVariable("hello");
		
		return user.getName();
	}

}
