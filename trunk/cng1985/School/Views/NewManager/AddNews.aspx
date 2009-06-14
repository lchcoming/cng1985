<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>AddNews</title>
</head>
<body>
    <%
        List<School.LinqModle.NewsSubType> all = ViewData["nestype"] as List<School.LinqModle.NewsSubType>;
    %>
    <div>
        <%Html.BeginForm(); %>
        <fieldset>
            <legend>�������</legend>������
            <input id="Text1" type="text" name="news.Title" />
            <br />
            ����
            <select id="Select1" name="news.NewsSubType">
                <%foreach (var item in all)
                  {
                %>
                <option value="<%=item.ID%>">
                    <%=item.NewsSubTypeName %>
                </option>
                <% 
                
                    } %>
            </select><br />
            ����
            <br />
            <textarea id="TextArea1" cols="20" rows="2" name="news.NewsContent"></textarea>
            <br />
            <input id="Reset1" type="reset" value="����" />
            <input id="Submit1" type="submit" value="�ύ" />
            <%Html.EndForm(); %>
        </fieldset>
    </div>
</body>
</html>
