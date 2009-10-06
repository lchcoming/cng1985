package com.ada.workflow.hello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jbpm.api.ExecutionService;
import org.jbpm.api.HistoryService;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.TaskService;
import org.jbpm.api.cmd.Environment;
import org.jbpm.api.history.HistoryProcessInstance;
import org.jbpm.api.history.HistoryProcessInstanceQuery;
import org.jbpm.api.history.HistoryTask;
import org.jbpm.api.history.HistoryTaskQuery;
import org.jbpm.api.task.Task;
import org.jbpm.pvm.internal.env.EnvironmentFactory;
import org.jbpm.pvm.internal.env.EnvironmentImpl;
import org.jbpm.pvm.internal.env.PvmEnvironment;

import com.ada.factory.JbpmFactory;

public class Hello {
	public void star(String message) {

		ExecutionService executionService = JbpmFactory
				.createExecutionService();
		Map<String, Object> a = new HashMap<String, Object>();
		a.put("user", new User("123"));
		a.put("manager", new User("456"));
		a.put("hello", new User("to cancel1"));
		a.put("messages", message);
		executionService.startProcessInstanceByKey("hello", a);
	}

	public void taskone() {
		TaskService taskService = JbpmFactory.createTaskService();
		List<Task> tasks = taskService.findPersonalTasks("123");
		
		Task task = tasks.get(0);
		String taskId = task.getId();
		taskService.completeTask(taskId);
	}
	public void tasktwo() {
		TaskService taskService = JbpmFactory.createTaskService();
		List<Task> tasks = taskService.findPersonalTasks("456");
		Task task = tasks.get(0);
		String taskId = task.getId();
		taskService.completeTask(taskId);
	}
	public List<HistoryTask> getlist(String name){
		HistoryService historyService= 	JbpmFactory.createHistoryService();
		HistoryTaskQuery query=	historyService.createHistoryTaskQuery();
		query.assignee(name);
		query.state(null);
		return query.list();
	}
	public void audit(String id,String nextuser,String username){
		TaskService taskService = JbpmFactory.createTaskService();
		System.out.println("开始审批");
		Task task = taskService.getTask(id);
		String taskId = task.getId();
		Set<String> set = taskService.getVariableNames(taskId);
		Map<String, Object> aa = taskService.getVariables(taskId, set);
		aa.put(username, new User(nextuser));
		taskService.setVariables(taskId, aa);
		taskService.completeTask(taskId);
	}
	public void audit(String id){
		TaskService taskService = JbpmFactory.createTaskService();
		System.out.println("开始审批");
		Task task = taskService.getTask(id);
		String taskId = task.getId();
		taskService.completeTask(taskId);
		System.out.println("审批结束");
	}
	public void updatetask(String id,String user,String username){
		TaskService taskService = JbpmFactory.createTaskService();
		System.out.println("开始审批");
		Task task = taskService.getTask(id);
		String taskId = task.getId();
		Set<String> set = taskService.getVariableNames(taskId);
		Map<String, Object> aa = taskService.getVariables(taskId, set);
		aa.put("hello", new User("to end1"));
	
		taskService.setVariables(taskId, aa);
		taskService.saveTask(task);
	}
	public void view(String id){
		TaskService taskService = JbpmFactory.createTaskService();
		System.out.println("获取一个任务");
		Task task = taskService.getTask(id);
		String taskId = task.getId();
		Set<String> set = taskService.getVariableNames(taskId);
		Map<String, Object> aa = taskService.getVariables(taskId, set);

	}
	public List<HistoryProcessInstance> gethistory(){
		HistoryService historyService= 	JbpmFactory.createHistoryService();
		HistoryProcessInstanceQuery query=	historyService.createHistoryProcessInstanceQuery();
	
		return query.list();
	}
	public ViewModel viewmodel(String id){
		ViewModel result=new ViewModel();
		HistoryService historyService= 	JbpmFactory.createHistoryService();
		HistoryProcessInstanceQuery query=	historyService.createHistoryProcessInstanceQuery();
		query.processInstanceId(id);
		HistoryProcessInstance d=query.uniqueResult();
		result.setHistoryProcessInstance(d);
		
		
		return null;
		
	}
	
}
