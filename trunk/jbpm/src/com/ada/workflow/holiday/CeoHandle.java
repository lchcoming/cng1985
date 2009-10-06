package com.ada.workflow.holiday;

import org.jbpm.api.model.OpenExecution;
import org.jbpm.api.task.Assignable;
import org.jbpm.api.task.AssignmentHandler;

public class CeoHandle implements AssignmentHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2710942660672896850L;

	public void assign(Assignable assignable, OpenExecution execution)
			throws Exception {
		String user = (String) execution.getVariable("ceo");
		assignable.setAssignee(user);

	}

}
