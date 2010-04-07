/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dtree.core;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 31, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 31, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dtree.core;

import java.util.List;

import com.ada.dtree.api.NodeBuilder;
import com.ada.dtree.api.TreeMaker;

public class TreeMakerImpl implements TreeMaker {
	public String make(NodeBuilder builder) {
		StringBuffer buffer = new StringBuffer();
		List<TreeNode> nodes = builder.nodes();
		if (null != nodes) {
			buffer.append("<script type=\"text/javascript\">");
			buffer.append("\n");
			buffer.append("d = new dTree('d');");
			//d.add(0,-1,'资源库','tree.html','','','img/trash.gif');
			buffer.append("\n");
			buffer.append("d.add(0,-1,'资源库','#','','','img/trash.gif');");
			buffer.append("\n");
			for (TreeNode node : nodes) {
				buffer.append(node);
			}
		} else {

		}
		
		buffer.append("document.write(d);");
		 //buffer.append(" CreateTreeSelect(\"SelctOrg\",d,\"\",\"\",380); ");
		buffer.append("\n");
		buffer.append("</script>");
		buffer.append("\n");
		return buffer.toString();
	}
}
