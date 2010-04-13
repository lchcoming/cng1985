   <%@ page contentType="text/html;charset=UTF-8" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
   <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
    
   <c:set var="len" value="${fn:length(list)-1}" ></c:set>  
 [  
   <c:forEach items="${types}" var="obj" varStatus="i">  
   {  
       id:'${obj.cailiaoTypeId}',  
     text:'${obj.cailiaoTypeName}',  
       <c:if test="${obj.cailiaoZiyuanTypes == null}">  
         leaf:true,  href:'${obj.cailiaoTypeId}',hrefTarget:'dd',
     </c:if>  
     
      singleClickExpand:true  
  }  
       ,<c:if test="${i.index<len}">,</c:if>  
  </c:forEach>  
   ]  