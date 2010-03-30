<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file= "../common.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>阳光装饰供货商类型列表</title>
<link href="<%=path%>/project/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/interface/CompanyTypeAction.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/engine.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/dwr/util.js"></script>
<script>
function reflashTree(){
	window.parent.frames('left').location.reload()
}
function deleteCompanyType(id,pagerMethod,currentPage,parentId){
	CompanyTypeAction.check(id, function flag(returnValue){
		if(returnValue =='1'){
			alert("删除错误！该节点下还有子节点，请先删除子节点！");
		}else if(returnValue == '2'){
			alert("删除错误！该节点下还有供货商信息，请先删除供货商信息！");
		}else if(returnValue == '3'){
			document.forms[0].action = "deleteCompanyType.action?vo.companyType.companyTypeId="+id
										+"&vo.pagerMethod="+pagerMethod+"&vo.currentPage="+currentPage
										+"&vo.id="+parentId;
			document.forms[0].submit();
		}
	});
}	
</script>
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
</head>
<body onLoad="reflashTree();">
<form method="post" action="">
<table width="100%" border="0" cellpadding="0">
  <tr>
    <td height="28" colspan="2" align="left" valign="middle" background="<%=path%>/project/img/cat_bg.gif" style="border:#CCCCCC solid 1px;">
	<table width="400" border="0" cellpadding="0" cellspacing="0" style="font-size:12px;">
      <tr>
        <td width="57">&nbsp;</td>
        <td width="16"><img src="<%=path %>/project/img/office_752.png" width="16" height="16" /></td>
        <td width="133"><a href="preAddCompanyType.action?vo.id=<s:property value="vo.id"/>&vo.parentOrderCode=<s:property value="vo.parentOrderCode"/>">添加供应商分类</a></td>
        <td width="35">&nbsp;</td>
      </tr>
    </table>
    </td>
  </tr>
  <tr>
  <td height="181" colspan="2" align="left" valign="top"  style="padding:5px;">
	<table width="100%" border="0" cellspacing="1" bgcolor="#999999" style="font-size:12px;" onmouseover="MouseOver()" onclick="MouseClick()"  onmouseout="MouseOut()">
      <tr>
        <td width="7%" height="25" align="center" background="<%=path%>/project/img/cat_bg.gif">序号</td>
        <td width="21%" align="center" background="<%=path%>/project/img/cat_bg.gif">分类编号</td>
        <td width="19%" align="center" background="<%=path%>/project/img/cat_bg.gif">分类名称</td>
        <td width="18%" align="center" background="<%=path%>/project/img/cat_bg.gif">所属类型</td>
        <td width="18%" align="center" background="<%=path%>/project/img/cat_bg.gif">创建时间</td>
        <td width="17%" align="center" background="<%=path%>/project/img/cat_bg.gif">操 作</td>
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
        <td align="center"><s:property value="demo3"/></td>
        <s:if test="#st.first">
        <s:set name="it" value="companyType.companyTypeName"/>
        </s:if>
        <td align="center"><s:property value="companyTypeName"/></td>
        <td align="center">
        <s:if test="#st.last" ><s:property value="#it"/></s:if>
        <s:else><s:property value="companyType.companyTypeName"/></s:else></td>
        <td align="center"><s:date name="companyTypeCreatTime" format="yyyy-MM-dd" /></td>
        <td align="center"><a href="preEditCompanyType.action?vo.companyType.companyTypeId=<s:property value="companyTypeId"/>
        &vo.parentOrderCode=<s:property value="vo.parentOrderCode"/>&vo.currentPage=${vo.currentPage}&vo.pagerMethod=${vo.pagerMethod}">【修改】</a>
        <a href="#" onClick="if(confirm('确定要删除吗？'))deleteCompanyType('${companyTypeId}','${vo.pagerMethod}','${vo.currentPage}','${vo.id}');">【删除】</a></td>
      </tr>
      </s:iterator>
      </s:if>
      </s:if>  
    </table>
	<br />
	<table width="100%" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="30" align="center">
        <jsp:include page="../common/page.jsp?actionparam=companyTyepList.action?vo.id=${vo.id}" flush="true"/></td>
      </tr>
    </table></td>
  </tr>
</table>
</form>
</body>
</html>
