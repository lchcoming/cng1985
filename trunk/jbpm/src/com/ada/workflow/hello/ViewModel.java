package com.ada.workflow.hello;

import java.util.List;

import org.jbpm.api.history.HistoryProcessInstance;
import org.jbpm.api.history.HistoryTask;

public class ViewModel {
private HistoryProcessInstance historyProcessInstance;
private List<HistoryTask> tasks;
public HistoryProcessInstance getHistoryProcessInstance() {
	return historyProcessInstance;
}
public void setHistoryProcessInstance(
		HistoryProcessInstance historyProcessInstance) {
	this.historyProcessInstance = historyProcessInstance;
}
public List<HistoryTask> getTasks() {
	return tasks;
}
public void setTasks(List<HistoryTask> tasks) {
	this.tasks = tasks;
}
}
