<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/base/commons-tag.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
<%@include file="/WEB-INF/jsp/base/commons-css.jsp"%>
<%@include file="/WEB-INF/jsp/base/commons-js.jsp"%>
<script type="text/javascript">
$(function(){
	$('#btn_login_submit').click(function(){			
		$('#frm_login').form('submit', {
		    url:'${baseurl}/login',
		    onSubmit: function(){
				// do some check
				// return false to prevent submit;
		    },
		    success:function(data){		    	
		    	var result=eval('('+data+')');
		    	if(result.messageCode ==  100){
		    		$.messager.alert("系统消息",result.message);
		    		location.href='${baseurl}/main';
		    	}else{
		    		$.messager.alert("系统消息",result.resultMessage.message);
		    	}
		    	
		    }
		});
	});	
});

</script>
</head>
<body style="background-color:#E9F1FF;">
	<div style="margin:100px auto;width:520px">
		<div id="p_login" class="easyui-panel" title="用户登录 "
			style="width: 500px; height: 300px; padding: 10px; background: #fafafa;">
			<form id="frm_login" method="post">
			<table width="400px" align="center">
				<tr style="height:50px">
					<td>用户名：</td>
					<td><input class="easyui-textbox" name="userName" prompt="Username"
						data-options="iconCls:'icon-man'" style="width: 100%; height: 34px;padding: 10px"></td>
				</tr>
				<tr style="height:50px">
					<td>密&nbsp;&nbsp;&nbsp;码：</td>
					<td><input class="easyui-passwordbox" prompt="Password" name="password"
						iconWidth="28" style="width: 100%; height: 34px; padding: 10px"></td>
				</tr>
				<tr style="height:50px">
					<td align="left"><a href="#">忘记密码?</a></td>
					<td align="right"><a id="btn_login_submit" href="#"
						class="easyui-linkbutton" data-options="iconCls:'icon-ok'">登&nbsp;&nbsp;录</a></td>
				</tr>
			</table>
			</form>
		</div>
	</div>
</body>
</html>