<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<feed xmlns="http://www.w3.org/2005/Atom">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<title>${title }</title>
<id>
${urlid }
</id>
<subtitle>
${subtitle }
</subtitle>
<link href="http://cng1985.appspot.com" />
<link href="http://cng1985.appspot.com/rssarticle.action" rel="self" />
<updated>
<fmt:formatDate value="${now}" pattern="yyyy-MM-dd" />
</updated>
<author>
<name>
${author }
</name>
</author>
<c:forEach var="item" items="${datas}" varStatus="st">
	<entry>
	<link href="/viewarticle.action?article.id=${item.id }" />
	<id>http://cng1985.appspot.com/viewarticle.action?article.id=${item.id }
	</id>
	<title>${item.subject }</title>
	<content type="html">
	<![CDATA[
        ${item.content}
      ]]>
	</content>
	<author>
	<name>ada.young</name>
	</author>
	<updated>
	<fmt:formatDate value="${item.date}" pattern="yyyy-MM-dd" />
	</updated>
	</entry>
</c:forEach>

</feed>