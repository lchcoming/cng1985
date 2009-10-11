package com.ada.workflow.api;

import com.ada.workflow.seal.JbpmModel;

/** 
 * CopyRright (c)1985-2009: <br />                             
 * Project: jbpm<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.workflow.api<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-6<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-6          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */

public interface AuditService {
	/**
	 * 
	 * @param taskid
	 *            任务ＩＤ<br />
	 * @param model
	 *            过程模型<br />
	 */
	void aduit(String taskid, JbpmModel model);
}
