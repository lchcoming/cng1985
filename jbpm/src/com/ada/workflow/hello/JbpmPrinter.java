package com.ada.workflow.hello;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jbpm.api.HistoryService;
import org.jbpm.api.TaskService;
import org.jbpm.api.history.HistoryActivityInstance;
import org.jbpm.api.history.HistoryActivityInstanceQuery;
import org.jbpm.api.history.HistoryDetail;
import org.jbpm.api.history.HistoryDetailQuery;
import org.jbpm.api.history.HistoryProcessInstance;
import org.jbpm.api.history.HistoryProcessInstanceQuery;
import org.jbpm.api.history.HistoryTask;
import org.jbpm.api.history.HistoryTaskQuery;
import org.jbpm.api.task.Task;

/**
 * 
 * @author ada
 * 
 */
public class JbpmPrinter {
	private HistoryService historyService;

	public HistoryService getHistoryService() {
		return historyService;
	}

	public void setHistoryService(HistoryService historyService) {
		this.historyService = historyService;
	}
   /**
    * 
    * @param processInstanceId
    * {@link JbpmHelper#deploy(Task)}
    */
	public void printActivityInstanceQuery(String processInstanceId) {
		HistoryActivityInstanceQuery query = historyService
				.createHistoryActivityInstanceQuery();
		if (processInstanceId != null) {
			query.executionId(processInstanceId);
		}
		List<HistoryActivityInstance> list = query.list();
		printstring("HistoryActivityInstanceQuery数量" + list.size());
		for (HistoryActivityInstance item : list) {
			System.out.println("*************开始显示内容***********");
			printstring("ActivityName    " + item.getActivityName());
			printstring("ExecutionId        " + item.getExecutionId());
			printstring("开始时间        " + item.getStartTime());
			printstring("结束时间         " + item.getEndTime());
			printstring("花费时间          " + item.getDuration());
			System.out.println("*************显示内容结束***********");

		}
	}

	private void printstring(String source) {
		System.out.println(source);
	}

	public void printProcessInstanceQuery(String processInstanceId) {
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
			printstring("Outcome          " + item.getOutcome());
			System.out.println("*************显示内容结束***********");

		}
	}

	public void printDetailQuery() {

		HistoryDetailQuery historyProcessInstance = historyService
				.createHistoryDetailQuery();
		List<HistoryDetail> list = historyProcessInstance.list();

		printstring("HistoryDetailQuery数量" + list.size());
		for (HistoryDetail item : list) {
			System.out.println("*************开始显示内容***********");
			printstring("处理人    " + item.getId());
			printstring("流程实例ID        " + item.getUserId());
			printstring("任务ＩＤ        " + item.getId());
			printstring("流程状态        " + item.getTime());
			System.out.println("*************显示内容结束***********");

		}
	}

	public void printDistribution(String processDefinitionId,
			String activityName) {

		Map<String, Integer> map = historyService.choiceDistribution(
				processDefinitionId, activityName);
		System.out.println(map.size());
		Set<String> set = map.keySet();
		for(String item:set){
			System.out.println(item);
		}
	}

}
