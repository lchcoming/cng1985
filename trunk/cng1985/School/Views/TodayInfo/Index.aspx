<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage<School.SchoolModle.TodayInfo>" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head id="Head1" runat="server">
    <title>Index</title>
    <link href="../../Content/myworld.css" rel="stylesheet" type="text/css" />
    <style type="text/css">
        .todaynav
    {
            padding-top: 0px;
            padding-left: 20px;
        }
    </style>
</head>
<body>
    <div class="nav">
        <a href="../SchoolHome/Index">�ҵ���ҳ</a>
        <span class="text"> ���հ���</span>
        <a href="../FriendInfo/Index">
            ������ϵ</a>
            <a href="../MessageInfo/Index">��Ϣ��Դ</a>
             <a href="../PlanInfo/Index">���ռƻ�</a>
              <a href="../ProjectInfo/Index">
                ���̽���</a> <a href="../StudyInfo/Index"> �ҵ�ѧϰ</a>
    </div>
    <div class="body">
        <div class="leftnav">
        <h3>���հ���</h3>
        <div class="todaynav">
        <a href="#">��Ҫ����</a>
        <br />
        <a href="#">һ������</a>
         <br />
        <a href="#">�������</a>
         <br />
         </div>
        </div>
        <div class="rightbody">
            <div class="left">
                <div>
                    ֪ͨ</div>
                <div class="more">
                    <a href="#">������Ϣ</a>
                </div>
            </div>
            <div class="right">
                <div>
                    ����</div>
                <div class="more">
                    <a href="#">������Ϣ</a></div>
            </div>
            <div class="line">
            </div>
            <div class="left">
                <div>
                    ��Ƹ</div>
                <div class="more">
                    <a href="#">������Ϣ</a></div>
            </div>
            <div class="right">
                <div>
                    Ѱ������</div>
                <div class="more">
                    <a href="#">������Ϣ</a></div>
            </div>
            <div class="line">
            </div>
        </div>
    </div>
</body>
</html>