/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.bulider;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Apr 15, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Apr 15, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.bulider;

import java.util.List;

import com.ada.entity.CailiaoZiyuanType;

public class TTreeHelp {
	public String makeTree(List<CailiaoZiyuanType> ytypespes) {
		StringBuffer buffer = new StringBuffer();
		if (null != ytypespes) {
			buffer.append("[");
			int length = ytypespes.size();
			int temp = 0;
			for (CailiaoZiyuanType item : ytypespes) {
				temp++;
				buffer.append("{");
				buffer.append("id:'" + item.getCailiaoTypeId() + "'");
				buffer.append(",");
				buffer.append("hrefTarget:'dd'");
				buffer.append(",");
				buffer.append("text:'" + item.getCailiaoTypeName() + "'");
				buffer.append(",");

				buffer.append("href:'treetypemore.action?id="
						+ item.getCailiaoTypeId() + "'");
				buffer.append(",");

				buffer.append("singleClickExpand:true");
				buffer.append("}");
				if (temp < length) {
					buffer.append(",");
				}
			}
			buffer.append("]");
		} else {
			buffer.append("[]");
		}
		return buffer.toString();
	}
}
