<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>用户注册</title>
		<link rel="stylesheet" type="text/css" href="./css/login.css">

	</head>
	<body>
			<form  method="post" action="qiantaiadduser" id="Myfrom">
		<div class="regist">
			<div class="regist_center">
				<div class="regist_top">
					<div class="left fl">会员注册</div>
					<div class="right fr"><a href="./index.html" target="_self">小米商城</a></div>
					<div class="clear"></div>
					<div class="xian center"></div>
				</div>

				<div class="regist_main center" id="register">
						<div class="username">用&nbsp;&nbsp;户&nbsp;&nbsp;名:&nbsp;&nbsp;<input class="shurukuang" type="text" name="loginName" placeholder="请输入你的用户名"/></div>
						<div class="username">真实姓名:<input class="shurukuang" type="text" name="userName" placeholder="请输入你的真实姓名"/></div>
						<div class="username">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:&nbsp;&nbsp;<input class="shurukuang" type="passWord" name="passWord" placeholder="请输入你的密码" id="PassWord"/></div>
						<div class="username">确认密码:&nbsp;&nbsp;<input class="shurukuang" type="password" name="repassword" placeholder="请确认你的密码"/></div>
						<div class="username">性&nbsp;&nbsp;别&nbsp;&nbsp;
											<input type="radio"  name="sex" value="0" />女
											<input type="radio"  name="sex" value="1" />男
											</div>
						<div class="username">手&nbsp;&nbsp;机&nbsp;&nbsp;号:&nbsp;&nbsp;<input class="shurukuang" type="text" name="mobile" placeholder="请填写正确的手机号"/></div>
						<div class="username">身份证号:&nbsp;&nbsp;<input class="shurukuang" type="text" name="identityCode" placeholder="请填写正确的身份证号"/></div>
						<div class="username">E-mail:&nbsp;&nbsp;<input class="shurukuang" type="text" name="email" placeholder="请填写正确的邮箱"/></div>
						<div class="username">收货地址:&nbsp;&nbsp;<input class="shurukuang" type="text" name="userAddress" placeholder="请填写收货地址"/></div>
						<input type="hidden" name="type" value="0">
						<div class="username">是否同意协议<input type="checkbox" name="checktext"></div>
				</div>
				<div class="regist_submit">
					<input class="submit" type="submit" name="submit" value="立即注册" >
				</div>

			</div>
		</div>
		</form>
	</body>
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript"src="js/validate.js"></script>

</html>