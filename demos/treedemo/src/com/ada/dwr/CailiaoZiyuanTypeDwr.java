/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dwr;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Apr 13, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Apr 13, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dwr;

import com.ada.dao.BaseDAOImpl;
import com.ada.entity.CailiaoZiyuanType;

public class CailiaoZiyuanTypeDwr {
	public CailiaoZiyuanTypeDwr() {
		dao = new BaseDAOImpl();
	}

	private BaseDAOImpl dao;

	public Boolean ajaxUpdateTitle(String id, String title) {
		CailiaoZiyuanType type = (CailiaoZiyuanType) dao.getObjectById(
				CailiaoZiyuanType.class, id);
		type.setCailiaoTypeName(title);
		dao.update(type);
		return true;
	}

	public void ajaxRemoveNode(String id) {
		// Navigate obj = dao.get(id);
		// dao.downNode(obj.getParentId(), obj.getNumber(), -1);
		// dao.ajaxRemoveNode(id);
		CailiaoZiyuanType newtype = new CailiaoZiyuanType();
		newtype.setCailiaoTypeId(id);
		dao.delete(newtype);

	}

	public void ajaxMoveNode(String id, String oldParentId, String newParentId,
			int nodeIndex) {
		CailiaoZiyuanType type = (CailiaoZiyuanType) dao.getObjectById(
				CailiaoZiyuanType.class, id);
		CailiaoZiyuanType newtype = new CailiaoZiyuanType();
		newtype.setCailiaoTypeId(newParentId);
		type.setCailiaoZiyuanType(newtype);
		dao.update(type);
	}
}
