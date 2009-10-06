package com.ada.action;

import java.util.List;

import org.jbpm.api.history.HistoryProcessInstance;
import org.jbpm.api.history.HistoryTask;

import com.ada.workflow.hello.Hello;
import com.opensymphony.xwork2.ActionSupport;

public class FlowAction extends ActionSupport {
	private String messages;
	private String id;
    private List<HistoryProcessInstance> historys;
	private Hello hellowork;

	private String username;

	private List<HistoryTask> tasks;

	public String audit() {
		hellowork.audit(id);
		return "success";
	}

	public Hello getHellowork() {
		return hellowork;
	}

	public List<HistoryProcessInstance> getHistorys() {
		return historys;
	}

	public String getId() {
		return id;
	}

	public String getMessages() {
		return messages;
	}

	public List<HistoryTask> getTasks() {
		return tasks;
	}

	public String getUsername() {
		return username;
	}

	public String history(){
    	historys=hellowork.gethistory();
    	return "success";
    }

	public String list() {
		tasks = hellowork.getlist(username);
		return "success";
	}

	public void setHellowork(Hello hellowork) {
		this.hellowork = hellowork;
	}

	public void setHistorys(List<HistoryProcessInstance> historys) {
		this.historys = historys;
	}

	public void setId(String id) {
		this.id = id;
	}
    public void setMessages(String messages) {
		this.messages = messages;
	}
	public void setTasks(List<HistoryTask> tasks) {
		this.tasks = tasks;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String star() {

		hellowork.star(messages);
		System.out.println("++++++++++++++" + messages);
		return "success";
	}
	
}
