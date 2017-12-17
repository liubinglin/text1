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
		<title>我的购物车-小米商城</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
<!-- start header -->
	<!--end header -->

<!-- start banner_x -->
		<div class="banner_x center">
			<a href="./index.html" target="_blank"><div class="logo fl"></div></a>
			
			<div class="wdgwc fl ml40">我的购物车</div>
			<div class="wxts fl ml20">温馨提示：产品是否购买成功，以最终下单为准哦，请尽快结算</div>
			<div class="dlzc fr">
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
				</ul>
				<input type="hidden" name="loginName" value="${qiantailogin.loginName}" id="loginName">
			</div>
			<div class="clear"></div>
		</div>
		<div class="xiantiao"></div>
		<div class="gwcxqbj">
			<div class="gwcxd center">
				<div class="top2 center">
					<div class="sub_top fl">
						<input type="checkbox" value="" class="quanxuan" id="allCheckBox" />全选
					</div>
						<input type="hidden" name="loginName" value="${qiantailogin.loginName}">
					<div class="sub_top fl">商品名称</div>
					<div class="sub_top fl">单价</div>
					<div class="sub_top fl">数量</div>
					<div class="sub_top fl">小计</div>
					<div class="sub_top fr">操作</div>
					<div class="clear"></div>
				</div>
				
				<c:forEach var="productlist" items="${product}">
				<div class="content2 center" >
					<div class='sub_content fl'>
						<input name="cartCheckBox" type="checkbox" value="" class="quanxuan"/>
					</div>
					<div class="sub_content fl"><img src="./image/gwc_xiaomi6.jpg"></div>
					<div class="sub_content fl ft20">${productlist.productname}</div>
					<div class="sub_content fl price">${productlist.cost}</div>
					<div class="sub_content fl">
						<div class='shuliang'>
								<img src="image/taobao_minus.jpg" class="minus">
								<input type="text" value="${productlist.count }" name="">
								<img src="image/taobao_adding.jpg" class="add">
						</div>
					</div>
					<div class="sub_content fl price danjia">${productlist.cost}</div>
					<div class="sub_content fl Remove"><a href="deletegouwu?id=${productlist.id}&loginName=${qiantailogin.loginName}">×</a></div>
					<div class="clear"></div>
				</div>
				</c:forEach>
			</div>
		<form method="post" action="jiesuan">
			<div class="jiesuandan mt20 center" id="">
				<div class="tishi fl ml20">
					<ul>
						<li><a href="../liebiao.html">继续购物</a></li>
						<li>|</li>
						<li>共<span></span>件商品，已选择<span></span>件</li>
						<div class="clear"></div>
					</ul>
				</div>
				<input type="hidden" name="id" value="${productlist.id}">
				<input type="hidden" name="loginName" value="${qiantailogin.loginName}">
				<div class="jiesuan fr" >
					<div class="jiesuanjiage fl" >合计（不含运费）：<span id="total_value"></span></div>
					<div class="jsanniu fr"><input class="jsan" type="submit" name="jiesuan"  value="去结算"/></div>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
			
		</div>
		</form>
  

	
	<!-- footer -->
	<footer class="center">
			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>

	
	</body>
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="js/shopping.js"></script>

</html>
