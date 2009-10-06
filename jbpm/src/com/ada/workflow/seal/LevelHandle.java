package com.ada.workflow.seal;

import org.jbpm.api.model.OpenExecution;
import org.jbpm.api.task.Assignable;
import org.jbpm.api.task.AssignmentHandler;

/** 
 * CopyRright (c)1985-2009: <br />                             
 * Project: jbpm<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.workflow.seal<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-6<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-6          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */

public class LevelHandle implements AssignmentHandler {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1776220196840722537L;

	@Override
	public void assign(Assignable assignable, OpenExecution execution)
			throws Exception {
		JbpmModel model = (JbpmModel) execution.getVariable("model");
		assignable.setAssignee(model.getUser());

	}

}
