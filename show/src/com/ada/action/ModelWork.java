/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.action<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-13<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-13        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import com.ada.dao.BaseDAO;
import com.opensymphony.xwork2.Action;
@SuppressWarnings("unchecked")
public class ModelWork implements Action {

	private Object model;

	private BaseDAO baseDAO;

	@Override
	public String execute() throws Exception {
		return null;
	}

	public void setModel(Object model) {
		this.model = model;
	}

	public Object getModel() {
		return model;
	}

	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	public BaseDAO getBaseDAO() {
		return baseDAO;
	}

	public String add() {
		baseDAO.add(model);
		return "success";
	}

	public String update() {
		baseDAO.update(model);
		return "success";
	}

	public String delete() {
		baseDAO.delete(model);
		return "success";
	}

}
