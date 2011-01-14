/** 
* CopyRright (c)1985-2011: ada.young <br />                             
* Project: javaworld<br />                                           
* Module ID:    <br />   
* Comments:            <br />                                  
* JDK version used:<JDK1.6><br />                                 
* Namespace:org.apache.commons.chain.generic<br />                             
* Author：ada.young <br />                  
* Create Date：  2011-1-13<br />   
* Modified By：ada.young          <br />                                
* Modified Date:2011-1-13          <br />                               
* Why & What is modified <br />   
* Version: 1.01         <br />       
*/ 
package com.ada.shine.core.chain.generic;

import com.ada.shine.core.chain.Command;
import com.ada.shine.core.chain.Context;

public class HiCommand implements Command {

	public boolean execute(Context context) throws Exception {
		System.out.println("hi");
		return false;
	}

}
