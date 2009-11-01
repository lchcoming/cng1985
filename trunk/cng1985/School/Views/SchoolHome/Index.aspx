<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage<School.SchoolModle.SchoolHome>" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Index</title>
    <link href="../../Content/myworld.css" rel="stylesheet" type="text/css" />
</head>
<body>
    <div class="nav">
        <span class="text">�ҵ���ҳ</span> <a href="../TodayInfo/Index">���հ���</a><a href="../FriendInfo/Index">
            ������ϵ</a><a href="../MessageInfo/Index">��Ϣ��Դ</a> <a href="../PlanInfo/Index">���ռƻ�</a>
        <a href="../ProjectInfo/Index">���̽���</a><a href="../StudyInfo/Index"> �ҵ�ѧϰ</a>
    </div>
    <div class="body">
        <div class="leftnav">
        </div>
        <div class="rightbody">
            <div class="left">
                <div>
                    ֪ͨ</div>
                <%foreach (var item in this.Model.News)
                  {
                %>
                <%=item%>
                <br />
                <%
                    } %>
                <div class="more">
                    <a href="#">������Ϣ</a>
                </div>
            </div>
            <div class="right">
                <div>
                    ����</div>
                <%foreach (var item in this.Model.Notice)
                  {
                %>
                <%=item%>
                <br />
                <%
                    } %>
                <div class="more">
                    <a href="#">������Ϣ</a></div>
            </div>
            <div class="line">
            </div>
            <div class="left">
                <div>
                    ��Ƹ</div>
                <%foreach (var item in this.Model.Work)
                  {
                %>
                <%=item%>
                <br />
                <%
                    } %>
                <div class="more">
                    <a href="#">������Ϣ</a></div>
            </div>
            <div class="right">
                <div>
                    Ѱ������</div>
                <%foreach (var item in this.Model.Lost)
                  {
                %>
                <%=item%>
                <br />
                <%
                    } %>
                <div class="more">
                    <a href="#">������Ϣ</a></div>
            </div>
            <div class="line">
            </div>
        </div>
    </div>
</body>
</html>