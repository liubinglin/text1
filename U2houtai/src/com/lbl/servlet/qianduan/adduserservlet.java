package com.lbl.servlet.qianduan;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyUser;
import com.lbl.service.UserService.userservice;
import com.lbl.service.UserService.impl.userserviceimpl;
@WebServlet("/qiantaiadduser")
public class adduserservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");	
		EasybuyUser user = new EasybuyUser();
		user.setLoginName(req.getParameter("loginName"));
		user.setUserName(req.getParameter("userName"));
		user.setPassword(req.getParameter("passWord"));
		user.setSex(Integer.parseInt(req.getParameter("sex")));
		user.setIdentityCode(req.getParameter("identityCode"));
		user.setEmail(req.getParameter("email"));
		user.setMobile(req.getParameter("mobile"));
		user.setType(Integer.parseInt(req.getParameter("type")));
		user.setMobile(req.getParameter("userAddress"));
		userservice userservice=new userserviceimpl();
		int num=userservice.add(user);
		if(num>0){
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}else{
			System.out.println("失败");
		}
		
	}

}
