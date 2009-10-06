package com.ada.workflow.hello;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jbpm.api.Execution;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.HistoryService;
import org.jbpm.api.IdentityService;
import org.jbpm.api.ManagementService;
import org.jbpm.api.NewDeployment;
import org.jbpm.api.ProcessEngine;
import org.jbpm.api.ProcessInstance;
import org.jbpm.api.ProcessInstanceQuery;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.TaskService;
import org.jbpm.api.history.HistoryActivityInstanceQuery;
import org.jbpm.api.history.HistoryDetail;
import org.jbpm.api.history.HistoryDetailQuery;
import org.jbpm.api.history.HistoryProcessInstance;
import org.jbpm.api.history.HistoryProcessInstanceQuery;
import org.jbpm.api.history.HistoryTask;
import org.jbpm.api.history.HistoryTaskQuery;
import org.jbpm.api.task.Task;
import org.jbpm.pvm.internal.cfg.JbpmConfiguration;
import org.jbpm.pvm.internal.env.EnvironmentFactory;
import org.jbpm.pvm.internal.env.JbpmConfigurationParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ada.factory.JbpmFactory;
import com.sun.media.sound.HsbParser;

import junit.framework.TestCase;

public class WorkTest extends TestCase {
	public void atestwork() {

		RepositoryService r = JbpmFactory.createRepositoryService();
		NewDeployment dd = r.createDeployment();
		// org/jbpm/examples/custom/process.jpdl.xml
		// com/ada/test/process.jpdl.xml
		dd.addResourceFromClasspath("com/ada/workflow/hello/process.jpdl.xml");
		String id = dd.deploy();
		System.out.println(id);
	}

	public void atestuser() {
		JbpmConfiguration configurationsConfiguration = new JbpmConfiguration();
		ProcessEngine engine = configurationsConfiguration.buildProcessEngine();
		ManagementService managementService = engine.getManagementService();
		IdentityService identityService = engine.getIdentityService();
		List<org.jbpm.api.identity.User> user = identityService.findUsers();
		assertEquals(1, user.size());

		// identityService.createUser("ada", "1", "2");

	}

	public void atestwork1() {

		JbpmConfiguration configurationsConfiguration = new JbpmConfiguration();
		ProcessEngine engine = configurationsConfiguration.buildProcessEngine();
		assertNotNull(engine);
		ExecutionService executionService = engine.getExecutionService();
		Map<String, Object> a = new HashMap<String, Object>();
		a.put("user", new User("年高"));
		a.put("manager", new User("陈可可"));
		a.put("ada", "to end1");
		ProcessInstance processInstance = executionService
				.startProcessInstanceByKey("hello", a);
		System.out.println(processInstance.getProcessDefinitionId());
		System.out.println(processInstance.getId());
	}

	public void atestwork2() {

		JbpmConfiguration configurationsConfiguration = new JbpmConfiguration();
		ProcessEngine engine = configurationsConfiguration.buildProcessEngine();
		assertNotNull(engine);
		Map<String, Object> a = new HashMap<String, Object>();
		a.put("user", new User("ada"));
		a.put("manager", new User("ada1"));
		a.put("ada", "to end1");
		a.put("d", "to 我爱你");
		TaskService taskService = engine.getTaskService();
		List<Task> tasks = taskService.findPersonalTasks("123");
		// assertEquals(2, tasks.size());
		List<Task> tasks1 = taskService.findPersonalTasks("456");
		// assertEquals(1, tasks1.size());

	}

	public void atestwork3() {

		JbpmConfiguration configurationsConfiguration = new JbpmConfiguration();
		ProcessEngine engine = configurationsConfiguration.buildProcessEngine();
		assertNotNull(engine);
	
		TaskService taskService = engine.getTaskService();
		List<Task> tasks = taskService.findPersonalTasks("年高");
		// assertEquals(1, tasks.size());
		Task task = tasks.get(0);
		task.setAssignee("123");
		String taskId = task.getId();
		taskService.completeTask(taskId);
		System.out.println(task.getAssignee());

	}
	public void atestwork3s() {

		JbpmConfiguration configurationsConfiguration = new JbpmConfiguration();
		ProcessEngine engine = configurationsConfiguration.buildProcessEngine();
		assertNotNull(engine);
	
		TaskService taskService = engine.getTaskService();
		List<Task> tasks = taskService.findPersonalTasks("年高");
		// assertEquals(1, tasks.size());
		Task task = tasks.get(0);
		task.setAssignee("123");
		String taskId = task.getId();
		taskService.saveTask(task);
		System.out.println(task.getAssignee());

	}

	public void atestwork4() {

		JbpmConfiguration configurationsConfiguration = new JbpmConfiguration();
		ProcessEngine engine = configurationsConfiguration.buildProcessEngine();
		assertNotNull(engine);
		ExecutionService executionService = engine.getExecutionService();
		TaskService taskService = engine.getTaskService();
		List<Task> tasks = taskService.findPersonalTasks("123");
		// assertEquals(0, tasks.size());

		List<Task> tasks1 = taskService.findPersonalTasks("陈可可");

		// assertEquals(1, tasks1.size());
		Task task = tasks1.get(0);
		String taskId = task.getId();
		String executionId = task.getExecutionId();
		System.out.println(executionId);
		Execution d=	executionService.findExecutionById(executionId);
		System.out.println(d.getId());
		Set<String> set = taskService.getVariableNames(taskId);
		Map<String, Object> aa = taskService.getVariables(taskId, set);
		aa.put("hello", new User("to end1"));
	
		taskService.setVariables(taskId, aa);
		taskService.completeTask(taskId);
		System.out.println(task.getAssignee());

	}

	public void testwork5() {

		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"springconfig/factory.xml");
		HistoryService historyService = (HistoryService) contex.getBean("hh");
		JbpmPrinter printer = new JbpmPrinter();
		printer.setHistoryService(historyService);
		printer.printActivityInstanceQuery("seal.2");
		 //printer.printProcessInstanceQuery(null);
		//printer.printDistribution("hello.2", "task1");
		//printer.printTaskQuery("seal.3");
		//printer.printDetailQuery();
		 //JbpmHelper.endprodcess("hello.2");
		 //JbpmHelper.endprocess("hello.2");
	}

}
