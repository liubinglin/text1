<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>控制台 - Bootstrap后台管理系统模版Ace下载</title>
		<meta name="keywords" content="Bootstrap模版,Bootstrap模版下载,Bootstrap教程,Bootstrap中文" />
		<meta name="description" content="HTML素材网提供Bootstrap模版,Bootstrap教程,Bootstrap中文翻译等相关Bootstrap插件下载" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- basic styles -->
		<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />

		<!--[if IE 7]>
		  <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css" />
		<![endif]-->

		<!-- page specific plugin styles -->

		<!-- fonts -->

		<link rel="stylesheet" href="http://www.htmlsucai.com" />

		<!-- ace styles -->

		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="assets/css/ace-skins.min.css" />

		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->

		<script src="assets/js/ace-extra.min.js"></script>

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
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
							后台管理
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
									${login.loginName }
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
									<a href="login.jsp">
										<i class="icon-off"></i>
										注销
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

					<li>
						<a href="news.jsp" class="dropdown-toggle"> <i
							class="icon-list"></i> <span class="menu-text"> 新闻 </span>

							<b class="arrow icon-angle-down"></b> </a>

						<ul class="submenu">

							<li><a href="news.jsp"> 
							<i class="icon-double-angle-right"></i> 新闻列表 </a></li>
							<li><a href="addnews.jsp"> 
							<i class="icon-double-angle-right"></i> 新闻详情 </a></li>
						</ul>
						</li>
						<li>
							<a href="tables.jsp" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 用户 </span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li >
									<a href="tables.jsp">
									用户列表
									</a>
								</li>
								<li>
									<a href="form-elements.jsp">
										<i class="icon-double-angle-right"></i>
										用户信息
									</a>
								</li>					
							</ul>
						</li>
					</li>
					<li>
							<a href="order.jsp" class="dropdown-toggle"> 
									<i class="icon-list"></i> 
								<span class="menu-text">订单</span> 
								<b class="arrow icon-angle-down"></b> 
							</a>
						<ul class="submenu">
							<li class="active"><a href="order.jsp"> 
							<i class="icon-double-angle-right"></i>订单列表</a>
							</li>
							<li>
								<a href="#">
									<i class="icon-double-angle-right"></i>
									订单信息
								</a>
							</li>
							<li>
								<a href="addorder.jsp">
									<i class="icon-double-angle-right"></i>
									添加订单
								</a>
							</li>
						</ul>
						
					</li>

						<li  class="active open">
							<a href="product.jsp" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 商品 </span>
								<b class="arrow icon-angle-down"></b>
							</a>
								<ul class="submenu">
								<li class="active">
									<a href="product.jsp" class="active">
										<i class="icon-double-angle-right"></i>
										商品列表
									</a>
								</li>
								
								<li>
									<a href="#" class="dropdown-toggle ">
										<i class="icon-double-angle-right"></i>
										添加商品
										<b class="arrow icon-angle-down"></b>
									</a>

									<ul class="submenu">
										<li>
											<a href="#">
												<i class="icon-leaf"></i>
												添加商品分类
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
								<a href="#">Home</a>
							</li>

							<li>
								<a href="#">商品</a>
							</li>
							<li class="active">商品 &amp; 列表</li>
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
								商品
								<small>
									<i class="icon-double-angle-right"></i>
									商品 &amp; 列表
								</small>
							</h1>
						</div><!-- /.page-header -->
						
						<div class="row">
						
						
						<select style="margin-left:50px;" id="fenlei" onchange="gradeChange()">
							<option value="0">请选择</option>
						
						
						</select>
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								
								<div class="row">
								
									<div class="col-xs-12">
										<div class="table-responsive">
											<table id="sample-table-1" class="table table-striped table-bordered table-hover">
												<thead>
													<tr>
														<th class="center">
															<label>
																<input type="checkbox" class="ace" />
																<span class="lbl"></span>
															</label>
														</th>
														<th>商品编号</th>
														<th>商品名字</th>
														<th>商品描述</th>
														<th>商品价格(元) </th>
														<th>商品库存 </th>
														<th>
														<button class='btn btn-xs btn-info' >
														  		<i class='icon-edit bigger-120' onclick="zengjia();">商品分类添加</i>
														</button>
														<button class="btn btn-xs btn-danger" >
																<i class="icon-trash bigger-120">删除</i>
														</button>
														
														</th>
													</tr>
												</thead>
												<tbody id="tbody">
												</tbody>
											</table>
										</div><!-- /.table-responsive -->
									</div><!-- /span -->
								</div><!-- /row -->

								<div class="hr hr-18 dotted hr-double"></div>

								

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<!-- 模态框（Modal） -->
		<!-- 增加模态 -->	
		
		<div class="zengjia" >	
			<div class="modal fade" id="zengjia" tabindex="-1" role="dialog" 
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div class="modal-dialog">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			             <h4 class="modal-title" id="myModalLabel">
			            	添加商品分类
			            </h4>
			         </div>
			         <div style="margin-left: 80px">
			           	 商品分类:<input type="text" name="fenleiname" id="addfenlei">
			         </div>
			         <div class="modal-footer">
			            <button type="button" class="btn btn-default" 
			               data-dismiss="modal">取消
			            </button>
			            <button type="button" class="btn btn-primary" onclick="addfenlei();" >
			           		确定
			            </button>	
			         </div>
			      </div><!-- /.modal-content -->
			      <!-- 隐藏y -->
			      <input type="hidden" id="url" name="aaaaa">
					</div>
				</div>	
			</div>
		
		
		<!-- 删除模态 -->	
		<div class="shanchu"  >	
			<div class="modal fade" id="shanchu" tabindex="-1" role="dialog" 
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div class="modal-dialog">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			            	用户名:
			            </h4>
			         </div>
			         <div class="modal-body">
			       	确认删除吗？
			         </div>
			         <div class="modal-footer">
			            <button type="button" class="btn btn-default" 
			               data-dismiss="modal">取消
			            </button>
			            <button type="button" class="btn btn-primary" onClick="delSubmit();">
			           		确定
			            </button>	
			           
			         </div>
			      </div><!-- /.modal-content -->
			      <!-- 隐藏y -->
			      <input type="hidden" id="url" name="aaaaa">
					</div>
				</div>	
			</div>
			
		<script type="text/javascript" src="assets/js/jquery-2.0.3.min.js"></script>
		<script type="text/javascript" src="assets/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="assets/js/typeahead-bs2.min.js"></script>
		<script type="text/javascript" src="assets/js/jquery.dataTables.min.js"></script>
		<script type="text/javascript" src="assets/js/jquery.dataTables.bootstrap.js"></script>
		<script type="text/javascript" src="assets/js/ace-elements.min.js"></script>
		<script type="text/javascript" src="assets/js/ace.min.js"></script>
		<script type="text/javascript">
			$(function(){
				$.ajax({
					url:"showproduct",
					type:"POST",
					dataType:"json",
					scriptCharset:"utf-8",
					error:function(data){
					},
					success:function(data){
					$(data).each(function(){
							$("#fenlei").append(
							"<option value="+this.id+">"+this.name+"</option>"
							);
							$("#tbody").append("<tr>"+
										"<td class='center'>"+
													"<label>"+
														"<input type='checkbox' class='ace' />"+
															"<span class='lbl'></span>"+
													"</label>"+
														"</td>"+
														"<td>"+this.id+"</td>"+
														"<td >"+this.name+"</td>"+
														"<td></td>"+
														"<td></td>"+
														"<td></td>"+
														"<td>"+
															"<div class='visible-md visible-lg hidden-sm hidden-xs btn-group'>"+
																"<button class='btn btn-xs btn-danger' onclick=shanchu('deleteproduct?id="+this.id+"');>"+
																"<i class='icon-trash bigger-120'>删除</i>"+
																"</button>"+
															"</div>"+
														"</td>"+
													"</tr>");
				
						});
					}
				});
			});
		function gradeChange(){
		var num=$("#fenlei").val();
			$("#tbody").empty();
			$.ajax({
			url:"shownoe?",
			dataType:"json",
			data:{"categoryLevel1":num},
			contentType:"application/x-www-form-urlencoded;charset=utf-8",
			error:function(){
			},
			success:function(data){
				$(data).each(function(){
					$("#tbody").append("<tr>"+
										"<td class='center'>"+
													"<label>"+
														"<input type='checkbox' class='ace' />"+
															"<span class='lbl'></span>"+
													"</label>"+
														"</td>"+
														"<td>"+this.id+"</td>"+
														"<td >"+this.productname+"</td>"+
														"<td style='width: 400px'>"+this.description+"</td>"+
														"<td>"+this.price+"</td>"+
														"<td>"+this.stock+"</td>"+
														"<td>"+
															"<div class='visible-md visible-lg hidden-sm hidden-xs btn-group'>"+
																"<button class='btn btn-xs btn-success' onclick=chakan('findOneproduct?id="+this.id+"');>"+
														 			"<input type='hidden' id='chakan' >"+
																"<i class='icon-ok bigger-120' >查看</i>"+
																"</button>"+
																"<button class='btn btn-xs btn-info' onclick=chakan('findOneproduct?id="+this.id+"');>"+
														  		"<i class='icon-edit bigger-120'>编辑</i>"+
																"</button>"+
																"<button class='btn btn-xs btn-danger' onclick=shanchu('deleteproduct?id="+this.id+"');>"+
																"<i class='icon-trash bigger-120'>删除</i>"+
																"</button>"+
															"</div>"+
														"</td>"+
													"</tr>");
				
				
				})
			}
			});
		}
		</script>
		<script type="text/javascript"> 
				
				function shanchu(delUrl){
			    	 $("#shanchu").modal("show");
			      $("#url").val(delUrl);	
			      		   
			 	  };
			 	  function zengjia(){
			 	  	$("#zengjia").modal("show");
			 	  }
			 	  function chakan(data){
			 	   $("#chakan").val(data);
			     	window.location.href= $("#chakan").val();
			     	
			 	  }
			 	  
			        function delSubmit(){
		   				window.location.href= $("#url").val();//deleteServlet?id=${user.id}
		  		 };
	  			function addfenlei(){
	  				 var fenlei=$("#addfenlei").val();
	  				 window.location.href= "addfenlei?name="+fenlei;
	  			}
		</script>
	
	<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>

