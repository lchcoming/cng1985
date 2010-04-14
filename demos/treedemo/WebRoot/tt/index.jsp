<%@ page language="java" contentType="text/html; charset=GB2312"%>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
	<title>Customizing ComboBoxTree</title>
		<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/extjs/ext-all.css" />
	 	<script src="<%=request.getContextPath() %>/extjs/ext-base.js"></script>
	 	<script src="<%=request.getContextPath() %>/extjs/ext-all.js"></script>
	    <script src="<%=request.getContextPath() %>/tt/ComboBoxTree.js"></script>
		
		<script type="text/javascript">
			var comboBoxTree;
			Ext.BLANK_IMAGE_URL = '../images/default/s.gif';
			Ext.onReady(function(){
				comboBoxTree = new Ext.ux.ComboBoxTree({
					renderTo : 'comboBoxTree',
					width : 250,
					tree : {
						xtype:'treepanel',
						bbar: ['���ƣ�',{xtype:'trigger',id: 'searchName',width:200,triggerClass:'x-form-search-trigger',onTriggerClick:search}],
						loader: new Ext.tree.TreeLoader({dataUrl:'getNodes.jsp'}),
			       	 	root : new Ext.tree.AsyncTreeNode({id:'0',text:'�����'})
			    	},
			    	
					//all:���н�㶼��ѡ��
					//exceptRoot��������㣬������㶼��ѡ(Ĭ��)
					//folder:ֻ��Ŀ¼����Ҷ�ӺͷǸ���㣩��ѡ
					//leaf��ֻ��Ҷ�ӽ���ѡ
					selectNodeModel:'leaf'
				});
			});
			function showValue(){
				alert("��ʾֵ="+comboBoxTree.getRawValue()+"  ��ʵֵ="+comboBoxTree.getValue());
			}
			function search(){
				var searchName = Ext.getDom('searchName').value;
				alert("��ѯ�ַ�����"+searchName);
			}
		</script>
	</head>
	<body>
		<table>
			<tr>
				<td>&nbsp;</td>
				<td> <div id="comboBoxTree"></div> </td>
				<td> <input type='button' value='ֵ' onclick='showValue()'> </td>
			</tr>
		</table>
	</body>
</html>