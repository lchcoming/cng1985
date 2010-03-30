/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.tree;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 29, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.tree.demo;

import java.util.Set;

import com.ada.entity.CailiaoZiyuanType;
import com.ada.entity.CailiaoZiyuanTypeVo;
import com.ada.tree.api.TreeMakeBuilder;



public class DemoTreeMaker implements TreeMakeBuilder {

	public String bulid() {
		// TODO Auto-generated method stub
		return null;
	}
	public void getbyid(CailiaoZiyuanTypeVo vo) {
//		try {
//			CailiaoZiyuanType type = (CailiaoZiyuanType) cailiaoZiyuanTypeDAO
//					.findById(CailiaoZiyuanType.class, vo.getId());
//			vo.setCailiaoZiyuanType(type);
//		} catch (Exception e) {
//			log.error("获取材料类型失败");
//		}

	}
	public StringBuffer maketree(CailiaoZiyuanTypeVo vo, String url,
			String target) {
		getbyid(vo);
		StringBuffer buffer = new StringBuffer();
		buffer.append("<ul>");
		CailiaoZiyuanType type = vo.getCailiaoZiyuanType();
		if (type.getCailiaoZiyuanTypes().size() < 1) {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ type.getCailiaoTypeId() + "\">");
			buffer.append(type.getCailiaoTypeName());
			buffer.append("</a>");
			buffer.append("</li>");
		} else {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ type.getCailiaoTypeId() + "\">");
			buffer.append(type.getCailiaoTypeName());
			buffer.append("</a>");
			buffer.append("<ul>");
			Set<CailiaoZiyuanType> sets = type.getCailiaoZiyuanTypes();
			System.out.println(sets.size());
			for (CailiaoZiyuanType cailiaoZiyuanType : sets) {

				if (cailiaoZiyuanType.getCailiaoZiyuanTypes().size() < 1) {
					buffer.append("<li>");
					buffer.append("<a target=\"" + target + "\" href =\"" + url
							+ cailiaoZiyuanType.getCailiaoTypeId() + "\">");
					buffer.append(cailiaoZiyuanType.getCailiaoTypeName());
					buffer.append("</a>");
					buffer.append("</li>");
				} else {
					buffer.append("<li>");
					buffer.append("<a target=\"" + target + "\" href =\"" + url
							+ cailiaoZiyuanType.getCailiaoTypeId() + "\">");
					buffer.append(cailiaoZiyuanType.getCailiaoTypeName());
					buffer.append("</a>");
					buffer.append("<ul>");
					Set<CailiaoZiyuanType> ssSet = cailiaoZiyuanType
							.getCailiaoZiyuanTypes();
					for (CailiaoZiyuanType cailiaoZiyuanType2 : ssSet) {
						StringBuffer s = treenode(cailiaoZiyuanType2, url,
								target);
						buffer.append(s);
						// System.out.println("!!!!!!!!!!!!!!!!");
						// buffer.append("<li>");
						// System.out.println(cailiaoZiyuanType2.getCailiaoTypeName());
						// buffer.append(cailiaoZiyuanType2.getCailiaoTypeName());
						// buffer.append("</li>");
						// System.out.println("!!!!!!!!!!!!!!!!");
					}
					buffer.append("</ul>");
					buffer.append("</li>");

				}
			}
			buffer.append("</ul>");

			buffer.append("</li>");
		}
		buffer.append("</ul>");
		return buffer;
	}

	private static StringBuffer treenode(CailiaoZiyuanType cailiaoZiyuanType,
			String url, String target) {
		StringBuffer buffer = new StringBuffer();
		if (cailiaoZiyuanType.getCailiaoZiyuanTypes().size() < 1) {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ cailiaoZiyuanType.getCailiaoTypeId() + "\">");
			buffer.append(cailiaoZiyuanType.getCailiaoTypeName());
			buffer.append("</a>");
			buffer.append("</li>");
		} else {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ cailiaoZiyuanType.getCailiaoTypeId() + "\">");
			buffer.append(cailiaoZiyuanType.getCailiaoTypeName());
			buffer.append("</a>");
			buffer.append("<ul>");
			Set<CailiaoZiyuanType> ssSet = cailiaoZiyuanType
					.getCailiaoZiyuanTypes();
			for (CailiaoZiyuanType cailiaoZiyuanType2 : ssSet) {
				StringBuffer s = treenode(cailiaoZiyuanType2, url, target);
				buffer.append(s);
			}
			buffer.append("</ul>");
			buffer.append("</li>");

		}
		return buffer;
	}
}

