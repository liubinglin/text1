package com.lbl.servlet.UserServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyUser;
import com.lbl.service.UserService.userservice;
import com.lbl.service.UserService.impl.userserviceimpl;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		  userservice user = new userserviceimpl();
		  System.out.println("loging");
		    req.setCharacterEncoding("utf-8");
		    String loginName = req.getParameter("loginName");
		    String passWord = req.getParameter("passWord");
		    System.out.println(loginName);
		    System.out.println(passWord);
		    EasybuyUser users = user.loginUser(loginName, passWord);
		    if (users != null && !"".equals(loginName))
		    {
		      req.getSession().setAttribute("login", users);
		      req.getRequestDispatcher("houtai.jsp").forward(req,resp);
		    }
		    else
		    {
		    	System.out.println("失败");
		      resp.sendRedirect("houtailogin.jsp");
		    }
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

}
