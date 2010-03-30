/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dwr;<br />                             
 * Author��ada.young <br />                  
 * Create Date��  Mar 30, 2010<br />   
 * Modified By��ada.young          <br />                                
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
	      * ���ָ���ڵ�����ж��ӽڵ� 
	      * @param id 
	      */  
	     @SuppressWarnings("unchecked")  
	     public List<Navigate> getChildrenById(Integer id){  
	         return dao.getChildrenById(id);  
	     }  
	     /** 
	      * �������� 
	      * @param obj  
	      */  
	     public void save(Navigate obj){  
	         dao.save(obj);  
	     }  
	     /** 
	      * �������� 
	      * @param obj  
	      */  
	     public void update(Navigate obj){  
	         dao.update(obj);  
	     }  
	     /** 
	      * ɾ��ָ����һ������ 
	      * @param id 
	      */  
	     public void removeById(Integer id){  
	         dao.removeById(id);  
	     }  
	     /** 
	      * �첽���±��� 
	      * @param id 
	      * @param title 
	      * @return true-�޸ĳɹ� false-�޸�ʧ�� 
	      */  
	     public Boolean ajaxUpdateTitle(Integer id,String title){  
	         return dao.ajaxUpdateTitle(id, title);  
	     }  
	     /** 
	      * �첽ɾ�����ݣ�����������ڵ� 
	      * @param id 
	      * @param title 
	      */  
	     public void ajaxRemoveNode(Integer id){  
	         Navigate obj = dao.get(id);  
	         dao.downNode(obj.getParentId(), obj.getNumber(), -1);  
	         dao.ajaxRemoveNode(id);  
	     }  
	     /** 
	      * �첽�ƶ�ָ���ڵ� 
	      * @param id    ָ���Ľڵ��id 
	      * @param oldParentId   �ڵ��ƶ�ǰ���ڵĸ��ڵ� 
	      * @param newParentId   �ڵ��ƶ����Ŀ�길�ڵ� 
	      * @param nodeIndex     �ڵ��ƶ����Ŀ��λ�� 
	      */  
	     public void ajaxMoveNode(int id, int oldParentId, int newParentId, int nodeIndex){  
	         dao.ajaxMoveNode(id, oldParentId, newParentId, nodeIndex);  
	     }  
	 }  

