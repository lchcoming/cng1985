/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.upfile<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-10<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-10        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.upfile;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileAction extends ActionSupport {
	private static final long serialVersionUID = -382362366152017940L;

	private File excelImage;// 实际上传文件

	private String excelImageContentType; // 文件的内容类型

	private String excelImageFileName; // 上传文件名

	public String addImage() throws SQLException, IOException {
		System.out.println(excelImageFileName);
		String targetDir = ServletActionContext.getServletContext()
				.getRealPath("/upload");
		File target = new File(targetDir, excelImageFileName);
		FileUtils.copyFile(excelImage, target);
		System.out.println(excelImageFileName);
		return "success";
	}

	public File getExcelImage() {
		return excelImage;
	}

	public void setExcelImage(File excelImage) {
		this.excelImage = excelImage;
	}

	public String getExcelImageContentType() {
		return excelImageContentType;
	}

	public void setExcelImageContentType(String excelImageContentType) {
		this.excelImageContentType = excelImageContentType;
	}

	public String getExcelImageFileName() {
		return excelImageFileName;
	}

	public void setExcelImageFileName(String excelImageFileName) {
		this.excelImageFileName = excelImageFileName;
	}
}
