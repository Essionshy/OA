<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="/WEB-INF/jsp/base/commons-tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<%@include file="/WEB-INF/jsp/base/commons-css.jsp"%>
<%@include file="/WEB-INF/jsp/base/commons-js.jsp"%>
<script type="text/javascript">
	$(function() {
		$('#btn_logout').click(function() {
			location.href = "${baseurl}/logout";
		});

		$('#main_tree').tree({
			url : '${baseurl}/menu/list',
			onClick : function(node) {
				//alert(node.text); // alert node text property when clicked	
				//判断如果为父菜单（一级菜单）不应该添加Tabs窗口
				var root=$('#main_tree').tree('getParent',node.target);			
				if(node.text != root.text){
					addTabs('#tabs_content', node.text,node.attributes);
				}
			}
		});
	});
	//添加Tabs标签面板
	function addTabs(ele, name,filename) {
		//判断要添加的标签是否存在，存在则选中，不存在则添加
		if ($(ele).tabs('exists', name)) {
			$(ele).tabs('select', name);
		} else {
			$(ele).tabs('add', {
				title : name,
				closable:true,
				selected : true,
				//备注：href引用资源文件的内容必须在《body>标签中，其他地方无效
				href:filename				
			});
		}
	}
</script>
</head>
<body>
	<div id="cc" class="easyui-layout" style="height: 620px;">
		<div
			data-options="region:'north',title:'宇虹科技OA办公系统',collapsible:false"
			style="height: 100px;">
			<div
				style="height: 50px; line-height: 70px; float: left; font-size: 20px; font-weight: bold;">
				宇虹办公自动化系统</div>
			<div style="height: 50px; line-height: 70px; float: right;">
				您好，${sessionScope.USERINFO },欢迎登录！！ &nbsp;&nbsp;<a id="btn_logout"
					href="#" class="easyui-linkbutton">退出系统</a>
			</div>
		</div>
		<div data-options="region:'south',title:''" style="height: 70px;">
			<div style="height: 60px; text-align: center; line-height: 60px;">Copyright
				&copy;宇虹科技有限责任公司 地址：四川省成都市学海路88号 网址：http://www.hongyu.com
				电话：028-64918202</div>
		</div>
		<div data-options="region:'west',title:'菜单管理',collapsible:false"
			style="width: 200px;">
			<ul id="main_tree"></ul>
		</div>
		<div data-options="region:'center',title:''"
			style="padding: 5px; background: #eee;">
			<div id="tabs_content" class="easyui-tabs" fit="true">
				<div title="欢迎页" style="padding: 20px; display: none;">
					<h2>欢迎使用宇虹办公自动化管理系统</h2>
				</div>
			</div>
		</div>
	</div>
</body>
</html>