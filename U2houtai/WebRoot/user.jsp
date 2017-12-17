<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
		<link rel="stylesheet" href="assets/css/font-awesome.min.css" />
		<link rel="stylesheet" href="assets/css/ace.min.css" />
		<link rel="stylesheet" href="assets/css/ace-rtl.min.css" />
		<link rel="stylesheet" href="assets/css/ace-skins.min.css" />
		<script src="assets/js/ace-extra.min.js"></script>
		<script src="assets/js/html5shiv.js"></script>
		<script src="assets/js/respond.min.js"></script>
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
						
						<li class="active open">
							<a href="user.jsp" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 用户 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li class="active">
									<a href="user.jsp">
										<i class="icon-double-angle-right"></i>
									用户列表
									</a>
								</li>
								
								<li>
									<a href="user.jsp">
										<i class="icon-double-angle-right"></i>
										用户信息
									</a>
								</li>	
								
								<li>
									<a href="adduser.jsp">
										<i class="icon-double-angle-right"></i>
										添加用户
									</a>
								</li>					
							</ul>
						</li>
					</li>
							<li><a href="order.jsp" class="dropdown-toggle"> <i
							class="icon-list"></i> <span class="menu-text">账单</span> <b
							class="arrow icon-angle-down"></b> </a>

						<ul class="submenu">
							<li><a href="order.jsp"> <i
									class="icon-double-angle-right"></i>账单列表</a></li>
							
						
						</ul></li>

						<li>
							<a href="tables.jsp" class="dropdown-toggle">
								<i class="icon-list"></i>
								<span class="menu-text"> 商品 </span>

								<b class="arrow icon-angle-down"></b>
							</a>
								<ul class="submenu">
								<li class="active">
									<a href="buttons.jsp" class="active">
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
								<a href="#">Home</a>
							</li>

							<li>
								<a href="#">用户</a>
							</li>
							<li class="active">用户 &amp; 列表</li>
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
									用户 &amp; 列表
								</small>
							</h1>
						</div><!-- /.page-header -->

						<div class="row">
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
														<th>ID</th>
														<th>用户名</th>
														<th class="hidden-480">用户真实姓名</th>

														<th>
															性别
														</th>
														<th class="hidden-480">身份证号</th>
														<th>

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
							
								<div class="row">
									<div class="col-sm-6">
										<div>
											<ul class="pagination">
												<li class="disabled">
													<a href="javascript:" id="back">
														<i class="icon-double-angle-left"></i>
													</a>
												</li>

												
												<li>
													<a href="javascript:" id="next">
														<i class="icon-double-angle-right"></i>
													</a>
												</li>
											</ul>
										</div>
									</div><!-- /span -->
								</div><!-- /row -->

								<hr />
							
								</div>
								<div class="hr hr-18 dotted hr-double"></div>

								

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<!-- 模态框（Modal） -->
		
		<!-- 删除模态 -->	
		<div class="shanchu" >	
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
			
			
		<script src="../"></script>

		<!-- <![endif]-->

		<!--[if IE]>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->

		<!--[if !IE]> -->

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

		<script src="assets/js/jquery.dataTables.min.js"></script>
		<script src="assets/js/jquery.dataTables.bootstrap.js"></script>
		<script src="assets/js/ace-elements.min.js"></script>
		<script src="assets/js/ace.min.js"></script>
		<script type="text/javascript"> 
			$(function(){
				function shanchu(delUrl){
			    	 $("#shanchu").modal("show");
			      $("#url").val(delUrl);	
			      		   
			 	  };
			 	  function shanchu(delUrl){
			    	 $("#shanchu").modal("show");
			      $("#url").val(delUrl);	
			 	  };
				  function delSubmit(){
		   				window.location.href= $("#url").val();//deleteServlet?id=${user.id}
		  			};
			});	
					
		</script>
		<script type="text/javascript">
		$(function(){
		//分页四要素
			var pageIndex="";
			var pageSize="";
			var pageCount="";
			var totalCount="";
			 pageInit(pageIndex);
		//ajax显示新闻
			function pageInit(pageIndex1){
				$("#back").show();
				$("#next").show();
				$("#tbody").empty();
			$.ajax({
				url:"listServlet",
				type:"POST",
				dataType:"json",
				contentType:"application/x-www-form-urlencoded;charset=utf-8",
				data:{"pageIndex":pageIndex1},
				error:function(data){
				 alert("失败！");
				},
				success:function(data){
				$("tboby").empty();
				$(data).each(function(){
					if(this.util!=null){
                       pageIndex=  this.util.pageIndex;
                       pageSize=  this.util.pageSize;
                       pageCount=  this.util.pageCount;
                       totalCount=  this.util.totalCount;
                       }
                       if(this.sex==1) {
						this.sex="男";
					   }else{
					    this.sex="女";
					   }
					$("#tbody").append("<tr>"+
										"<td class='center'>"+
											"<label>"+
												"<input type='checkbox' class='ace' />"+
													"<span class='lbl'></span>"+
											"</label>"+
										"</td>"+
											"<td>"+this.id+"</td>"+
											"<td>"+this.loginName+"</td>"+
											"<td>"+this.userName+"</td>"+
											"<td>"+this.sex+"</td>"+
											"<td>"+this.identityCode+"</td>"+													
											"<td>"+
												"<div class='visible-md visible-lg hidden-sm hidden-xs btn-group'>"+
													"<button class='btn btn-xs btn-success' onclick=chakan('showServlet?id="+this.id+"');>"+
														 "<input type='hidden' id='chakan' >"+
															"<i class='icon-ok bigger-120' >查看</i>"+
													"</button>"+
													"<button class='btn btn-xs btn-info' onclick=chakan('showServlet?id="+this.id+"');>"+
														  "<i class='icon-edit bigger-120'>编辑</i>"+
													"</button>"+
														 "<button class='btn btn-xs btn-danger' onclick=shanchu('deleteServlet?id="+this.id+"');>"+
																	"<i class='icon-trash bigger-120'>删除</i>"+
																"</button>"+
													"</div>"+
											"</td>"+
										"</tr>");
				});
				}
				 
			});
		};
			
		function sex(sex){
		alert(1);
		if(sex==1){
			document.getElementById("sexid").innerHTML="男";
		}else{
			document.getElementById("sexid").innerHTML="女";
			}
		
		}
				
			 	    
	
     $("#back").click(function(){
      if ((pageIndex-1)>0) {
		 pageInit(pageIndex-1);
	  }else{
	     $("#one").hide();
	     $("#back").hide();
	  }
     });
     $("#next").click(function(){
       if ((pageIndex+1)<=pageCount) {
		 pageInit(pageIndex+1);
	  }else{
	     $("#last").hide();
	     $("#next").hide();
	  }
     });
     
     	
     });
		function shanchu(data){
     	 $("#shanchu").modal("show");
     	 $("#url").val(data);
     			
     }
      
		  function delSubmit(){
		  	window.location.href= $("#url").val();//deleteServlet?id=${user.id}
		  		 };
		  function chakan(data){
		  
		  	window.location.href= data;//shownewsServlet?id=${user.id}
		  		 };
		</script>
	<div style="display:none"><script src='http://v7.cnzz.com/stat.php?id=155540&web_id=155540' language='JavaScript' charset='gb2312'></script></div>
</body>
</html>
