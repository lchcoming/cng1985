package com.ada.workflow.hello;

import org.jbpm.api.model.OpenExecution;
import org.jbpm.api.task.Assignable;
import org.jbpm.api.task.AssignmentHandler;

public class Task2Handle implements AssignmentHandler {

	public void assign(Assignable arg0, OpenExecution arg1) throws Exception {
		User user = (User) arg1.getVariable("manager");
		arg0.setAssignee(user.getName());

	}

}
