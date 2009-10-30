package com.ada.workflow.core;

import org.jbpm.api.ExecutionService;
import org.jbpm.api.HistoryService;
import org.jbpm.api.IdentityService;
import org.jbpm.api.ManagementService;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.TaskService;
import org.jbpm.pvm.internal.cfg.JbpmConfiguration;

/**
 * 
 * CopyRright (c)1985-2009: <br />
 * Project: jbpm <br />
 * Module ID: <br />
 * Comments: <br />
 * JDK version used:<JDK1.6> <br />
 * Namespace:com.ada.workflow.hello <br />
 * Author：ada.young <br />
 * Create Date： 2009-10-5<br />
 * Modified By： <br />
 * Modified Date: <br />
 * Why & What is modified <br />
 * Version: 1.01 <br />
 */
public class JbpmFactory {
	private static ProcessEngine engine;
	private static int count;

	private JbpmFactory() {
	}

	private static synchronized void createEngine() {
		JbpmConfiguration configurationsConfiguration = new JbpmConfiguration();
		engine = configurationsConfiguration.buildProcessEngine();
	}

	public static  synchronized TaskService createTaskService() {
		checknull();
		return engine.getTaskService();
	}

	public static synchronized ExecutionService createExecutionService() {
		checknull();
		return engine.getExecutionService();
	}

	public static synchronized RepositoryService createRepositoryService() {
		checknull();
		return engine.getRepositoryService();
	}

	public static synchronized HistoryService createHistoryService() {
		checknull();
		return engine.getHistoryService();
	}

	public static synchronized  IdentityService createIdentityService() {
		checknull();
		return engine.getIdentityService();
	}

	public static synchronized ManagementService createManagementService() {
		checknull();

		return engine.getManagementService();
	}

	private static synchronized void checknull() {
		if (engine == null) {
			createEngine();
			count++;
		}
		System.out.println("系统初始化jbpm工厂!!!!!!!!!!!!!");
		System.out.println("工厂的代数" + count);
	}

}
