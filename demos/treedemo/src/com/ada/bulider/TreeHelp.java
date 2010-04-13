/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.bulider;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Apr 13, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Apr 13, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.bulider;

import java.util.List;

import com.ada.entity.CailiaoZiyuanType;

public class TreeHelp {

	public String makeTree(List<CailiaoZiyuanType> ytypespes) {
		StringBuffer buffer = new StringBuffer();
		if(null!=ytypespes){
			buffer.append("[");
			
			for(CailiaoZiyuanType item:ytypespes)
			{
				buffer.append("{");
				buffer.append("id:'"+item.getCailiaoTypeId()+"'");
				buffer.append(",");
				buffer.append("text:'"+item.getCailiaoTypeName()+"'");
				buffer.append(",");
				if(item.getCailiaoZiyuanTypes().size()<1){
					buffer.append("leaf:true");
					buffer.append(",");
				}
				buffer.append("singleClickExpand:true");
				buffer.append(",");
				buffer.append("}");
				buffer.append(",");
			}
			buffer.append("]");
		}
		else{
			buffer.append("[]");
		}
		return buffer.toString();
	}
}
