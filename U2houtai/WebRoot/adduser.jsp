<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>新闻</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
		<link rel="stylesheet" href="assets/css/jquery-ui-1.10.3.custom.min.css" />
		<link rel="stylesheet" href="assets/css/chosen.css" />
		<link rel="stylesheet" href="assets/css/datepicker.css" />
		<link rel="stylesheet" href="assets/css/bootstrap-timepicker.css" />
		<link rel="stylesheet" href="assets/css/daterangepicker.css" />
		<link rel="stylesheet" href="assets/css/colorpicker.css" />
		<link rel="stylesheet" href="http://www.htmlsucai.com" />
		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
		<script src="assets/js/ace-extra.min.js"></script>
	</head>

	<body>
		<div class="navbar navbar-default" id="navbar">
			<script type="text/javascript">
				try{ace.settings.check('navbar' , 'fixed')}catch(e){}
			</script>

			<div class="navbar-container" id="navbar-container">
				<div class="navbar-header pull-left">
					<a href="#" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							Ace Admin
						</small>
					</a><!-- /.brand -->
				</div><!-- /.navbar-header -->

				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="assets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>Welcome,</small>
									${login.loginName}
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="icon-cog"></i>
										Settings
									</a>
								</li>

								<li>
									<a href="#">
										<i class="icon-user"></i>
										Profile
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="#">
										<i class="icon-off"></i>
										Logout
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div><!-- /.navbar-header -->
			</div><!-- /.container -->
		</div>

		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="#">
					<span class="menu-text"></span>
				</a>

				<div class="sidebar" id="sidebar">
					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
					</script>

					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>

							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>

							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>

							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>
							<span class="btn btn-info"></span>
							<span class="btn btn-warning"></span>
							<span class="btn btn-danger"></span>
						</div>
					</div><!-- #sidebar-shortcuts -->
					<ul class="nav nav-list">
							<li class="active">
								<a href="index.jsp"> 
									<i class="icon-dashboard"></i> 
									<span class="menu-text"> 控制台 </span>
								</a>
			     			</li>				
							<li >
								<a href="news.jsp" class="dropdown-toggle">
									<i class="icon-list"></i>
									<span class="menu-text"> 新闻  </span>
									<b class="arrow icon-angle-down"></b>
								</a>
							<ul class="submenu">
								<li>
									<a href="news.jsp">
										<i class="icon-double-angle-right"></i>
										新闻列表
									</a>
								</li>
								<li>
									<a href="updatenews.jsp">
										<i class="icon-double-angle-right"></i>
										新闻信息 
									</a>
								</li>
								<li >
									<a href="addnews.jsp">
										<i class="icon-double-angle-right"></i>
										添加新闻
									</a>
								</li>
							</ul>
						</li>
						<li class="active open">
							<a href="news.jsp" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text">用户</span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li>
									<a href="user.jsp">
										<i class="icon-double-angle-right"></i>
										用户列表
									</a>
								</li>
								<li>
									<a href="form-elements.jsp">
										<i class="icon-double-angle-right"></i>
										用户信息
									</a>
								</li>
								<li class="active">
									<a href="adduser.jsp">
										<i class="icon-double-angle-right"></i>
										添加用户
									</a>
								</li>
							</ul>
						</li>
						</li>
						</li>
							<li><a href="order.jsp" class="dropdown-toggle"> <i
							class="icon-list"></i> <span class="menu-text">账单</span> <b
							class="arrow icon-angle-down"></b> </a>

						<ul class="submenu">
							<li><a href="order.jsp"> 
							<i class="icon-double-angle-right"></i>账单列表</a></li>
						</ul>
						</li>

						<li>
							<a href="#" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 商品 </span>

								<b class="arrow icon-angle-down"></b>
							</a>
								<ul class="submenu">
								<li class="active">
									<a href="#" class="active">
										<i class="icon-double-angle-right"></i>
										商品列表
									</a>
								</li>
								<li>
									<a href="#" class="dropdown-toggle">
										<i class="icon-double-angle-right"></i>

										三级菜单
										<b class="arrow icon-angle-down"></b>
									</a>

									<ul class="submenu">
										<li>
											<a href="#">
												<i class="icon-leaf"></i>
												第一级
											</a>
										</li>

										<li>
											<a href="#" class="dropdown-toggle">
												<i class="icon-pencil"></i>

												第四级
												<b class="arrow icon-angle-down"></b>
											</a>

											<ul class="submenu">
												<li>
													<a href="#">
														<i class="icon-plus"></i>
														添加产品
													</a>
												</li>

												<li>
													<a href="#">
														<i class="icon-eye-open"></i>
														查看商品
													</a>
												</li>
											</ul>
										</li>
									</ul>
								</li>
							</ul>
							
						</li>
					</ul><!-- /.nav-list -->

					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>

					<script type="text/javascript">
						try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
					</script>
				</div>

				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="index.jsp">首页</a>
							</li>

							<li>
								<a href="news.jsp">新闻</a>
							</li>
							<li class="addnews.jsp">新闻详情</li>
						</ul><!-- .breadcrumb -->

						<div class="nav-search" id="nav-search">
							<form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
									<i class="icon-search nav-search-icon"></i>
								</span>
							</form>
						</div><!-- #nav-search -->
					</div>

					<div class="page-content">
						<div class="page-header">
							<h1>
								用户
								<small>
									<i class="icon-double-angle-right"></i>
									添加用户
								</small>
							</h1>
						</div><!-- /.page-header -->
				<form class="form-horizontal"  action="adduser" method="post">
						<div class="row">
							<div class="col-xs-12">
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> 用户名		 </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-2"class="col-xs-10 col-sm-5" name="loginName"/>				
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> 用户真实姓名 </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-2"class="col-xs-10 col-sm-5" name="userName"/>				
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> 密码 </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-2"class="col-xs-10 col-sm-5" name="passWord"/>				
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> 性别 </label>
										<div class="col-sm-9" style="margin-top: 6px;">
											<input type="radio"  name="sex" value="0" />女
											<input type="radio"  name="sex" value="1" />男	
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> 身份证 </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-2"class="col-xs-10 col-sm-5" name="identityCode"/>				
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> email </label>
										<div class="col-sm-9">
											<input type="email" id="form-field-2"class="col-xs-10 col-sm-5" name="email"/>				
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> 手机 </label>
										<div class="col-sm-9">
											<input type="text" id="form-field-2"class="col-xs-10 col-sm-5" name="mobile"/>				
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> 类型 </label>
										<div class="col-sm-9" style="margin-top: 6px;">
											<input type="radio"  name="type" value="0" />普通用户
											<input type="radio"  name="type" value="1" />管理员	
										</div>
									</div>
									<div class="form-group">
										<label class="col-sm-3 control-label no-padding-right" for="form-field-2"> 用户地址</label>
										<div class="col-sm-9">
											<input type="text" id="form-field-2"class="col-xs-10 col-sm-5" name="userAddress"/>				
										</div>
									</div>
									<div class="clearfix form-actions">
										<div class="col-md-offset-3 col-md-9">
											<input class="btn btn-info" type="submit" value="提交">
											</input>
											&nbsp; &nbsp; &nbsp;
											<a class="btn"href="news.jsp">
												返回
											</a>
										</div>
									</div>
								</div>
							  </div>
						</form>
									

		
		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
		<script type="text/javascript">
		 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
		</script>
<![endif]-->

		<script type="text/javascript">
			if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="assets/js/bootstrap.min.js"></script>
		<script src="assets/js/typeahead-bs2.min.js"></script>

		<!-- page specific plugin scripts -->

		<!--[if lte IE 8]>
		  <script src="assets/js/excanvas.min.js"></script>
		<![endif]-->

		<script src="assets/js/jquery-ui-1.10.3.custom.min.js"></script>
		<script src="assets/js/jquery.ui.touch-punch.min.js"></script>
		<script src="assets/js/chosen.jquery.min.js"></script>
		<script src="assets/js/fuelux/fuelux.spinner.min.js"></script>
		<script src="assets/js/date-time/bootstrap-datepicker.min.js"></script>
		<script src="assets/js/date-time/bootstrap-timepicker.min.js"></script>
		<script src="assets/js/date-time/moment.min.js"></script>
		<script src="assets/js/date-time/daterangepicker.min.js"></script>
		<script src="assets/js/bootstrap-colorpicker.min.js"></script>
		<script src="assets/js/jquery.knob.min.js"></script>
		<script src="assets/js/jquery.autosize.min.js"></script>
		<script src="assets/js/jquery.inputlimiter.1.3.1.min.js"></script>
		<script src="assets/js/jquery.maskedinput.min.js"></script>
		<script src="assets/js/bootstrap-tag.min.js"></script>

		<!-- ace scripts -->

		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->

		<script type="text/javascript">
			jQuery(function() {
				function date(){
				 var myDate = new Date();
				//获取当前年
				var year=myDate.getFullYear();
				//获取当前月
				var month=myDate.getMonth()+1;
				//获取当前日
				var date=myDate.getDate(); 
				var h=myDate.getHours();       //获取当前小时数(0-23)
				var m=myDate.getMinutes();     //获取当前分钟数(0-59)
				var s=myDate.getSeconds();  
				
				var now=year+"-"+p(month)+"-"+p(date)+" "+p(h)+':'+p(m)+":"+p(s);
								  }
			});
		</script>
	<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
