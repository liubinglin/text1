<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>小米商城-个人中心</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
	<!-- start header -->
		<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="index.html" target="_blank">小米商城</a></li>
						<li>|</li>
						<li><a href="index.html">MIUI</a></li>
						<li>|</li>
						<li><a href="index.html">米聊</a></li>
						<li>|</li>
						<li><a href="index.html">游戏</a></li>
						<li>|</li>
						<li><a href="index.html">多看阅读</a></li>
						<li>|</li>
						<li><a href="index.html">云服务</a></li>
						<li>|</li>
						<li><a href="index.html">金融</a></li>
						<li>|</li>
						<li><a href="index.html">小米商城移动版</a></li>
						<li>|</li>
						<li><a href="index.html">问题反馈</a></li>
						<li>|</li>
						<li><a href="">Select Region</a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
					<div class="gouwuche fr"><a href="dingdanzhongxin.jsp">我的订单</a></div>
					<div class="fr">
						<ul>
							<c:if test="${qiantailogin.loginName != null}">
							<li>${qiantailogin.loginName}</li>
						</c:if>
						<c:if test="${qiantailogin.loginName==null}">
							<li><a href="login.jsp" target="_blank">登录</a></li>
							<li>|</li>
							<li><a href="register.jsp" target="_blank" >注册</a></li>
							<li>|</li>
						</c:if>	
							<li><a href="#top">个人中心</a></li>
						</ul>
					</div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</header>
	<!--end header -->
	<!-- start banner_x -->
		<div class="banner_x center">
			<a href="./index.html" target="_blank"><div class="logo fl"></div></a>
			<a href=""><div class="ad_top fl"></div></a>
			<div class="nav fl">
				<ul>
					<li><a href="">小米手机</a></li>
					<li><a href="">红米</a></li>
					<li><a href="">平板·笔记本</a></li>
					<li><a href="">电视</a></li>
					<li><a href="">盒子·影音</a></li>
					<li><a href="">路由器</a></li>
					<li><a href="">智能硬件</a></li>
					<li><a href="">服务</a></li>
					<li><a href="">社区</a></li>
				</ul>
			</div>
			<div class="search fr">
				<form action="" method="post">
					<div class="text fl">
						<input type="text" class="shuru"  placeholder="小米6&nbsp;小米MIX现货">
					</div>
					<div class="submit fl">
						<input type="submit" class="sousuo" value="搜索"/>
					</div>
					<div class="clear"></div>
				</form>
				<div class="clear"></div>
			</div>
		</div>
<!-- end banner_x -->
<!-- self_info -->
	<div class="grzxbj">
		<div class="selfinfo center">
		<div class="lfnav fl">
			<div class="ddzx">订单中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="dingdan?loginName=${qiantailogin.loginName}" >我的订单</a></li>
					<li><a href="">意外保</a></li>
					<li><a href="">团购订单</a></li>
					<li><a href="">评价晒单</a></li>
				</ul>
			</div>
			<div class="ddzx">个人中心</div>
			<div class="subddzx">
				<ul>
					<li><a href="self_info.jsp" style="color:#ff6700;font-weight:bold;">我的个人中心</a></li>
					<li><a href="">消息通知</a></li>
					<li><a href="">优惠券</a></li>
					<li><a href="">收货地址</a></li>
				</ul>
			</div>
		</div>
		<form method="post" action="qiantaiupdate">
		<div class="rtcont fr">
			<div class="grzlbt ml40">我的资料</div>
			<input type="hidden" name="id" value="${oneuser.id}">
			<div class="subgrzl ml40"><span>昵称</span><input type="text" value="${oneuser.loginName}" name="loginName"></div>
			<div class="subgrzl ml40"><span>真实姓名</span><input type="text" value="${oneuser.userName}" name="userName"></div>
			<div class="subgrzl ml40"><span>密码</span><input type="text" value="${oneuser.password}" name="password"></div>
			<div class="subgrzl ml40"><span>性别</span><input type="radio" <c:if test="${oneuser.sex==1}">checked </c:if> name="sex" value="1">
												男
											<input type="radio" <c:if test="${oneuser.sex==0}">checked </c:if> name="sex"  value="0">
												女</div>
			<div class="subgrzl ml40"><span>身份证</span><input type="text" value="${oneuser.identityCode}" name="identityCode"></div>
			<div class="subgrzl ml40"><span>email</span><input type="text" value="${oneuser.email}" name="email"></div>
			<div class="subgrzl ml40"><span>手机 </span><input type="text" value="${oneuser.mobile}" name="mobile"></div>
			<div class="subgrzl ml40"><span>用户地址</span><input type="text" value="${oneuser.userAddress}" name="userAddress"></div>
			<input type="submit" value="修改" style="margin-left: 120px;">
		</div>
		</form>
		<div class="clear"></div>
		</div>
	</div>
<!-- self_info -->
		
		<footer class="mt20 center">			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>
	</body>
</html>