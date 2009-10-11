package com.ada.workflow.seal;

import org.jbpm.api.jpdl.DecisionHandler;
import org.jbpm.api.model.OpenExecution;
import org.jbpm.api.task.Assignable;
import org.jbpm.api.task.AssignmentHandler;

public class ManagerHandle implements DecisionHandler {

	@Override
	public String decide(OpenExecution execution) {
		JbpmModel model = (JbpmModel) execution.getVariable("model");
		return model.getNext();
	}

}
