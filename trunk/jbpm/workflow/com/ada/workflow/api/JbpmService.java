/** 
* CopyRright (c)1985-2009: <br />                             
* Project: jbpm<br />                                           
* Module ID:    <br />   
* Comments:            <br />                                  
* JDK version used:<JDK1.6><br />                                 
* Namespace:com.ada.workflow.api<br />                             
* Author：ada.young <br />                  
* Create Date：  2009-10-11<br />   
* Modified By：ada.young          <br />                                
* Modified Date:2009-10-11          <br />                               
* Why & What is modified <br />   
* Version: 1.01         <br />       
*/ 
package com.ada.workflow.api;

import java.util.Map;
import java.util.Set;

import org.jbpm.api.TaskService;
import org.jbpm.api.task.Task;

import com.ada.factory.JbpmFactory;
import com.ada.workflow.seal.JbpmModel;


public class JbpmService {
	public void audit(String id, JbpmModel model) {
		TaskService taskService = JbpmFactory.createTaskService();
		System.out.println("开始审批");
		Task task = taskService.getTask(id);
		String taskId = task.getId();
		Set<String> set = taskService.getVariableNames(taskId);
		Map<String, Object> aa = taskService.getVariables(taskId, set);
		aa.put("model", model);
		taskService.setVariables(taskId, aa);
		taskService.completeTask(taskId);
		System.out.println("审批结束");
	}
}
