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

</head>
<body>
	<div id="cc" class="easyui-layout" style="height: 620px;">
		<div data-options="region:'north',title:'宇虹科技OA办公系统',split:true"
			style="height: 100px;">
			<h2>宇虹办公自动化系统</h2>
		</div>
		<div data-options="region:'south',title:'',split:true"
			style="height: 100px;">
		
			宇虹科技有限责任公司	地址：四川省成都市学海路88号	网址：http://www.hongyu.com	电话：028-64918202	
		</div>
		<div data-options="region:'west',title:'菜单管理',split:true"
			style="width: 280px;"></div>
		<div data-options="region:'center',title:''"
			style="padding: 5px; background: #eee;">
			<div id="tt" class="easyui-tabs"  fit="true">
				<div title="欢迎页" style="padding: 20px; display: none;">
					<h2>欢迎使用宇虹办公自动化管理系统</h2>
				</div>
			
			</div>
		</div>
	</div>

</body>
</html>