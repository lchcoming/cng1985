/** 
* CopyRright (c)1985-2011: ada.young <br />                             
* Project: javaworld<br />                                           
* Module ID:    <br />   
* Comments:            <br />                                  
* JDK version used:<JDK1.6><br />                                 
* Namespace:org.apache.commons.chain<br />                             
* Author：ada.young <br />                  
* Create Date：  2011-1-13<br />   
* Modified By：ada.young          <br />                                
* Modified Date:2011-1-13          <br />                               
* Why & What is modified <br />   
* Version: 1.01         <br />       
*/ 
package com.ada.shine.core.chain;

import com.ada.shine.core.chain.generic.HiCommand;
import com.ada.shine.core.chain.impl.ChainBase;
import com.ada.shine.core.chain.impl.ContextBase;

public class Apps {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Chain chain=new ChainBase();
		HiCommand hi=new HiCommand();
		chain.addCommand(hi);
		Context context=new ContextBase();
		chain.execute(context);
	}

}
