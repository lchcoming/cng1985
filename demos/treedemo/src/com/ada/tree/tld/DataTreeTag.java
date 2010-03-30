/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.tree.tld;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 30, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 30, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.tree.tld;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.struts2.components.Component;
import org.apache.struts2.views.jsp.TagUtils;

import com.opensymphony.xwork2.util.TextParseUtil;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.logging.*;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class DataTreeTag extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Logger logger=Logger.getLogger("DataTreeTag");
	   protected ValueStack getStack() {
	        return TagUtils.getStack(pageContext);
	    }

	    protected String findString(String expr) {
	        return (String) findValue(expr, String.class);
	    }

	    protected Object findValue(String expr) {
	    	expr = Component.stripExpressionIfAltSyntax(getStack(), expr);

	        return getStack().findValue(expr);
	    }
	    protected Object findValue(String expr, Class toType) {
	        if (Component.altSyntax(getStack()) && toType == String.class) {
	        	return TextParseUtil.translateVariables('%', expr, getStack());
	            //return translateVariables(expr, getStack());
	        } else {
	        	expr = Component.stripExpressionIfAltSyntax(getStack(), expr);

	            return getStack().findValue(expr, toType);
	        }
	    }
	private static String cp = "/com/ada/tree/resource/";
	@SuppressWarnings("unchecked")
	@Override
	public int doEndTag() throws JspException {
		logger.info(findString("trees"));
		logger.info(getStack().findString("trees"));
		JspWriter out=pageContext.getOut();
		try {
			out.write(getStack().findString("trees"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// workFreemake();
		return super.doEndTag();
	}

	private void workFreemake() {
		/* 创建配置 */
        Configuration cfg = new Configuration();
        /* 指定模板存放的路径*/
        try {
			cfg.setDirectoryForTemplateLoading(new File(DataTreeTag.class.getResource(cp).getFile()));
		
        cfg.setObjectWrapper(new DefaultObjectWrapper());

        /* 从上面指定的模板目录中加载对应的模板文件*/
        Template temp = cfg.getTemplate("tree.ftl");

        /* 创建数据模型 */
        Map root = new HashMap();
        root.put("trees", findString("DataTreeAction.trees"));
        Writer out=pageContext.getOut();
        temp.process(root, out);
        out.flush();
       // out.close();
        //System.out.println();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TemplateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int doStartTag() throws JspException {
		logger.info(findString("#trees"));
		return super.doStartTag();
	}

}

