<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>公司类别管理</title>
<link href="<%=path %>/project/css.css" rel="stylesheet" type="text/css" />
<script>
	function doNoAction(i){ 
	    var companyNo= document.getElementById('companyNo').value;
	    i.href='searchCompanyDetail.action?vo.companyDetail.companyNo='+companyNo;
	}
	function doNameAction(i){ 
	    var companyName= document.getElementById('companyName').value;
	    i.href='searchCompanyDetail.action?vo.companyDetail.companyName='+companyName;
	}
	function doSearchAction(url){
			document.searchForm.action = url;
			document.searchForm.target="main"
			document.searchForm.submit();
	}
</script>
</head>
<body>
<table width="100%" border="0" cellspacing="0" cellpadding="0"> 
  <tr>
    <td colspan="4" align="center" bgcolor="#FFFFFF" class="STYLE1">     
	  <div>
	    <table width="100%" border="0" cellpadding="0" cellspacing="0" class="backStyle">
          <tr>
            <td width="11%" align="center">&nbsp;</td>
            <td width="10%" height="26" align="center" ><a href="<%=path %>/cailiaoziyuantypetypetree.action">管理材料分类</a></td>
            <td width="12%" align="center">&nbsp;</td>
            <td width="11%" align="center"><a href="<%=path %>/cailiaoziyuantypetree.action">管理材料信息</a></td>
            <td width="11%" align="center">&nbsp;</td>
            <td width="10%" align="center"><a href="<%=path %>/companyTypeMain.action">管理供应商分类</a></td>
            <td width="10%" align="center">&nbsp;</td>
            <td width="11%" align="center" bgcolor="#CCCCCC">管理供应商信息</td>
            <td width="14%" align="center">&nbsp;</td>
          </tr>
        </table>
        <br />
        <form name="searchForm" action="" method="post">
		<table width="100%" border="0" cellpadding="0" cellspacing="0" style="border:#CCCCCC solid 1px;">
          
           <tr>
            <td width="10%" height="25" background="<%=basePath%>/project/img/cat_bg.gif">检索供应商信息：</td>
            <td width="20%" align="center" background="<%=basePath%>/project/img/cat_bg.gif"></td>
            <td width="10%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">&nbsp;</td>
            <td width="20%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">&nbsp;</td>
            <td width="10%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">&nbsp;</td>
            <td align="center" background="<%=basePath%>/project/img/cat_bg.gif">&nbsp;</td>
          </tr>
          <tr>
            <td>供应商编号：</td>
            <td><input type="text" name="vo.companyDetail.companyNo" id="companyNo"/></td>
            <td>供应商名称：</td>
            <td><input type="text" name="vo.companyDetail.companyName" id="companyName"/></td>
            <td>供应商地址：</td>
            <td><input type="text" name="vo.companyDetail.companyAddress" id="companyAddress"/></td>
          </tr>
          <tr>
            <td>经营品种：</td>
            <td><input type="text" name="vo.companyDetail.demo4" id="demo4"/></td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
            <td><input type="button" onclick="doSearchAction('searchCompanyDetail.action');" value="点击搜索" /></td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td height="25">&nbsp;</td>
            <td align="center">&nbsp;</td>
            <td align="center">&nbsp;</td>
            <td align="center">&nbsp;</td>
            <td align="center">&nbsp;</td>
            <td align="center">&nbsp;</td>
          </tr>
        </table>
        </form>
	    <br />		
	    <table width="100%" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="220" align="left" valign="top">
            <iframe src="<%=path%>/companyTypeTree.action?vo.type=2" name="left" width="100%" style="border:#999999 solid 1px; height:500px;" align="left"></iframe>			
			</td>
            <td align="left" valign="top">			
			<iframe src="<%=path%>/companyDetailList.action?vo.parentId=0" name="main" width="100%" style="border:#999999 solid 1px; height:500px;" align="left"></iframe>            
            </td>
          </tr>
        </table>
        
	    <p class="STYLE3">&nbsp;</p>
	    <p><br />
        </p>
	  </div>
	</td>
</tr>
</table>
</body>
</html>
