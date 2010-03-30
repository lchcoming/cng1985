<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common.jsp" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="<%=path %>/project/css.css" rel="stylesheet" type="text/css" />
</head>
<!--鼠标经过高亮显示表格行，点击固定颜色-->
<script  type="text/javascript">
var highlightcolor='#99FFFF';
var clickcolor='#ffedd2';

function  MouseOver(){
    var source=event.srcElement;        
    if  (source.tagName=="TD"){        
        source=source.parentElement;
        var cells  =  source.children;    
        if  (cells[0].style.backgroundColor!=highlightcolor&&cells[0].style.backgroundColor!=clickcolor)
            for(i=0;i<cells.length;i++){
                cells[i].style.backgroundColor=highlightcolor;
            }        
    }
}

function  MouseOut(){    
    var source=event.srcElement;
    if  (source.tagName=="TD"){    
        source=source.parentElement;
        var cells  =  source.children;    
        if  (cells[0].style.backgroundColor!=clickcolor)    
            for(i=0;i<cells.length;i++){
                cells[i].style.backgroundColor="";
            }        
    }
}

function  MouseClick(){
    var source=event.srcElement;
    if  (source.tagName=="TD"){    
        source=source.parentElement;
        var cells  =  source.children;
        if  (cells[0].style.backgroundColor!=clickcolor)
            for(i=0;i<cells.length;i++)
                cells[i].style.backgroundColor=clickcolor;            
        else
            for(i=0;i<cells.length;i++)
                cells[i].style.backgroundColor="";    
    }
}
</script>
<body>
<table width="100%" border="0" cellpadding="0">
  <tr>
    <td height="28" colspan="2" align="left" valign="middle" background="<%=path %>/project/img/cat_bg.gif" style="border:#CCCCCC solid 1px;">
	
	<table width="400" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td width="57">&nbsp;</td>
        <td width="16"><img src="<%=path %>/project/img/office_752.png" width="16" height="16" /></td>
        <td width="133"><a href="preAddCompanyDetail.action?vo.parentId=<s:property value="vo.parentId"/>">添加供应商</a></td>
        <td width="35">&nbsp;</td>
      </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td height="181" colspan="2" align="left" valign="top"  style="padding:5px;">
	
	<table width="100%" border="0" cellspacing="1" bgcolor="#999999" style="font-size:12px;" onmouseover="MouseOver()" onclick="MouseClick()"  onmouseout="MouseOut()">
      <tr>
        <td width="4%" height="25" align="center" background="<%=path %>/project/img/cat_bg.gif">序号</td>
        <td width="12%" align="center" background="<%=path %>/project/img/cat_bg.gif">供应商编号</td>
        <td width="15%" align="center" background="<%=path %>/project/img/cat_bg.gif">供应商名称</td>
        <td width="13%" align="center" background="<%=path %>/project/img/cat_bg.gif">公司电话</td>
        <td width="7%" align="center" background="<%=path %>/project/img/cat_bg.gif">联系人</td>
        <td width="13%" align="center" background="<%=path %>/project/img/cat_bg.gif">手机</td>
        <td width="11%" align="center" background="<%=path %>/project/img/cat_bg.gif">E-MAIL</td>
        <td width="12%" align="center" background="<%=path %>/project/img/cat_bg.gif">创建时间</td>
        <td width="13%" align="center" background="<%=path %>/project/img/cat_bg.gif">操 作</td>     
      </tr>
      <s:if test="vo.pageResult!=null">	
	  <s:if test="vo.pageResult.resultList!=null">	
	  <s:set name="list" value="vo.pageResult.resultList"/>                   
	  <s:iterator value="#list" status="st">
      <s:if test="#st.odd==true">
		<tr bgcolor="#FFFFFF">
		</s:if>
		<s:else>		 
		<tr bgcolor="#EEEEEE">	
		</s:else>
        <td height="20" align="center"><s:property value="#st.index+1"/></td>
        <td align="center"><s:property value="demo1"/></td>
        <td align="center"><a href="viewCompanyDetail.action?vo.companyDetail.companyId=<s:property value="companyId"/>">
        <s:property value="companyName"/></a></td>
        <td align="center" ><s:property value="companyTel"/></td>
        <td align="center"><s:property value="companyContactMan"/></td>
        <td align="center"><s:property value="companyMobile"/></td>
        <td align="center"><s:property value="companyEmail"/></td>
        <td align="center"><s:property value="demo2"/></td>
        <td align="center"><a href="preEditCompanyDetail.action?vo.companyDetail.companyId=<s:property value="companyId"/>&vo.currentPage=${vo.currentPage}&vo.pagerMethod=${vo.pagerMethod}">【修改】</a> 
        <a href="deleteCompanyDetail.action?vo.companyDetail.companyId=<s:property value="companyId"/>&vo.parentId=<s:property value="vo.parentId"/>&vo.currentPage=${vo.currentPage}&vo.pagerMethod=${vo.pagerMethod}" 
        onclick="return confirm('确定要删除吗？');">【删除】</a></td>
      </tr>
      </s:iterator>
      </s:if>
      </s:if>
    </table>
	<br />
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
      <tr>
	 	<jsp:include page="page/page.jsp?actionparam=companyDetailList.action?vo.parentId=${vo.parentId}" flush="true"/>
      </tr>
    </table></td>
  </tr>
</table>
</body>
</html>
