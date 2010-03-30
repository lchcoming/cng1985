<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file= "../common.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="<%=path%>/project/css.css" rel="stylesheet" type="text/css" />
</head>

<body>
<table width="100%" border="0" align="center"  cellpadding="3" cellspacing="0" class="contentBorder" style="font-size:12px;">
  <tr>
    <td height="28" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif"><span>查看材料供应商资料</span></td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
    <td align="left" background="<%=path%>/project/img/cat_bg.gif">&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">公司编号：</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">&nbsp;${vo.companyDetail.demo1}</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">公司电话：</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">&nbsp;${vo.companyDetail.companyTel}</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">公司名称：</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">&nbsp;${vo.companyDetail.companyName}</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">公司网址：</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">&nbsp;${vo.companyDetail.companyWebsite}</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">公司经理联系人：</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">&nbsp;${vo.companyDetail.companyContactMan}</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">手机：</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">&nbsp;${vo.companyDetail.companyMobile}</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">传真：</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">&nbsp;${vo.companyDetail.companyFax }</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">经营品种：</td>
    <td align="left" style="border-bottom:dashed #999999 1px;">&nbsp;${vo.companyDetail.demo4 }</td>
  </tr>
  <tr>
    <td height="30">&nbsp;</td>
    <td align="left" >E-MAIL：</td>
    <td align="left" >&nbsp;${vo.companyDetail.companyEmail}</td>
    <td align="left" >公司地址：</td>
    <td align="left" >&nbsp;${vo.companyDetail.companyAddress}</td>
  </tr>
  <br/>
</table>
<br/>
<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" background="<%=basePath%>/project/img/img_index_02_10.gif">
  <tr>
    <td width="5%" height="25">&nbsp;</td>
    <td width="95%"><span style="font-size: 12px;color :#FFFFFF">公司经营的产品</span></td>
  </tr>
</table>
<table width="100%" border="0" align="center"  cellpadding="3" cellspacing="1" bgcolor="#999999" style="font-size:12px;"> 
      <tr>
        <td width="4%" height="25" align="center" background="<%=basePath%>/project/img/cat_bg.gif">序号</td>
        <td width="15%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">材料编号</td>
        <td width="13%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">材料名称</td>
        <td width="9%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">材料品牌</td>
        <td width="10%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">产品规格</td>
        <td width="8%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">单位</td>
        <td width="7%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">单价</td>
        <td width="10%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">进资源库时间</td>
        <td width="14%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">供应商</td>
      </tr> 
     <s:if test="vo.companyDetail.cailiaoZiyuans != null">
     <s:set name="pages" value="vo.companyDetail.cailiaoZiyuans"></s:set>
     <s:iterator value="#pages" status="st">
     <s:if test="#st.odd==true">
		<tr bgcolor="#FFFFFF">
	   </s:if>
		<s:else>		 
		<tr bgcolor="#EEEEEE">	
		</s:else>
        <td height="20" align="center"><s:property value="#st.index+1"/></td> 
        <td align="center"> <s:property value="cailiaoNo"/></td> 
        <td align="center"> <s:property value="cailiaoName"/></td>
        <td align="center"> <s:property value="cailiaoPinpai"/></td>
        <td align="center"><s:property value="cailiaoGuige"/></td> 
        <td align="center"><s:property value="cailiaoDanwei"/></td>
        <td align="center"><s:property value="cailiaoAdPrice"/></td> 
        <td align="center"><s:property value="cailiaoInTime"/></td> 
        <td align="center"><s:property value="company.companyName"/></td> 
      </tr> 
  </s:iterator>
  </s:if>
</table>
   <tr>
    <td colspan="8">
    	<input align="left" value="返  回" type="button" onClick="javascript:history.back(1);">
    </td>
  </tr>
</body>
</html>
