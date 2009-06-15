<%@ Page Language="C#" Inherits="System.Web.Mvc.ViewPage<School.SchoolModle.StudyInfo>" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>Index</title>
 <link href="../../Content/myworld.css" rel="stylesheet" type="text/css" />
   
</head>
<body>
    <div class="nav">
        <a href="../SchoolHome/Index">我的首页</a><a href="../TodayInfo/Index">今日安排</a><a href="../FriendInfo/Index">
            人脉关系</a><a href="../MessageInfo/Index">信息资源</a> <a href="../PlanInfo/Index">明日计划</a>
        <a href="../ProjectInfo/Index">工程进度</a>  <span class="text">我的学习</span>
    </div>
    <div class="body">
        <div class="leftnav">
        </div>
        <div class="rightbody">
            <div class="left">
                <div>
                    通知</div>
                <div class="more">
                    <a href="#">更多信息</a>
                </div>
            </div>
            <div class="right">
                <div>
                    新闻</div>
                <div class="more">
                    <a href="#">更多信息</a></div>
            </div>
            <div class="line">
            </div>
            <div class="left">
                <div>
                    招聘</div>
                <div class="more">
                    <a href="#">更多信息</a></div>
            </div>
            <div class="right">
                <div>
                    寻物启事</div>
                <div class="more">
                    <a href="#">更多信息</a></div>
            </div>
            <div class="line">
            </div>
        </div>
    </div>
</body>
</html>
