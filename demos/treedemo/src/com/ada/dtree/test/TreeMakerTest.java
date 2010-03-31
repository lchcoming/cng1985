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

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ada.dtree.core.TreeMakerImpl;
import com.ada.dtree.core.TreeNode;
import com.ada.dtree.demo.DemoMaker;

public class TreeMakerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		TreeMakerImpl maker = new TreeMakerImpl();
		List<TreeNode> list=new ArrayList<TreeNode>();
		TreeNode node=new TreeNode();
		list.add(node);
		list.add(node);
		DemoMaker make=new DemoMaker();
		System.out.println(maker.make(make.nodes()));
	}
}
