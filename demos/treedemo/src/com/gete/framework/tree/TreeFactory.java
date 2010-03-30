/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.gete.framework.tree;<br />                             
 * Author��ada.young <br />                  
 * Create Date��  Mar 29, 2010<br />   
 * Modified By��ada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.gete.framework.tree;

public class TreeFactory {
	public static String makeTree(TreeMakeBuilder maker, String type,String path) {
		
		//���ͳ�ʹ�� (Ŀǰ����ʡ��)(String rootId,String rootName,String Icon,String openIcon,String url,String target) 
		StringBuffer tree = new StringBuffer();
		TreeMaker treeMaker = new TreeMaker();
		if(type != null && !type.equals("")&&type.equals("2")){
			tree = treeMaker.TreeRootInit3("","����װ�ι�����",path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif","companyDetailList.action?vo.parentId=0","main");
		}else{
			tree = treeMaker.TreeRootInit3("","����װ�ι�����",path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif","companyTyepList.action?vo.parentOrderCode=0&vo.id=0","main");
		}
		
		String httpUrl = null;
		/**
		* TreeListApp ����
		* TreeListApp(���϶��󣬸��ڵ����ƣ�ѡ���Ĭ��ͼ�꣬��ͼ��)
		* ��һ������Ϊ���ͼ��϶���
		* ������������ "c"Ϊ��ѡ� "r"Ϊ��ѡ�"" ���ַ���ΪĬ����
		*/
		tree = treeMaker.TreeListApp(maker.bulider(),path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif",httpUrl,"main");
		//TreeListApp ���� �ɶ�ε��ã����ɸ������ͽṹ
		//tree = treeMaker.TreeListApp(orgTreeList,"/power/include/tree/pic/icon.gif",""); 
		return tree.toString();
	}
}
