<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file= "../common.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="<%=path%>/project/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/interface/CompanyDetailAction.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/util.js"></script>
<script>
function checkCompanyDetail(thisValue){
	var id = thisValue.value;
	CompanyDetailAction.checkCompanyDetailNumber(id, function flag(returnValue){
		if(returnValue =='true'){
			alert("该供货商编号已存在，请重新输入！");
			thisValue.focus();
		}
	});
}
function isNoEmail(obj) {
	var strReg = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/i;
	if(obj.value != ""){
		if (!strReg.test(obj.value)) {
			alert("请输入正确的邮件地址!");
			obj.select();
			obj.focus();
			return true;
		}
		return false;
	}	
}
function check(){
	var message="";
	if(document.getElementById("demo1").value==""){
    	message += '请填写公司编号！\n';	
	}
	if(document.getElementById("companyTel").value==""){
    	message += '请填写公司电话！\n';
	}
	if(document.getElementById("companyContactMan").value==""){
    	message += '请填写公司经理联系人！\n';
	}
	if(document.getElementById("companyName").value==""){
    	message += '请填写公司名称！\n';
	}
	if(message.length > 0){
	 	alert(message);
		return false;
	}	
	return true;
}
function checklength(thisValue, maxLength){
	var len = thisValue.value.length;
	if (len > maxLength){
		alert('超出了系统可输入的最大长度30位！');
		thisValue.select();
		thisValue.focus();
	}
}

</script>
</head>

<body>
<form action="addCompanyDetail.action" method="post" onSubmit="return check();">
<table width="100%" border="0" cellpadding="0" cellspacing="0" class="contentBorder" style="font-size:12px;">
  <tr>
    <input type="hidden" name="vo.parentId" value="<s:property value="vo.parentId"/>"/>
    <td height="30" background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/img_index_02_10.gif"><span class="t1">添加公司资料</span></td>
    <td background="<%=path %>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td width="66" background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
    <td background="<%=path%>/project/img/img_index_02_10.gif">&nbsp;</td>
  </tr>
  <tr>
    <td height="28" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
  </tr>
   <tr>
    <td height="30">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td ><font color="red"><s:actionmessage /></font></td>
    <td align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">公司编号：</td>
    <td align="left">
    <input id="demo1" name="vo.companyDetail.demo1" value="${vo.companyDetail.companyType.demo3}" type="text" size="15" /></td>
    <td align="left">公司电话：</td>
    <td align="left">
    <input id="companyTel" name="vo.companyDetail.companyTel" value="${vo.companyDetail.companyTel}" value="" type="text" size="15" onblur="checklength(this,30);"/></td>
    <td align="left">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">公司名称：</td>
    <td align="left">
    <input id="companyName" name="vo.companyDetail.companyName" value="${vo.companyDetail.companyName}" type="text" size="15" /></td>
    <td align="left">公司网址：</td>
    <td align="left">
    <input id="companyWebsite" name="vo.companyDetail.companyWebsite" value="${vo.companyDetail.companyWebsite}" type="text" size="15"/></td>
    <td align="left">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">公司经理联系人：</td>
    <td align="left">
    <input id="companyContactMan" name="vo.companyDetail.companyContactMan" value="${vo.companyDetail.companyContactMan}" type="text" size="15" /></td>
    <td align="left">手机：</td>
    <td align="left">
    <input id="companyMobile" name="vo.companyDetail.companyMobile" value="${vo.companyDetail.companyMobile}" type="text" size="15" onblur="checklength(this,30);"/></td>
    <td align="left">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">E-MAIL：</td>
    <td align="left">
    <input id="companyEmail" name="vo.companyDetail.companyEmail" value="${vo.companyDetail.companyEmail}" type="text" size="15"  onblur="isNoEmail(this);"/></td>
    <td align="left">公司地址：</td>
    <td align="left">
    <input id="companyAddress" name="vo.companyDetail.companyAddress" value="${vo.companyDetail.companyAddress}" type="text" size="15" /></td>
    <td align="left">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left">传真：</td>
    <td align="left">
    <input id="companyFax" name="vo.companyDetail.companyFax" value="${vo.companyDetail.companyFax}" type="text" size="15"/></td>
    <td align="left">经营品种：</td>
    <td align="left">
    <input id="companyType" name="vo.companyDetail.demo4" value="${vo.companyDetail.demo4}" type="text" size="15" /></td>
    <td align="left">&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td width="22" height="30">&nbsp;</td>
    <td width="114" align="left">&nbsp;</td>
    <td width="216" align="left">
    <input type="submit" value="确认提交"/>
    </td>
    <td width="83" align="left">&nbsp;</td>
    <td width="236" align="left">&nbsp;</td>
    <td align="left">&nbsp;</td>
    <td width="11">&nbsp;</td>
  </tr>
</table>
</form>
</body>
</html>
