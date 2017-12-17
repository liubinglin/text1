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
@WebServlet("/qiantaiupdate")
public class qiantaiupdateservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("qiantaiupdateservlet");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		EasybuyUser user = new EasybuyUser();
		user.setId(Integer.parseInt(req.getParameter("id")));
		user.setLoginName(req.getParameter("loginName"));
		user.setUserName(req.getParameter("userName"));
		user.setPassword(req.getParameter("password"));
		user.setSex(Integer.parseInt(req.getParameter("sex")));
		user.setIdentityCode(req.getParameter("identityCode"));
		user.setEmail(req.getParameter("email"));
		user.setMobile(req.getParameter("mobile"));
		user.setUserAddress(req.getParameter("userAddress"));
		userservice service=new userserviceimpl();
		int num=service.update(user);
		if(num>0){
			req.getRequestDispatcher("/gerenzhongxin").forward(req, resp);
		}
		
		
	}

}
