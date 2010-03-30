/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dwr;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 30, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 30, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dwr;

import java.io.Serializable;
import java.util.List;
 public class NavigateManager {  
	     private NavigateDao dao = NavigateDao.getInstanece();  
	     public Navigate get(Serializable id){  
	         return dao.get(id);  
	     }  
	     /** 
	      * 获得指定节点的所有儿子节点 
	      * @param id 
	      */  
	     @SuppressWarnings("unchecked")  
	     public List<Navigate> getChildrenById(Integer id){  
	         return dao.getChildrenById(id);  
	     }  
	     /** 
	      * 保存数据 
	      * @param obj  
	      */  
	     public void save(Navigate obj){  
	         dao.save(obj);  
	     }  
	     /** 
	      * 更新数据 
	      * @param obj  
	      */  
	     public void update(Navigate obj){  
	         dao.update(obj);  
	     }  
	     /** 
	      * 删除指定的一条数据 
	      * @param id 
	      */  
	     public void removeById(Integer id){  
	         dao.removeById(id);  
	     }  
	     /** 
	      * 异步更新标题 
	      * @param id 
	      * @param title 
	      * @return true-修改成功 false-修改失败 
	      */  
	     public Boolean ajaxUpdateTitle(Integer id,String title){  
	         return dao.ajaxUpdateTitle(id, title);  
	     }  
	     /** 
	      * 异步删除数据，包括其子孙节点 
	      * @param id 
	      * @param title 
	      */  
	     public void ajaxRemoveNode(Integer id){  
	         Navigate obj = dao.get(id);  
	         dao.downNode(obj.getParentId(), obj.getNumber(), -1);  
	         dao.ajaxRemoveNode(id);  
	     }  
	     /** 
	      * 异步移动指定节点 
	      * @param id    指定的节点的id 
	      * @param oldParentId   节点移动前所在的父节点 
	      * @param newParentId   节点移动后的目标父节点 
	      * @param nodeIndex     节点移动后的目标位置 
	      */  
	     public void ajaxMoveNode(int id, int oldParentId, int newParentId, int nodeIndex){  
	         dao.ajaxMoveNode(id, oldParentId, newParentId, nodeIndex);  
	     }  
	 }  

