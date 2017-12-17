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
@WebServlet("/gerenzhongxin")
public class findoneuserservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("findoneuserservlet");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String loginName=req.getParameter("loginName");
		userservice service=new userserviceimpl();
		EasybuyUser user=new EasybuyUser();
		user=service.findOneuser(loginName);
		req.getSession().setAttribute("oneuser", user);
		req.getRequestDispatcher("self_info.jsp").forward(req, resp);
		
		
	}

}
