/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dtree.core;<br />                             
 * Author��ada.young <br />                  
 * Create Date��  Mar 31, 2010<br />   
 * Modified By��ada.young          <br />                                
 * Modified Date:Mar 31, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dtree.core;
public class TreeNode {
@Override
	public String toString() {
		// d.add(0,-1,'��Դ��','tree.html','','','img/trash.gif');
	  StringBuffer text=new StringBuffer();
	  text.append("d.add(");
	  text.append(id);
	  text.append(",");
	  text.append(pid);
	  text.append(",");
	  text.append("'");
	  text.append(name);
	  text.append("'");
	  text.append(",");
	  text.append("'");
	  text.append(url);
	  text.append("'");
	  text.append(",");
	  text.append("'");
	  text.append(title);
	  text.append("'");
	  text.append(",");
	  
	  text.append("'");
	  text.append(target);
	  text.append("'");
	  text.append(",");
	  
	  text.append("'");
	  text.append(icon);
	  text.append("'");
	  text.append(",");
	  
	  text.append("'");
	  text.append(iconOpen);
	  text.append("'");
	  text.append(",");
	  
	  text.append("'");
	  text.append(open);
	  text.append("'");
	  text.append(")");
	  text.append("\n");
	  return text.toString();
	}
private int id;//�ڵ�id
private int pid;//���ڵ�id
private String name="";//�ڵ���
private String url="";//�ڵ�URL
private String title="";//�ڵ�title
private String target="";//���Ӵ�Ŀ��
private String icon="";//Ĭ����ʽ
private String iconOpen="";//����ʽ
private String open="";////�Ƿ��
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getTarget() {
	return target;
}
public void setTarget(String target) {
	this.target = target;
}
public String getIcon() {
	return icon;
}
public void setIcon(String icon) {
	this.icon = icon;
}
public String getIconOpen() {
	return iconOpen;
}
public void setIconOpen(String iconOpen) {
	this.iconOpen = iconOpen;
}
public String getOpen() {
	return open;
}
public void setOpen(String open) {
	this.open = open;
}
}

