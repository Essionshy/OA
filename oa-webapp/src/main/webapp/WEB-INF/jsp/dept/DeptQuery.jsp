<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/base/commons-tag.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>
</head>
<body>
	<form id="sysdeptqueryForm">
		<table class="table_search">
			<tbody>
				<tr>
					<td class="left">部门名称：</td>
					<td><input class="easyui-textbox" name="dept.name" style="width: 300px"></td>
					<td class="left">成立时间：</td>
					<td><input id="dd" type="text" class="easyui-datebox" ></td>
					
					<td><a id="btn_dept_search" href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-search'">查询 </a></td>
				</tr>
			</tbody>
		</table>
	</form>
	<table border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<tbody>
			<tr>
				<td>
					<table id="deptlist"></table>
				</td>
			</tr>
		</tbody>
	</table>
	<script type="text/javascript">
	//定义datagrid列属性值
	var columns_value = [ [ {
		field :'chckbox',
		checkbox:true		
	}, {
		field : 'deptId',
		title : '部门代码',
		width : 100
	}, {
		field : 'name',
		title : '部门名称',
		width : 100
	}, {
		field : 'managerId',
		title : '部门经理',
		width : 100
	}, {
		field : 'telephone',
		title : '办公电话',
		width : 100
	}, {
		field : 'email',
		title : '电子邮箱',
		width : 100
	}, {
		field : 'address',
		title : '位置',
		width : 100
	}, {
		field : 'createDate',
		title : '成立日期',
		width : 100,
		formatter : function(value, row, index) {
			return row.createDate
		}
	}, {
		field : 'remark',
		title : '备注',
		width : 100
	} ] ]
	//定义datagrid工具栏
	var toolbar_v = [ {
		id : 'btn_add',
		text : '添加',
		iconCls : 'icon-add',
		handler : function() {
			alert('添加用户')
		}
	} ]

	$(function() {
		$('#deptlist').datagrid({
			title : '部门查询列表 ',
			//width:600,
			//height : auto,
			nowrap : true,
			striped : true,
			url : '${baseurl}/dept/list',			
			idField : 'deptId',
			columns : columns_value,
			loadMsg : '主人，正在努力加载中，请稍候.....',
			fitColumns : true,
			pagination : true,
			displayMsg:'显示 {from} to {to} of {total} 页面信息。',
			pageList : [ 10, 15, 20, 30 ],
			rownumbers : true,
			toolbar : toolbar_v
		});
		//用户条件查询
		$('#btn_dept_search').click(function() {
			var formdata = $('#sysdeptqueryForm').serializeJson();			
			$('#deptlist').datagrid('load', formdata);
		})

	})
</script>
</body>
</html>