/** 
 * CopyRright (c)1985-2010: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.set<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Aug 2, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Aug 2, 2010          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.set;

import java.util.HashSet;
import java.util.Set;

public class Apps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OO o1 = new OO();
		OO o2 = new OO();
		OO o3 = new OO();
		o3.setName("dsadasdasds");
		System.out.println(o1.equals(o2));
		Set<OO> set=new HashSet<OO>();
		set.add(o1);
		o2.setAge(8);
		set.add(o2);
		System.out.println(set.size());
		System.out.println(set.contains(01));
		o2.setName(">>>>>>>>>>>>>>>>>>>>>");
		for(int i =0;i<3;i++){
			  set.add(o3);
			 //  System.out.println();
		}
	   for(OO item:set){
		   set.add(o3);
		   System.out.println(item.getName());
	   }
		
	}

}
