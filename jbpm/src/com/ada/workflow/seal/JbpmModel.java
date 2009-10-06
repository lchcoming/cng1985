package com.ada.workflow.seal;

import java.io.Serializable;

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

public class JbpmModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String next;
	private String user;

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
