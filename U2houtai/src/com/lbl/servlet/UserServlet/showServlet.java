package com.lbl.servlet.UserServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyUser;
import com.lbl.service.UserService.userservice;
import com.lbl.service.UserService.impl.userserviceimpl;
@WebServlet("/showServlet")
public class showServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("showServlet");
		userservice service = new userserviceimpl();
		int id = Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		// 调用service的代码
		
			
		 EasybuyUser users = service.findOne(id);
		 req.setAttribute("updateUser", users);
		 req.getRequestDispatcher("/form-elements.jsp").forward(req, resp);
			  
		
	}

}
