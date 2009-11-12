/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.upfile<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-12<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-12        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.upfile;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DownAction extends ActionSupport {
	private String fileName;// 初始的通过param指定的文件名属性

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	private String inputPath;// 指定要被下载的文件路径

	public InputStream getInputStream() throws Exception {

		// 通过 ServletContext，也就是application 来读取数据

		return ServletActionContext.getServletContext().getResourceAsStream(
				inputPath);

	}

	public String getDownloadFileName() {

		String downFileName = fileName;

		try {

			downFileName = new String(downFileName.getBytes(), "ISO8859-1");

		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();

		}

		return downFileName;

	}

}
