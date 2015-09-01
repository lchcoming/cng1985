
```


package com.ada.workflow.hello;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jbpm.api.HistoryService;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.TaskQuery;
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

import com.ada.factory.JbpmFactory;

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
		printstring("HistoryActivityInstanceQuery����" + list.size());
		for (HistoryActivityInstance item : list) {
			System.out.println("*************��ʼ��ʾ����***********");
			printstring("ActivityName    " + item.getActivityName());
			printstring("ExecutionId        " + item.getExecutionId());
			printstring("��ʼʱ��        " + item.getStartTime());
			printstring("����ʱ��         " + item.getEndTime());
			printstring("����ʱ��          " + item.getDuration());
			System.out.println("*************��ʾ���ݽ���***********");

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
		printstring("HistoryProcessInstanceQuery����" + list.size());
		for (HistoryProcessInstance item : list) {
			System.out.println("*************��ʼ��ʾ����***********");
			printstring("���̶���ID    " + item.getProcessDefinitionId());
			printstring("����ʵ��ID        " + item.getProcessInstanceId());
			printstring("���̶���Key        " + item.getKey());
			printstring("����״̬        " + item.getState());
			printstring("��ʼʱ��        " + item.getStartTime());
			printstring("����ʱ��         " + item.getEndTime());
			printstring("����ʱ��          " + item.getDuration());

			System.out.println("*************��ʾ���ݽ���***********");

		}
	}

	public void printTaskQuery(String executionId) {
		HistoryTaskQuery historyTaskQuery = historyService
				.createHistoryTaskQuery();
		if (executionId != null) {
			historyTaskQuery.executionId(executionId);
		}
		List<HistoryTask> list = historyTaskQuery.list();
		printstring("HistoryTaskQuery����" + list.size());
		for (HistoryTask item : list) {
			System.out.println("*************��ʼ��ʾ����***********");
			printstring("������    " + item.getAssignee());
			printstring("����ʵ��ID        " + item.getExecutionId());
			printstring("�����ɣ�        " + item.getId());
			printstring("����״̬        " + item.getState());
			printstring("��ʼʱ��        " + item.getCreateTime());
			printstring("����ʱ��         " + item.getEndTime());
			printstring("����ʱ��          " + item.getDuration());
			printstring("Outcome          " + item.getOutcome());
			System.out.println("*************��ʾ���ݽ���***********");

		}
	}

	public void printDetailQuery() {

		HistoryDetailQuery historyProcessInstance = historyService
				.createHistoryDetailQuery();
		List<HistoryDetail> list = historyProcessInstance.list();

		printstring("HistoryDetailQuery����" + list.size());
		for (HistoryDetail item : list) {
			System.out.println("*************��ʼ��ʾ����***********");
			printstring("������    " + item.getId());
			printstring("����ʵ��ID        " + item.getUserId());
			printstring("�����ɣ�        " + item.getId());
			printstring("����״̬        " + item.getTime());
			System.out.println("*************��ʾ���ݽ���***********");

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
	
	public void printtask(String user) {
		TaskService taskService = JbpmFactory.createTaskService();
		TaskQuery query = taskService.createTaskQuery();
		query.assignee(user);
		List<Task> list = query.list();
		for (Task item : list) {
			System.out.println("*************��ʼ��ʾ����***********");
			printstring("������    " + item.getAssignee());
			printstring("����ʵ��ID        " + item.getExecutionId());
			printstring("�����ɣ�        " + item.getId());
			printstring("��������        " + item.getActivityName());
			printstring("��ʼʱ��        " + item.getCreateTime());
			printstring("����ʱ��         " + item.getDuedate());
			printstring("����ʱ��          " + item.getFormResourceName());
			

			System.out.println("*************��ʾ���ݽ���***********");

		}
		RepositoryService service=	JbpmFactory.createRepositoryService();
		service.createProcessDefinitionQuery();
		
		
	}

}


```