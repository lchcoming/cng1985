<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ taglib prefix="s" uri="/WEB-INF/struts-tags.tld" %>

<html>
<head>
<title>分页信息</title>

</head>
<body> 
      <%
      	String param=request.getParameter("actionparam");
      	String formName = request.getParameter("formName");
      %>
      <input type="hidden" name="formName" id="formName" value="<%=formName %>"/>
      <input type="hidden" name="currentPage" id="currentPage" value="${pageResult.pageBean.currentPage }"/>
      <input type="hidden" name="pagerMethod" id="pagerMethod"/>
      <table border="0" cellPadding="2" align="center" cellSpacing="0" width="70%" bgcolor="#FFFFFF">           
             <tr>
					 <td align="center"  class="tou"  colspan="5">											
							  <div class="pagecontrol">
                				  
							  <s:if test="pageResult!=null&&pageResult.resultList!=null">
							  					        
						                  第<FONT color="red">
						                  <s:property value="pageResult.pageBean.currentPage"/></FONT>&nbsp;页/
						                  共&nbsp;<FONT color="red"><s:property value="pageResult.pageBean.totalPages"/></FONT>&nbsp;页&nbsp;						                  
						                 记录总数:&nbsp;<FONT color="red"><s:property value="pageResult.pageBean.totalRows"/></FONT>&nbsp;条&nbsp;
					           (每页<s:property value="pageResult.pageBean.pageSize"/>条)&nbsp;&nbsp;
					                <s:if test="pageResult.pageBean.currentPage==1">
					                                                 首页 &nbsp;上一页



					                </s:if> 
					                <s:else>
					                  <a href="#" onclick="javascript:doAction('<%=param %>','first')">首页</a>
						    		   <a href="#" onclick="javascript:doAction('<%=param %>','previous')">上一页</a>
					                </s:else>
					    			<s:if test="pageResult.pageBean.currentPage==pageResult.pageBean.totalPages">
					               		   下一页 &nbsp;尾页
					                </s:if> 
					                <s:else>
					                   <a href="#" onclick="javascript:doAction('<%=param %>','next')">下一页</a>
						    			<a href="#" onclick="javascript:doAction('<%=param %>','last')">尾页</a>			                   
					                </s:else>
					            
							  </s:if>
							  <s:else>
							        共0行&nbsp;  第0页|&nbsp;共0页&nbsp; 首页 &nbsp;上一页 &nbsp; 下一页 &nbsp;尾页							  
							  </s:else>
                </div>
		       </td>
		</tr>
               
</table>  
          

</body>
</html>
<script>
	function doAction(url,method){
	   var myFormName = document.getElementById("formName").value;
	   document.getElementById("pagerMethod").value=method;
	   document.forms[myFormName].action = url;
	   document.forms[myFormName].submit();
	}
</script>