package com.ada.workflow.core;

import java.util.List;

import org.jbpm.api.Execution;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.HistoryService;
import org.jbpm.api.NewDeployment;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.TaskQuery;
import org.jbpm.api.TaskService;
import org.jbpm.api.history.HistoryTask;
import org.jbpm.api.history.HistoryTaskQuery;

import com.ada.factory.JbpmFactory;

/**
 * @author ada
 * 
 * 
 *         功能介绍：一个jbpm辅助类 功能： 部署一个流程deploy(String path)
 */
public class JbpmHelper {
	/**
	 * 功能：部署一个流程 path为一个jpdl的path地址
	 * 
	 * @param path
	 */
	public static void deploy(String path) {
		RepositoryService repositoryService = JbpmFactory
				.createRepositoryService();
		NewDeployment newDeployment = repositoryService.createDeployment();
		newDeployment.addResourceFromClasspath(path);
		String id = newDeployment.deploy();
		System.out.println(id);
	}

	public static void endprocess(String processInstanceId) {
		ExecutionService executionService = JbpmFactory
				.createExecutionService();
		executionService.endProcessInstance(processInstanceId, "end");
	}

	public static void endprodcess(String executionId) {
		ExecutionService executionService = JbpmFactory
				.createExecutionService();

		Execution execution = executionService.findExecutionById(executionId);
		if (execution != null) {
			System.out.println(execution.isEnded());
		}
	}

	public static void deletetask(String executionId) {
		TaskService taskService = JbpmFactory.createTaskService();
		TaskQuery query = taskService.createTaskQuery();
		query.processDefinitionId("");
	}

	public static List<HistoryTask> getHistoryTask(String executionId) {
		HistoryService historyService = JbpmFactory.createHistoryService();
		HistoryTaskQuery query = historyService.createHistoryTaskQuery();
		if (null != executionId) {
			query.executionId(executionId);
		}
		List<HistoryTask> list = query.list();
		return list;
	}

}
