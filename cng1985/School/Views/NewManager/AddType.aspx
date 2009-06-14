<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>AddType</title>
</head>
<body>
    <div>
    <%Html.BeginForm(); %>
       类型名 <input id="Text1" type="text" name="type.NewsSubTypeName" />
                <br />
        <input id="Reset1" type="reset" value="重置" />
        <input id="Submit1" type="submit" value="提交" />
    <%Html.EndForm(); %>
    </div>
</body>
</html>
