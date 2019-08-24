<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/base/commons-tag.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>
<%@include file="/WEB-INF/jsp/base/commons-css.jsp"%>
<%@include file="/WEB-INF/jsp/base/commons-js.jsp"%>

</head>
<body>
	<form id="sysrolequeryForm">
		<table class="table_search">
			<tbody>
				<tr>
					<td class="left">角色名称：</td>
					<td><input class="easyui-textbox" name="user.userName"
						style="width: 300px"></td>

					<td class="left">角色状态：</td>
					<td><select id="sel_state" class="easyui-combobox"
						name="user.state" style="width: 200px;">
							<option>请选择</option>
					</select></td>
					<td><a id="btn_role_search" href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-search'">查询 </a></td>
				</tr>
			</tbody>
		</table>
	</form>
	<table border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<tbody>
			<tr>
				<td>
					<table id="sysrolelist"></table>
				</td>
			</tr>
		</tbody>
	</table>
	<script type="text/javascript">
		//定义datagrid列属性值
		var columns_value = [ [
				{
					field : 'chckbox',
					checkbox : true
				},
				{
					field : 'code',
					title : '角色代码',
					width : 100
				},
				{
					field : 'positionName',
					title : '角色名称',
					width : 100
				},
				{
					field : 'state',
					title : '角色状态',
					width : 100
				},
				{
					field : 'gmtCreate',
					title : '创建日期',
					width : 100,
					formatter : function(value, row, index) {
						return row.gmtCreate
					}
				},
				{
					field : 'remark',
					title : '备注',
					width : 100
				},
				{
					field : 'edit',
					title : '操作',
					width : 100,
					formatter : function(value, row, index) {
						return "<a href='#' class='easyui-linkbutton'>编辑</a>"
								+ "&nbsp;"
								+ "<a href='#' class='easyui-linkbutton'>删除</a>"
					}
				} ] ]
		//定义datagrid工具栏
		var toolbar_v = [ {
			id : 'btn_add',
			text : '添加',
			iconCls : 'icon-add',
			handler : function() {
				alert('添加用户')
			}
		}, '-', {
			id : 'btn_delete',
			text : '批量删除',
			iconCls : 'icon-edit',
			handler : function() {
				alert('添加用户')
			}
		}, {
			id : 'btn_import',
			text : '导入',
			iconCls : 'icon-add',
			handler : function() {
				alert('批量导入用户')
			}
		}, '-', {
			id : 'btn_export',
			text : '导出',
			iconCls : 'icon-edit',
			handler : function() {
				alert('添加用户')
			}
		} ]

		$(function() {
			$('#sysrolelist').datagrid({
				title : '用户查询 ',
				//width:600,
				//height : auto,
				nowrap : true,
				striped : true,
				url : '${baseurl}/position/list',
				method : 'get',
				idField : 'roleId',
				columns : columns_value,
				loadMsg : '主人，正在努力加载中，请稍候.....',
				fitColumns : true,
				pagination : true,
				displayMsg : '显示 {from} to {to} of {total} 页面信息。',
				pageList : [ 10, 15, 20, 30 ],
				rownumbers : true,
				toolbar : toolbar_v
			});
			//用户条件查询
			$('#btn_role_search').click(function() {
				var formdata = $('#sysrolequeryForm').serializeJson();
				alert(formdata)
				$('#sysrolelist').datagrid('load', formdata);
			})

		})
	</script>
</body>
</html>