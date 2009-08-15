<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>地图搜索</title>
<style type="text/css" rel="stylesheet">
    form {
    margin: 0;
    }
    .editor {
    margin-top: 5px;
    margin-bottom: 5px;
    }
    .main{
    width:730px;
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
 <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;sensor=true_or_false&amp;key=ABQIAAAAH80-Y87XpsBeX9dD6s11XRRz5Xc5DfDk61Quo47e5PLdy7WiUBTyBrrhUz_W3sfYfmhtIIq-NwQA9A&sensor=true" type="text/javascript"></script>
    <script type="text/javascript">

    function initialize() {
      if (GBrowserIsCompatible()) {
        var map = new GMap2(document.getElementById("map_canvas"));
        map.setCenter(new GLatLng(39.9493, 116.3975), 13);
      }
    }

    </script>
<script type="text/javascript"> 
 
    var map = null;
    var geocoder = null;
 
    function initialize() {
      if (GBrowserIsCompatible()) {
        map = new GMap2(document.getElementById("map_canvas"));
        map.setCenter(new GLatLng(39.917, 116.397), 13);
        geocoder = new GClientGeocoder();
      }
    }
   
    function showAddress(address) {
      if (geocoder) {
        geocoder.getLatLng(
          address,
          function(point) {
            if (!point) {
              alert("不能解析: " + address);
            } else {
              map.setCenter(point, 13);
              var marker = new GMarker(point);
              map.addOverlay(marker);
              marker.openInfoWindowHtml(address);
            }
          }
        );
      }
    }
    </script> 
  </head> 
 
  <body onload="initialize()" onunload="GUnload()"> 
   <div class="main">
   <%@include file="/ads/ad728.jsp"%>
    <form action="#" onsubmit="showAddress(this.address.value); return false"> 
      <p> 
        <input type="text" size="60" name="address" value="西安市软件园" /> 
        <input type="submit" value="Go!" /> 
      </p> 
      <div id="map_canvas" style="width: 730px; height: 600px"></div> 
      <%@include file="bbs.jsp" %>
    </form> 
    
    </div>
    <script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
try {
var pageTracker = _gat._getTracker("UA-9943712-1");
pageTracker._trackPageview();
} catch(err) {}</script>
</body>
</html>