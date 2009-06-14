<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage" %>

<%@ Import Namespace="School.LinqModle" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Index</title>
    <style type="text/css">
        .ada
        {
            width: 900px;
            height: auto;
            margin-top: 0px;
            margin-right: auto;
            margin-left: auto;
            background-color: #CCCCFF;
        }
        .left
        {
            background-color: #F7E2FC;
            width: 450px;
            float: left;
            height: auto;
            text-align: left;
            text-indent: 10px;
            border-bottom-style: solid;
        }
        .right
        {
            width: 450px;
            background-color: #A2C0F4;
            margin-left: 455px;
            border-bottom-style: dotted;
        }
    </style>
</head>
<body>
    <div class="ada">
        <%
            DataClasses1DataContext entity = new DataClasses1DataContext();
            for (int i = 6; i < 17; i++)
            {
                if ((i % 2 == 0))
                {
                    var a = from c in entity.News
                            where c.NewsSubType == i
                            select c;
        %>
        <div class="left">
            <%
                foreach (var item in a)
                {
            %>
            <%=item.Title %>
             <br />
            <%
            
                }
            %>
        </div>
        <%
            }
                else
                {
                    var a = from c in entity.News
                            where c.NewsSubType == i
                            select c;
        %><div class="right">
            <%
                foreach (var item in a)
                {
            %>
            <%=item.Title %>
            <br />
        <%
            }
        %>
    </div>
    <%
        }
            }
    %>
    </div>
    <div class="ada">
        <div class="left">
            dfdfd</div>
        <div class="right">
            dfdfdf</div>
    </div>
</body>
</html>
