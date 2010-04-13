/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.action;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Apr 12, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Apr 12, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import java.util.List;

import org.apache.struts2.json.annotations.JSON;
import org.apache.struts2.json.annotations.SMD;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ada.dwr.Navigate;
import com.ada.dwr.NavigateManager;

public class TreeJson {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private String name;

	
	public String getName() {
		return name;
	}
	
	private List<Navigate> list;
	private String id;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String work() {
		logger.info("post");
		NavigateManager navigateManager = new NavigateManager();

		if (null == id) {
			list= navigateManager.getChildrenById(1);
		} else {
			list=navigateManager
			.getChildrenById(new Integer(id));
		}

		return "success";
	}
	@JSON
	public List<Navigate> getList() {
		return list;
	}

	public void setList(List<Navigate> list) {
		this.list = list;
	}
}
