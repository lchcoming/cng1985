<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file= "../common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="<%=path%>/project/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/interface/CompanyTypeAction.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/util.js"></script>
<script type="text/javascript" src="<%=path%>/js/jquery-1.3.2.js"></script>
<script>
function checkCompanyType(thisText){
	var id = thisText.value;
	CompanyTypeAction.checkCompanyTypeNumber(id, function flag(returnValue){
		if(returnValue =='true'){
			return true;
		}else{
			alert("该供货商类型编号已存在，请重新输入！");
			thisText.focus();
			return false;
		}
	});
}

function check(){
	var message="";
	if(document.getElementById("companyTypeName").value==""){
    	message += '请填写类型名称！\n';	
	}
	if(document.getElementById("companyTypeNumber").value==""){
    	message += '请填写类型编号！\n';
	}
	if(message.length > 0){
	 	alert(message);
		return false;
	}	
	return true;
}

function doAction(actionstr){
	var thisText = document.getElementById("companyTypeNumber");
	if(check()){	
		document.forms[0].action = actionstr;
		document.forms[0].submit();
	}
}
</script>
</head>

<body>
<form method="post" action="">
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="contentBorder" style="font-size:12px;">
  <tr>
  	<input type="hidden" name="vo.id" value="<s:property value="vo.id"/>"/>
  	<input type="hidden" name="vo.parentOrderCode" value="<s:property value="vo.parentOrderCode"/>"/>
    <td width="22" height="30" background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td width="114" align="left" background="<%=path%>/project/img/img_index_02_10.gif"><span class="t1">添加供应商类型</span></td>
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
    <td align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td align="left"><font color="red"><s:actionmessage /></font></td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">类型名称：</td>
    <td align="left"><input id="companyTypeName" type="text" name="vo.companyType.companyTypeName" value="${vo.companyType.companyTypeName}"/></td>
    <td align="left">类型编号：</td>
    <td align="left"><input id="companyTypeNumber" type="text" name="vo.companyType.demo3" value="${vo.companyType.companyType.demo3}"/></td>
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
    <input  type="button" onClick="doAction('addCompanyType.action');"  style="width:80px" value="提 交" />
    </td>
    <td align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
  </tr>
</table>
</form>
</body>
</html>
