<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>小米商城</title>
		<link rel="stylesheet" type="text/css" href="./css/style.css">
	</head>
	<body>
	<!-- start header -->
		<header>
			<div class="top center">
				<div class="left fl">
					<ul>
						<li><a href="" target="_blank">小米商城</a></li>
						<li>|</li>
						<li><a href="">MIUI</a></li>
						<li>|</li>
						<li><a href="">米聊</a></li>
						<li>|</li>
						<li><a href="">游戏</a></li>
						<li>|</li>
						<li><a href="">多看阅读</a></li>
						<li>|</li>
						<li><a href="">云服务</a></li>
						<li>|</li>
						<li><a href="">金融</a></li>
						<li>|</li>
						<li><a href="">小米商城移动版</a></li>
						<li>|</li>
						<li><a href="">问题反馈</a></li>
						<li>|</li>
						<li><a href="houtailogin.jsp">后台管理</a></li>
						<div class="clear"></div>
					</ul>
				</div>
				<div class="right fr">
					<div class="gouwuche fr"><a href="gouwushow?loginName=${qiantailogin.loginName}">购物车</a></div>
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
							<li><a href="gerenzhongxin?loginName=${qiantailogin.loginName}">个人信息</a></li>
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
					<li><a href="./liebiao.html" target="_blank">小米手机</a></li>
					<li><a href="liebiao?id=1">手机 电话卡</a></li>
					<li><a href="liebiao?id=2">笔记本</a></li>
					<li><a href="liebiao?id=3">电视 小米盒子</a></li>
					<li><a href="liebiao?id=4">路由器 智能硬件</a></li>
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

	<!-- start banner_y -->
		<div class="banner_y center">
			<div class="nav">				
				<ul id="fenlei">
					
				
				
				</ul>
				<div class="pop" id="pop">
					<div class="left fl" id="pop1">
					<div>
						
							<div class="xuangou_right fr"><a href="./xiangqing.html" target="_blank">选购</a></div>
						    <div class="clear"></div>
					</div>
					
					</div>
				</div>		
			</div>
		</div>	
					

		<div class="sub_banner center">
			<div class="sidebar fl">
				<div class="fl"><a href=""><img src="./image/hjh_01.gif"></a></div>
				<div class="fl"><a href=""><img src="./image/hjh_02.gif"></a></div>
				<div class="fl"><a href=""><img src="./image/hjh_03.gif"></a></div>
				<div class="fl"><a href=""><img src="./image/hjh_04.gif"></a></div>
				<div class="fl"><a href=""><img src="./image/hjh_05.gif"></a></div>
				<div class="fl"><a href=""><img src="./image/hjh_06.gif"></a></div>
				<div class="clear"></div>
			</div>
			<div class="datu fl"><a href=""><img src="./image/1.jpg" alt=""></a></div>
			<div class="datu fl"><a href=""><img src="./image/xiaomi5.jpg" alt=""></a></div>
			<div class="datu fr"><a href=""><img src="./image/pinghengche.jpg" alt=""></a></div>
			<div class="clear"></div>
		</div>
	<!-- end banner -->

	<!-- start danpin -->
		<div class="danpin center">
			<div class="biaoti center">小米明星单品</div>
			<div class="main center" id="mingxing">
				
				
				<div class="clear"></div>
			</div>
		</div>
		<div class="peijian w">
			<div class="biaoti center">配件</div>
			<div class="main center">
				<div class="content" id="content">
					
					
					
					<div class="clear"></div>
				</div>
				<div class="content">
					<div class="remen fl"><a href=""><img src="./image/peijian6.png"></a>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="./image/peijian7.jpg"></a></div>
						<div class="miaoshu"><a href="">小米指环支架</a></div>
						<div class="jiage">19元</div>
						<div class="pingjia">372人评价</div>
						<div class="anniu">加入购物车</div>
						<div class="piao">
							<a href="">
								<span>发货速度很快！很配小米6！</span>
								<span>来至于mi狼牙的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="./image/peijian8.jpg"></a></div>
						<div class="miaoshu"><a href="">米家随身风扇</a></div>
						<div class="jiage">19.9元</div>
						<div class="pingjia">372人评价</div>
						<div class="anniu">加入购物车</div>
						<div class="piao">
							<a href="">
								<span>发货速度很快！很配小米6！</span>
								<span>来至于mi狼牙的评价</span>
							</a>
						</div>
					</div>
					<div class="remen fl" style="">
						<div class="xinpin"><span style="background:#fff"></span></div>
						<div class="tu"><a href=""><img src="./image/peijian9.jpg"></a></div>
						<div class="miaoshu"><a href="">红米4X 高透软胶保护套</a></div>
						<div class="jiage">59元</div>
						<div class="pingjia">775人评价</div>
						<div class="anniu">加入购物车</div>
						<div class="piao">
							<a href="">
								<span>发货速度很快！很配小米6！</span>
								<span>来至于mi狼牙的评价</span>
							</a>
						</div>
					</div>
					<div class="remenlast fr">
						<div class="hongmi"><a href=""><img src="./image/hongmin4.png" alt=""></a></div>
						<div class="liulangengduo"><a href=""><img src="./image/liulangengduo.png" alt=""></a></div>					
					</div>
					<div class="clear" ></div>
				</div>				
			</div>
		</div>
		<footer class="mt20 center">			
			<div class="mt20">小米商城|MIUI|米聊|多看书城|小米路由器|视频电话|小米天猫店|小米淘宝直营店|小米网盟|小米移动|隐私政策|Select Region</div>
			<div>©mi.com 京ICP证110507号 京ICP备10046444号 京公网安备11010802020134号 京网文[2014]0059-0009号</div> 
			<div>违法和不良信息举报电话：185-0130-1238，本网站所列数据，除特殊说明，所有数据均出自我司实验室测试</div>
		</footer>
		
		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>
		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/typeahead-bs2.min.js"></script>
		<script src="assets/js/jquery.dataTables.min.js"></script>
		<script src="assets/js/jquery.dataTables.bootstrap.js"></script>
		<script src="assets/js/ace-elements.min.js"></script>
	<script type="text/javascript">
	$(function(){
		
		$.ajax({
			url:"indexshowproduct?no=1",
			type:"POST",
			dataType:"json",
			scriptCharset:"utf-8",
			error:function(data){
				},
			success:function(data){	
				$(data).each(function(){
				if(this.categoryLevel1==0){
					$("#fenlei").append("<li><a href='liebiao?id="+this.id+"' style='font-size: 12px;color: #b0b0b0' class='yiji' >"+this.productname+"</a></li>"
				);
				
				}
				if(this.productname=="小米Note 3"){
					$("#mingxing").append("<div class='mingxing fl'>"+
						"<div class='sub_mingxing'><a href='liebiao?id=1'><img src='"+this.fileName+"' alt=''></a></div>"+
						"<div class='pinpai'><a href='liebiao?id=1'>"+this.productname+"</a></div>"+
						"<div class='youhui'>"+this.description+"</div>"+
						"<div class='jiage'>"+this.price+"</div>"+
						"<div class='anniu'>查看更多</div>"+
					"</div>");
				}
				if(this.productname=="小米MIX 2"){
					$("#mingxing").append("<div class='mingxing fl'>"+
						"<div class='sub_mingxing'><a href='liebiao?id=1'><img src='"+this.fileName+"' alt=''></a></div>"+
						"<div class='pinpai'><a href='liebiao?id=1'>"+this.productname+"</a></div>"+
						"<div class='youhui'>"+this.description+"</div>"+
						"<div class='jiage'>"+this.price+"</div>"+
						"<div class='anniu'>查看更多</div>"+
					"</div>");
				}
				if(this.productname=="小米6"){
					$("#mingxing").append("<div class='mingxing fl'>"+
						"<div class='sub_mingxing'><a href='liebiao?id=1'><img src='"+this.fileName+"' alt=''></a></div>"+
						"<div class='pinpai'><a href='liebiao?id=1'>"+this.productname+"</a></div>"+
						"<div class='youhui'>"+this.description+"</div>"+
						"<div class='jiage'>"+this.price+"</div>"+
						"<div class='anniu'>查看更多</div>"+
					"</div>");
				}
				if(this.productname=="小米5X"){
					$("#mingxing").append("<div class='mingxing fl'>"+
						"<div class='sub_mingxing'><a href='liebiao?id=1'><img src='"+this.fileName+"' alt=''></a></div>"+
						"<div class='pinpai'><a href='liebiao?id=1'>"+this.productname+"</a></div>"+
						"<div class='youhui'>"+this.description+"</div>"+
						"<div class='jiage'>"+this.price+"</div>"+
						"<div class='anniu'>查看更多</div>"+
					"</div>");
				}
				if(this.productname=="小米Max 2"){
					$("#mingxing").append("<div class='mingxing fl'>"+
						"<div class='sub_mingxing'><a href=''><img src='"+this.fileName+"' alt=''></a></div>"+
						"<div class='pinpai'><a href='liebiao?id=1'>"+this.productname+"</a></div>"+
						"<div class='youhui'>"+this.description+"</div>"+
						"<div class='jiage'>"+this.price+"</div>"+
						"<div class='anniu'>查看更多</div>"+
					"</div>");
				}
				if(this.productname=="全场八折"){
				$("#content").append("<div class='remen fl'><a href=''><img src='./image/peijian1.jpg'></a></div>");
				}
				if(this.categoryLevel1==7){
					$("#content").append("<div class='remen fl'>"+
						"<div class='xinpin'><span>新品</span></div>"+
						"<div class='tu'><a href=''><img src='"+this.fileName+"'></a></div>"+
						"<div class='miaoshu'><a href=''>"+this.productname+"</a></div>"+
						"<div class='jiage'>49元</div>"+
						"<div class='pingjia'>372人评价</div>"+
						"<div class='anniu'>查看更多</div>"+
						"<div class='piao'>"+
							"<a href=''>"+
								"<span>发货速度很快！很配小米6！</span>"+
							"</a>"+
						"</div>"+
					"</div>");
				}
				});
			}
 		});
		
			$("#fenlei").on("mouseover","li",function(){
			 $("#fenlei li a").css("color","#FFFFFF");
		    $(this).css("background-color","#FF6700");
		
			
			
			
		   
			
			});
			$("#fenlei").on("mouseout","li",function(){
		     $(this).css("background-color","#0C0C13");
			});
		
	})
			
	
	</script>
	<script type="text/javascript">
	
	
	</script>
	</body>
	
</html>