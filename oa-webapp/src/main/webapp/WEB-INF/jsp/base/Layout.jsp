<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/base/commons-css.jsp" %>
<%@include file="/WEB-INF/jsp/base/commons-js.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>模板布局页</title>

    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <script type="text/javascript" src="easyui/jquery-1.7.2.min.js">
    </script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js">
    </script>
</head>
<body>
    <div id="cc" class="easyui-layout" style="width:600px;height:400px;">
        <div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>
        <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
        <div data-options="region:'west',title:'West',split:true" style="width:100px;"></div>
        <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;"></div>
    </div>
</body>
</html>