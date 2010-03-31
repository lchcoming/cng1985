/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dtree.tld;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 31, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 31, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dtree.tld;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class TreeScriptTag extends TagSupport {

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}

	@Override
	public int doStartTag() throws JspException {
		HttpServletRequest request = (HttpServletRequest) pageContext
				.getRequest();
		String path = request.getContextPath();
		String basePath = request.getScheme() + "://" + request.getServerName()
				+ ":" + request.getServerPort() + path + "/";
		JspWriter out = pageContext.getOut();
		try {
			//<link rel="StyleSheet" href="<%=basePath%>dtree/dtree.css" type="text/css" />
			//<script type="text/javascript" src="<%=basePath%>dtree/dtree.js"></script>
			out.write("\n");
			out.write("<script type=\"text/javascript\">");
			out.write("\n");
			out.write("var imgur=\""+basePath+"dtree/img/\";");
			out.write("\n");
			out.write("</script>");
			out.write("\n");
			out.write("<link rel=\"StyleSheet\" href=\""+basePath+"dtree/dtree.css\" type=\"text/css\" />");
			out.write("\n");
			out.write("<script type=\"text/javascript\" src=\""+basePath+"dtree/dtree.js\">");
			out.write("</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}

}
