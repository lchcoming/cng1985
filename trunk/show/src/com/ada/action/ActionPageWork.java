/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: SUNPS<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.gete.sunps.cailiaoout.action<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-12<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-12        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;

public abstract class ActionPageWork<E> implements Action {

	private List<E> list;

	private int curPage;

	private Map<String, String> keywords;
	private Map<String, String> errors;

	public Map<String, String> getErrors() {
		if (errors == null) {
			errors = new HashMap<String, String>();
		}
		return errors;
	}

	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}

	public abstract void validate();

	public int getCurPage() {
		return curPage;
	}

	public Map<String, String> getKeywords() {
		return keywords;
	}

	public List<E> getList() {
		return list;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	public void setKeywords(Map<String, String> keywords) {
		this.keywords = keywords;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	@Override
	public final String execute() throws Exception {
		if (getErrors().size() > 0) {
			return "input";
		}
		return work();
	}

	public abstract String work();
}
