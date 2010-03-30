/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.tree.test;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 30, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 30, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.tree.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import com.ada.tree.core.DefaultTreeMaker;
import com.ada.tree.core.TreeNode;

public class DefaultTreeMakerTest {
	private final static String success = "<ul><li><a target=\"#\" href=\"#?id#\">ada</a><li></ul>";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTree() {
		DefaultTreeMaker maker = new DefaultTreeMaker();
		TreeNode node = new TreeNode();
		node.setTarget("#");
		node.setParamid("#");
		node.setTreeNodeURL("#?id");
		node.setName("ada");
		assertEquals(maker.bulid(node), maker.maketree(node), success);
	}
}

