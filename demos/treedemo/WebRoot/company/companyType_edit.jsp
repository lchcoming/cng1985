<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file= "../common.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=path%>/project/css.css" rel="stylesheet" type="text/css" />
<script>
function check(){
	var message="";
	if(document.getElementById("companyTypeName").value==""){
    	message += '请填写类型名称！\n';	
	}
	if(message.length > 0){
	 	alert(message);
		return false;
	}	
	return true;
}
</script>
</head>
<body>
<form method="post" action="editCompanyType.action" onSubmit="return check();">
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="contentBorder" style="font-size:12px;">
  <tr>
  	<input type="hidden" name="vo.pagerMethod" value="<s:property value="vo.pagerMethod"/>"/>
    <input type="hidden" name="vo.currentPage" value="<s:property value="vo.currentPage"/>"/>
    <input type="hidden" name="vo.id" value="<s:property value="vo.companyType.companyType.companyTypeId"/>"/>
    <input type="hidden" name="vo.companyType.companyTypeId" value="<s:property value="vo.companyType.companyTypeId"/>"/>
  	<input type="hidden" name="vo.companyType.companyType.companyTypeId" value="<s:property value="vo.companyType.companyType.companyTypeId"/>"/>
  	<input type="hidden" name="vo.companyType.companyTypeCreatTime" value="<s:property value="vo.companyType.companyTypeCreatTime"/>"/>
  	<input type="hidden" name="vo.companyType.companyTypeBy" value="<s:property value="vo.companyType.companyTypeBy"/>"/>
  	<input type="hidden" name="vo.companyType.demo1" value="<s:property value="vo.companyType.demo1"/>"/>
  	<input type="hidden" name="vo.companyType.demo2" value="<s:property value="vo.companyType.demo2"/>"/>
  	<input type="hidden" name="vo.companyType.companyDelete" value="<s:property value="vo.companyType.companyDelete"/>"/>
  	<input type="hidden" name="vo.parentOrderCode" value="<s:property value="vo.parentOrderCode"/>"/>
    <td width="22" height="30" background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td width="114" align="left" background="<%=path%>/project/img/img_index_02_10.gif"><span class="t1">编辑供应商类型</span></td>
    <td width="216" background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td width="113" background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
  </tr>
  <tr>
    <td height="28" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">类型名称：</td>
    <td align="left"><input type="text" name="vo.companyType.companyTypeName" id="companyTypeName" value="${vo.companyType.companyTypeName}"/></td>
    <td align="left">类型编号：</td>
    <td align="left"><input type="text" name="vo.companyType.demo3" id="demo3" value="${vo.companyType.demo3}" readonly="readonly"/>
    </td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td align="left">
    <input type="submit" value="提 交"/></td>
    <td align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
  </tr>
</table>
</form>
</body>
</html>
