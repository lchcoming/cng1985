/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dtree.core;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 31, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 31, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dtree.core;

import java.util.List;

import com.ada.dtree.api.TreeMaker;

public class TreeMakerImpl implements TreeMaker{
	public String make(List<TreeNode> nodes){
		StringBuffer buffer=new StringBuffer();
		if(null!=nodes){
			buffer.append("d = new dTree('d');");
			buffer.append("\n");
			for(TreeNode node:nodes){
				buffer.append(node);
//				d = new dTree('d');
//
//				d.add(0,-1,'×ÊÔ´¿â','tree.html','','','img/trash.gif');
//				d.add(1,0,'Node 1','tree.html');
//				d.add(2,0,'Node 2','tree.html');
//				d.add(3,1,'Node 1.1','tree.html');
//				d.add(4,0,'Node 3','tree.html');
//				d.add(5,3,'Node 1.1.1','tree.html');
//				d.add(6,5,'Node 1.1.1.1','tree.html');
//				d.add(7,0,'Node 4','tree.html');
//				d.add(8,1,'Node 1.2','tree.html');
//				d.add(9,0,'My Pictures','tree.html','Pictures I\'ve taken over the years','','','img/imgfolder.gif');
//				d.add(10,9,'The trip to Iceland','tree.html','Pictures of Gullfoss and Geysir');
//				d.add(11,9,'Mom\'s birthday','tree.html');
//				//d.add(12,0,'Recycle Bin','tree.html','','','img/trash.gif');
//		        d.add(12,0,'Recycle Bin','tree.html','','','img/trash.gif');
//				document.write(d);
			}
		}
		else{
			
		}
	return buffer.toString();
}
}

