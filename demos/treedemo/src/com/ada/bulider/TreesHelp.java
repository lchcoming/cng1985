/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.bulider;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Apr 14, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Apr 14, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.bulider;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ada.entity.CailiaoZiyuan;
import com.ada.entity.CailiaoZiyuanType;

public class TreesHelp {
	private Logger logger=LoggerFactory.getLogger(getClass());
	public String makeTree(List<CailiaoZiyuanType> ytypespes,
			List<CailiaoZiyuan> cList) {
		logger.info("》》》》》》》》》》》{}",ytypespes);
		logger.info("》》》》》》》》》》》{}",cList);
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
				// href:'${obj.url}',hrefTarget:'dd',
				// buffer.append("href:'"+item.getCailiaoTypeName()+"'");
				// buffer.append("href:'a.ction'");
				// buffer.append(",");
				buffer.append("hrefTarget:'dd'");
				buffer.append(",");
				buffer.append("text:'" + item.getCailiaoTypeName() + "'");
				buffer.append(",");
				buffer.append("href:'treetypemore.action?id="
						+ item.getCailiaoTypeId() + "'");
				buffer.append(",");
				buffer.append("singleClickExpand:true");
				buffer.append("}");
				buffer.append(",");
			}
			if(cList!=null&&cList.size()>0){
				int length1 = cList.size();
				int temp1 = 0;
				
				for (CailiaoZiyuan item : cList) {
					temp1++;
					buffer.append("{");
					buffer.append("id:'" + item.getCailiaoTypeId() + "'");
					buffer.append(",");
					// href:'${obj.url}',hrefTarget:'dd',
					// buffer.append("href:'"+item.getCailiaoTypeName()+"'");
					// buffer.append("href:'a.ction'");
					// buffer.append(",");
					buffer.append("hrefTarget:'dd'");
					buffer.append(",");
					buffer.append("text:'" + item.getCailiaoName() + "'");
					buffer.append(",");
					buffer.append("href:'treetypeone.action?id="
							+ item.getCailiaoTypeId() + "'");
					buffer.append(",");
					buffer.append("leaf:true");
					buffer.append(",");

					buffer.append("singleClickExpand:true");
					buffer.append("}");
					if (temp1 < length1) {
						buffer.append(",");
					}
					
				}
				buffer.append("]");
			}
			else{
				buffer.append("]");
			}
			
		} else {
			logger.info("{}","没有目录");
			if (cList != null&&cList.size()>0) {
				int length = cList.size();
				int temp = 0;
				buffer.append("[");
				for (CailiaoZiyuan item : cList) {
					temp++;
					buffer.append("{");
					buffer.append("id:'" + item.getCailiaoTypeId() + "'");
					buffer.append(",");
					// href:'${obj.url}',hrefTarget:'dd',
					// buffer.append("href:'"+item.getCailiaoTypeName()+"'");
					// buffer.append("href:'a.ction'");
					// buffer.append(",");
					buffer.append("hrefTarget:'dd'");
					buffer.append(",");
					buffer.append("text:'" + item.getCailiaoName() + "'");
					buffer.append(",");
					buffer.append("href:'treetypeone.action?id="
							+ item.getCailiaoTypeId() + "'");
					buffer.append(",");
					buffer.append("leaf:true");
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

		}
		return buffer.toString();
	}
}
