<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage<School.LinqModle.Message>" %>
<%@ Import Namespace="School.LinqModle" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>Index</title>
</head>
<body>
    <div>
    <%=Html.ActionLink("Ìí¼Ó","create") %>
    <br />
    <%
        List<Message> message = ViewData["message"] as List<Message>;
        int pagemax=(int)ViewData["pagemax"];
        int page=(int)ViewData["page"];
         %>
         <%
             foreach (var item in message)
             {
                 %>
                 <%=item.Title%><%=item.ID %>
                 <%=Html.ActionLink(item.Title, string.Format("Details/{0}", item.ID))%>
                 <br />
                 <%
             }  
            %>
         <br />
         <%
             int star = 0;
             int end = 0;
             if (page > 3)
             {
                 star = page - 3;
                 end = page + 3;
             }
             if (page <= 3)
             {
                 star = 1;
                 end = 7;
             }
             if (end > pagemax)
             {
                 end = pagemax+1;
             }
             for (int i = star; i < end; i++)
             {
                 Console.Write("{0}\t", i);
                 %>
                 <%=Html.ActionLink(i.ToString(), (string.Format("Index/?page={0}", i)))%>
                 
                 <%
             }
             
           %>
         
    </div>
</body>
</html>
