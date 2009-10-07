package com.ada.workflow.tools;

import java.util.List;

import org.jbpm.api.JobQuery;
import org.jbpm.api.ManagementService;
import org.jbpm.api.job.Job;

import com.ada.factory.JbpmFactory;

/** 
 * CopyRright (c)1985-2009: <br />                             
 * Project: jbpm<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.workflow.tools<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-6<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-6          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */

public class JbpmTool {
public void hello(){
	ManagementService service=	JbpmFactory.createManagementService();
	JobQuery query=	service.createJobQuery();
	List<Job> jobs= query.list();
}
}
