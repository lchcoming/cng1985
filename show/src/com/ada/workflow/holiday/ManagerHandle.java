package com.ada.workflow.holiday;

import org.jbpm.api.model.OpenExecution;
import org.jbpm.api.task.Assignable;
import org.jbpm.api.task.AssignmentHandler;

public class ManagerHandle implements AssignmentHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 808651831736196867L;

	public void assign(Assignable assignable, OpenExecution execution)
			throws Exception {
		String user = (String) execution.getVariable("manager");
		assignable.setAssignee(user);

	}

}
