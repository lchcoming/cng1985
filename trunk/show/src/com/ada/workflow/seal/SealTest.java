package com.ada.workflow.seal;

import org.junit.Test;

/**
 * CopyRright (c)1985-2009: <br />
 * Project: jbpm<br />
 * Module ID: <br />
 * Comments: <br />
 * JDK version used:<JDK1.6><br />
 * Namespace:com.ada.workflow.seal<br />
 * Author：ada.young <br />
 * Create Date： 2009-10-6<br />
 * Modified By：ada.young <br />
 * Modified Date:2009-10-6 <br />
 * Why & What is modified <br />
 * Version: 1.01 <br />
 */

public class SealTest {
	@Test
	public void pub() {
		SealServiceImpl serviceImpl=new SealServiceImpl();
		serviceImpl.pub();
	}
	@Test 
	public void star(){
		SealServiceImpl serviceImpl=new SealServiceImpl();
		JbpmModel model=new JbpmModel();
		model.setUser("年高");
		model.setNext("to 部门审批");
		serviceImpl.star(model);
	}
	@Test
	public void tasks(){
		SealServiceImpl serviceImpl=new SealServiceImpl();
		serviceImpl.printProcessInstanceQuery("");
		serviceImpl.printtask("贾艳");
		
	}
	@Test
	public void audit(){
		SealServiceImpl serviceImpl=new SealServiceImpl();
		JbpmModel model=new JbpmModel();
		model.setUser("贾艳");
		model.setNext("to 结束");
		serviceImpl.audit("7", model);
	}
	@Test 
	public void deleteprocess(){
		SealServiceImpl serviceImpl=new SealServiceImpl();
		serviceImpl.deleteprocess("seal.2");
	}
}
