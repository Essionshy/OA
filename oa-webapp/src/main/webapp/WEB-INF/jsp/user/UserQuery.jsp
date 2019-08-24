<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!--UserQuery页面将作为子页面被引入main页面中，经过测试发现，
	本页面脚本须放置在body中，否则页面脚本无法正常使用。另外，因为本页面引用了${baseurl}，
	该变量在commons-tag.jsp页面中被 定义为公共变量，本页面须单独引入该文件，
	否则main中引入子页面的请求路径会失效，造成页面找不到的情况，从而导致服务器端数据无法加载  -->
<%@include file="/WEB-INF/jsp/base/commons-tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>
</head>
<body>
	<form id="sysuserqueryForm">
		<table class="table_search">
			<tbody>
				<tr>
					<td class="left">用户名：</td>
					<td><input class="easyui-textbox" name="user.userName"
						style="width: 200px"></td>
					<td class="left">部门：</td>
					<td><select id="sel_dept" class="easyui-combobox"
						name="user.deptId" style="width: 200px;">
							<option value="">请选择</option>
							<c:forEach var="dept" items="${DicInfo.depts }">
								<option value="${dept.deptId }">${dept.name }</option>
							</c:forEach>
					</select></td>

					<td class="left">职位：</td>
					<td><select id="sel_position" class="easyui-combobox"
						name="user.positionId" style="width: 200px;">
							<option value="">请选择</option>
							<c:forEach var="position" items="${DicInfo.positions }">
								<option value="${position.code }">${position.name }</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td class="left">账号状态：</td>
					<td><select id="sel_state" class="easyui-combobox"
						name="user.state" style="width: 200px;">
							<option value="">请选择</option>
							<option value="0">正常</option>
							<option value="1">暂停</option>
					</select></td>
					<td>创建日期</td>
					<td>起：<input id="dd" type="text" name="user.startDate" class="easyui-datebox" ></td>
					<td>止：<input id="dd" type="text" name="user.endDate"class="easyui-datebox" ></td>
					
					<td><a id="btn_user_search" href="#" class="easyui-linkbutton"
						data-options="iconCls:'icon-search'">查询 </a></td>
				</tr>
			</tbody>
		</table>
	</form>
	<table border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<tbody>
			<tr>
				<td>
					<table id="sysuserlist"></table>
				</td>
			</tr>
		</tbody>
	</table>
	<script type="text/javascript">
		//定义datagrid列属性值
		var columns_value = [ [ {
			field : 'chckbox',
			checkbox : true
		}, {
			field : 'userName',
			title : '用户名',
			width : 100
		}, {
			field : 'deptName',
			title : '所属部门',
			width : 100
		}, {
			field : 'positionName',
			title : '职位',
			width : 100
		}, {
			field : 'state',
			title : '账号状态',
			width : 100
		}, {
			field : 'createDate',
			title : '创建日期',
			width : 100,
			formatter : function(value, row, index) {
				return row.createDate
			}
		}, {
			field : 'remark',
			title : '备注',
			width : 100
		}, {
			field : 'edit',
			title : '操作',
			width : 100,
			formatter : function(value, row, index) {
				return "<a class='btn_user_edit' href='#' class='easyui-linkbutton'>编辑</a>"+"&nbsp;"+
				"<a class='btn_user_delete' href='#' class='easyui-linkbutton'>删除</a>"
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
		},'-',{
			id : 'btn_delete',
			text : '批量删除',
			iconCls : 'icon-edit',
			handler : function() {
				alert('添加用户')
			}
		},{
			id : 'btn_import',
			text : '导入',
			iconCls : 'icon-add',
			handler : function() {
				alert('批量导入用户')
			}
		},'-',{
			id : 'btn_export',
			text : '导出',
			iconCls : 'icon-edit',
			handler : function() {
				alert('添加用户')
			}
		} ]
	//DataGrid加载用户查询数据 
		$(function() {
			$('#sysuserlist').datagrid({
				title : '用户查询列表 ',
				//width:600,
				//height : auto,
				nowrap : true,
				striped : true,
				url : '${baseurl}/user/list',
				method : 'get',
				idField : 'userName',
				columns : columns_value,
				loadMsg : '主人，正在努力加载中，请稍候.....',
				fitColumns : true,
				pagination : true,
				beforePageText : '第',
				afterPageText : '页',
				displayMsg : '显示 {from} to {to} of {total} 页面信息。',
				pageList : [ 5, 10, 15, 20, 30 ],
				rownumbers : true,
				toolbar : toolbar_v
			});
			//用户条件查询
			$('#btn_user_search').click(function() {
				var formdata = $('#sysuserqueryForm').serializeJson();
				$('#sysuserlist').datagrid('load', formdata);
			})
			//用户添加
			
			
			//用户修改
			
			
		
			//用户删除
			$('.btn_user_delete').on('click ',function() {
				alert("delete")
			})

		}) 
	
	</script>
</body>
</html>