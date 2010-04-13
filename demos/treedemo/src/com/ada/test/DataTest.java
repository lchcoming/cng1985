/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.test;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Apr 13, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Apr 13, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ada.bulider.TreeHelp;
import com.ada.dao.BaseDAOImpl;
import com.ada.entity.CailiaoZiyuanType;

public class DataTest {

	private BaseDAOImpl dao;

	@Before
	public void setUp() throws Exception {
		dao = new BaseDAOImpl();
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
	}

	@Test
	public void hi() {
		List<?> d = dao
				.findByQuery("from CailiaoZiyuanType type where type.cailiaoZiyuanType.cailiaoTypeId = '0' ");
		assertNotNull(d);
		TreeHelp help=new TreeHelp();
	String qq=	help.makeTree((List<CailiaoZiyuanType>)d);
	System.out.println(qq);	
	}

}
