/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.action;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Apr 13, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Apr 13, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import java.util.List;

import com.ada.dao.BaseDAOImpl;
import com.ada.entity.CailiaoZiyuanType;

public class TypeAction {

	public String work() {
		return "success";
	}

	private String id;
	private BaseDAOImpl dao;

	public BaseDAOImpl getDao() {
		return dao;
	}

	public void setDao(BaseDAOImpl dao) {
		this.dao = dao;
	}

	public TypeAction() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private List<CailiaoZiyuanType> types;

	public String tree() {
		types=(List<CailiaoZiyuanType>)dao.findByQuery("from CailiaoZiyuanType type where type.cailiaoZiyuanTypecailiaoTypeId = "+id);
		return "success";
	}

	public List<CailiaoZiyuanType> getTypes() {
		return types;
	}

	public void setTypes(List<CailiaoZiyuanType> types) {
		this.types = types;
	}
}
