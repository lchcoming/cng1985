/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.gete.framework.tree;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 29, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.gete.framework.tree;

public class TreeFactory {
	public static String makeTree(TreeMakeBuilder maker, String type,String path) {
		
		//树型初使化 (目前不能省略)(String rootId,String rootName,String Icon,String openIcon,String url,String target) 
		StringBuffer tree = new StringBuffer();
		TreeMaker treeMaker = new TreeMaker();
		if(type != null && !type.equals("")&&type.equals("2")){
			tree = treeMaker.TreeRootInit3("","阳光装饰供货商",path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif","companyDetailList.action?vo.parentId=0","main");
		}else{
			tree = treeMaker.TreeRootInit3("","阳光装饰供货商",path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif","companyTyepList.action?vo.parentOrderCode=0&vo.id=0","main");
		}
		
		String httpUrl = null;
		/**
		* TreeListApp 方法
		* TreeListApp(集合对象，根节点名称，选择项，默认图标，打开图标)
		* 第一个参数为树型集合对象
		* 第三个参数： "c"为多选项， "r"为单选项，"" 空字符串为默认项
		*/
		tree = treeMaker.TreeListApp(maker.bulider(),path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif",httpUrl,"main");
		//TreeListApp 方法 可多次调用，生成复杂树型结构
		//tree = treeMaker.TreeListApp(orgTreeList,"/power/include/tree/pic/icon.gif",""); 
		return tree.toString();
	}
}
