package com.ada.workflow.seal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jbpm.api.ExecutionService;
import org.jbpm.api.HistoryService;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.TaskQuery;
import org.jbpm.api.TaskService;
import org.jbpm.api.history.HistoryProcessInstance;
import org.jbpm.api.history.HistoryProcessInstanceQuery;
import org.jbpm.api.history.HistoryTask;
import org.jbpm.api.history.HistoryTaskQuery;
import org.jbpm.api.task.Task;

import com.ada.factory.JbpmFactory;
import com.ada.workflow.hello.JbpmHelper;

public class SealServiceImpl {
	public String star(JbpmModel busness) {
		ExecutionService executionService = JbpmFactory
				.createExecutionService();
		Map<String, Object> a = new HashMap<String, Object>();
		a.put("model", busness);
		ProcessInstance processInstance = executionService
				.startProcessInstanceByKey("seal", a);
		return processInstance.getId();
	}

	public void audit(String id, String nextuser, String username) {
		TaskService taskService = JbpmFactory.createTaskService();
		System.out.println("开始审批");
		Task task = taskService.getTask(id);
		String taskId = task.getId();
		Set<String> set = taskService.getVariableNames(taskId);
		Map<String, Object> aa = taskService.getVariables(taskId, set);
		aa.put(username, nextuser);
		taskService.setVariables(taskId, aa);
		taskService.completeTask(taskId);
		System.out.println("审批结束");
	}
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
	public void audit(String id) {
		TaskService taskService = JbpmFactory.createTaskService();
		System.out.println("开始审批");
		Task task = taskService.getTask(id);
		String taskId = task.getId();
		taskService.completeTask(taskId);
		System.out.println("审批结束");
	}

	public void printProcessInstanceQuery(String processInstanceId) {
		HistoryService historyService = JbpmFactory.createHistoryService();
		HistoryProcessInstanceQuery query = historyService
				.createHistoryProcessInstanceQuery();
		if (processInstanceId != null) {
			query.processInstanceId(processInstanceId);
		}
		List<HistoryProcessInstance> list = query.list();
		printstring("HistoryProcessInstanceQuery数量" + list.size());
		for (HistoryProcessInstance item : list) {
			System.out.println("*************开始显示内容***********");
			printstring("流程定义ID    " + item.getProcessDefinitionId());
			printstring("流程实例ID        " + item.getProcessInstanceId());
			printstring("流程定义Key        " + item.getKey());
			printstring("流程状态        " + item.getState());
			printstring("开始时间        " + item.getStartTime());
			printstring("结束时间         " + item.getEndTime());
			printstring("花费时间          " + item.getDuration());

			System.out.println("*************显示内容结束***********");

		}
	}

	public void printTaskQuery(String executionId) {
		HistoryService historyService = JbpmFactory.createHistoryService();
		HistoryTaskQuery historyTaskQuery = historyService
				.createHistoryTaskQuery();
		if (executionId != null) {
			historyTaskQuery.executionId(executionId);
		}
		List<HistoryTask> list = historyTaskQuery.list();
		printstring("HistoryTaskQuery数量" + list.size());
		for (HistoryTask item : list) {
			System.out.println("*************开始显示内容***********");
			printstring("处理人    " + item.getAssignee());
			printstring("流程实例ID        " + item.getExecutionId());
			printstring("任务ＩＤ        " + item.getId());
			printstring("流程状态        " + item.getState());
			printstring("开始时间        " + item.getCreateTime());
			printstring("结束时间         " + item.getEndTime());
			printstring("花费时间          " + item.getDuration());

			System.out.println("*************显示内容结束***********");

		}
	}

	public void printtask(String user) {
		TaskService taskService = JbpmFactory.createTaskService();
		TaskQuery query = taskService.createTaskQuery();
		query.assignee(user);
		List<Task> list = query.list();
		for (Task item : list) {
			System.out.println("*************开始显示内容***********");
			printstring("处理人    " + item.getAssignee());
			printstring("流程实例ID        " + item.getExecutionId());
			printstring("任务ＩＤ        " + item.getId());
			printstring("流程名称        " + item.getActivityName());
			printstring("开始时间        " + item.getCreateTime());
			printstring("结束时间         " + item.getDuedate());
			printstring("花费时间          " + item.getFormResourceName());
			

			System.out.println("*************显示内容结束***********");

		}
		RepositoryService service=	JbpmFactory.createRepositoryService();
		service.createProcessDefinitionQuery();
		
		
	}

	private void printstring(String source) {
		System.out.println(source);
	}

	public void pub() {
		JbpmHelper.deploy("com/ada/workflow/seal/seal.jpdl.xml");
	}
	public void  deleteprocess(String id) {
		ExecutionService service=	JbpmFactory.createExecutionService();
		service.deleteProcessInstance(id);
		
	}

}
