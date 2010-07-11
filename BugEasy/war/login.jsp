<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="/js/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="/js/easyloader.js"></script>
	<script>
	easyloader.locale="zh_CN";
		function load1(){
			using('calendar', function(){
				$('#cc').calendar({
					width:180,
					height:180
				});
			});
		}
		function load2(){
			using(['dialog','messager'], function(){
				$('#dd').dialog({
					title:'Dialog',
					width:300,
					height:200
				});
				$.messager.show({
					title:'info',
					msg:'dialog created'
				});
			});
		}
	</script>
</head>
<body>
<h1>ValidateBox</h1>
	<div>
	<table>
		<tr>
			<td>Name:</td>
			<td><input class="easyui-validatebox" required="true" validType="length[1,3]"></td>
		</tr>
		<tr>
			<td>Email:</td>
			<td><input class="easyui-validatebox" validType="email"></td>
		</tr>
		<tr>
			<td>URL:</td>
			<td><input class="easyui-validatebox" required="true" validType="url"></td>
		</tr>
		<tr>
			<td>Note:</td>
			<td><textarea class="easyui-validatebox" required="true" style="height:100px;"></textarea></td>
		</tr>
	</table>
	</div>
	<h1>EasyLoader</h1>
	<a href="#" class="easyui-linkbutton" onclick="load1()">Load Calendar</a>
	<a href="#" class="easyui-linkbutton" onclick="load2()">Load Dialog</a>
	<div id="cc"></div>
	<div id="dd"></div>
		<a href="#" class="easyui-linkbutton" icon="icon-print">Print</a>

		<a href="#" class="easyui-linkbutton" plain="false" icon="icon-cancel">Cancel</a>
		<a href="#" class="easyui-linkbutton" plain="false" icon="icon-reload">Refresh</a>
		<a href="#" class="easyui-linkbutton" plain="false" icon="icon-search">Search</a>
		<a href="#" class="easyui-linkbutton" plain="true">text button</a>
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-print">Print</a>
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-help"> </a>
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-save"></a>
		<a href="#" class="easyui-linkbutton" plain="true" icon="icon-back"></a>
	

</html>