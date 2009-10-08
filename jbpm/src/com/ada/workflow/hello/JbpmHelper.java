package com.ada.workflow.hello;

import org.jbpm.api.Execution;
import org.jbpm.api.ExecutionService;
import org.jbpm.api.NewDeployment;
import org.jbpm.api.RepositoryService;
import org.jbpm.api.TaskService;

import com.ada.factory.JbpmFactory;

/**
 * CopyRright (c)2008-xxxx: <展望软件Forsoft > Project: <项目工程名 > Module ID:
 * <(模块)类编号，可以引用系统设计中的类编号> Comments: <对此类的描述，可以引用系统设计中的描述> JDK version used:
 * <JDK1.6> Namespace: <命名空间> Author： <作者中文名或拼音缩写> Create Date：
 * <创建日期，格式:YYYY-MM-DD> Modified By： <修改人中文名或拼音缩写> Modified Date:
 * <修改日期，格式:YYYY-MM-DD> Why & What is modified <修改原因描述> Version: <版本号>
 * 
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
		

	}
}
