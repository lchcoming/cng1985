<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>联系我</title>
<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
 <style type="text/css" rel="stylesheet">
    form {
    margin: 0;
    }
    .editor {
    margin-top: 5px;
    margin-bottom: 5px;
    }
    .main{
    width:768px;
    margin-left:auto;
    margin-right:auto;
    margin-top:0px;
    }
    .line{
    width:700px;
    heght:2px;
     background: #433433;
    }
  </style>
    <script type="text/javascript" src="http://www.google.com/jsapi"></script>
  <script type="text/javascript">
    google.load('visualization', '1', {packages: ['geomap']});

    function drawVisualization() {
      var data = new google.visualization.DataTable();
      data.addRows(6);
      data.addColumn('string', 'Country');
      data.addColumn('number', 'Popularity');
      data.setValue(0, 0, 'Germany');
      data.setValue(0, 1, 200);
      data.setValue(1, 0, 'United States');
      data.setValue(1, 1, 300);
      data.setValue(2, 0, 'Brazil');
      data.setValue(2, 1, 400);
      data.setValue(3, 0, 'Canada');
      data.setValue(3, 1, 500);
      data.setValue(4, 0, 'France');
      data.setValue(4, 1, 600);
      data.setValue(5, 0, 'China');
      data.setValue(5, 1, 700);
      
      var geomap = new google.visualization.GeoMap(
          document.getElementById('visualization'));
      geomap.draw(data, null);
    }
    

    google.setOnLoadCallback(drawVisualization);
  </script>
</head>
<body>
<%@include file="top.jsp" %>
<div class="main">
<%@include file="/ads/ad728.jsp" %>
<table>
<tr>
<td>联系人:ada.young</td>

</tr>
<tr>
<td>email:cng1985@gmail.com</td>

</tr>
<tr>
<td><object type="application/x-shockwave-flash" data="https://clients4.google.com/voice/embed/webCallButton" width="230" height="85"><param name="movie" value="https://clients4.google.com/voice/embed/webCallButton" /><param name="wmode" value="transparent" /><param name="FlashVars" value="id=a12c2586ac19a754dfd560fb8cabb6b478f62972&style=0" /></object></td>
</tr>
</table>

<div id="content">Loading...</div>
<div id="visualization" style="width: 800px; height: 400px;"></div>
</div>
<%@include file="foot.jsp" %>
<%@include file="bbs.jsp" %>
</body>
</html>