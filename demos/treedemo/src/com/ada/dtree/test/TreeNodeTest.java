/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dtree.test;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 31, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 31, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dtree.test;

import org.junit.Test;

import com.ada.dtree.core.TreeNode;


public class TreeNodeTest {
	@Test
public void testTostring(){
		TreeNode node=new TreeNode();
		System.out.println(node+""+node);
}
}

