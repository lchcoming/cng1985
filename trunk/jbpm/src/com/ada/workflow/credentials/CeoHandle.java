package com.ada.workflow.credentials;

import org.jbpm.api.model.OpenExecution;
import org.jbpm.api.task.Assignable;
import org.jbpm.api.task.AssignmentHandler;

public class CeoHandle implements AssignmentHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void assign(Assignable assignable, OpenExecution execution)
			throws Exception {
		String user = (String) execution.getVariable("ceo");
		assignable.setAssignee(user);

	}

}
