
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
	<head>
		<base href="<%=basePath%>">
		<title>菜单编辑</title>
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>extjs/ext-all.css" />
		<!-- GC -->
		<!-- LIBS -->
		<script type="text/javascript" src="<%=basePath%>extjs/ext-base.js"></script>
		<!-- ENDLIBS -->

		<script type="text/javascript" src="<%=basePath%>extjs/ext-all.js"></script>
		<script type="text/javascript">  
          function checkForm(form){  
               if(form.parentId.value == "" || form.leaf.value == ""){  
                  Ext.Msg.alert(" 错误提示","表单信息不健全！");  
                 return false;  
             }  
            if(form.title.value == ""){  
                 Ext.Msg.alert(" 错误提示","标题不能为空！");  
                  return false;  
              }  
           }  
      </script>
	</head>
	<body style="background-color: white">
		<br />
		<br />
		<form action="navigatesave" method="post"
			onsubmit="return checkForm(this)">
			<input type="hidden" name="id" value="${obj.id}" />
			<input type="hidden" name="parentId" value="${obj.parentId}" />
			<input type="hidden" name="leaf" value="${obj.leaf}" />
			<input type="hidden" name="number" value="${obj.number}" />
			<table align="center">
				<tr>
					<td width="60">
						标题：
					</td>
					<td>
						<input type="text" name="title" value="${obj.title}" />
					</td>
				</tr>
				<c:if test="${obj.leaf==1}">
					<tr>
						<td>
							URL：
						</td>
						<td>
							<input type="text" name="url" value="${obj.url}" />
						</td>
					</tr>
				</c:if>
				<tr>
					<td colspan="2" align="center">
						<br />
						<input type="submit" name="submit" value="保存" />
						&nbsp;&nbsp;
						<input type="reset" name="reset" value="重置" />
						&nbsp;&nbsp;
						<input type="button" name="button" value="取消"
							onclick="window.parent.FormEditWin.close();">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
