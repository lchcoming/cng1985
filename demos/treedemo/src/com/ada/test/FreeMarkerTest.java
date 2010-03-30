/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.test;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 30, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 30, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class FreeMarkerTest {
	private static String cp = "/com/ada/tree/resource";
    public static void main(String[] args) throws Exception {
        /* 创建配置 */
        Configuration cfg = new Configuration();
        /* 指定模板存放的路径*/
        System.out.println(FreeMarkerTest.class.getResource("/").getFile());
        System.out.println(FreeMarkerTest.class.getResource(cp).getFile());
        cfg.setDirectoryForTemplateLoading(new File(FreeMarkerTest.class.getResource(cp).getFile()));
        cfg.setObjectWrapper(new DefaultObjectWrapper());

        /* 从上面指定的模板目录中加载对应的模板文件*/
        Template temp = cfg.getTemplate("tree.ftl");

        /* 创建数据模型 */
        Map root = new HashMap();
        root.put("trees", "Big Joe");
 

        /* 将生成的内容打印到控制台中 */
        File fl=new File(FreeMarkerTest.class.getResource(cp).getFile()+"/a.java");
        Writer out = new OutputStreamWriter(System.out);
        FileWriter fwriter=new FileWriter(fl);
        temp.process(root, fwriter);
        fwriter.flush();
        fwriter.close();
        temp.process(root, out);
        out.flush();
        out.close();
        //System.out.println();
    }
}
