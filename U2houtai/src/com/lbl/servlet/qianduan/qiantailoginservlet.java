package com.lbl.servlet.qianduan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyUser;
import com.lbl.service.UserService.userservice;
import com.lbl.service.UserService.impl.userserviceimpl;
@WebServlet("/qiantailogin")
public class qiantailoginservlet extends HttpServlet {

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
		 System.out.println("loging");
		  userservice user = new userserviceimpl();
		    String loginName = req.getParameter("loginName");
		    String passWord = req.getParameter("passWord");
		    System.out.println(loginName);
		    System.out.println(passWord);
		    EasybuyUser users = user.loginUser(loginName, passWord);
		    PrintWriter out = resp.getWriter();
		    if (users != null && !"".equals(loginName))
		    {
		      req.getSession().setAttribute("qiantailogin", users);
		      req.getRequestDispatcher("qiantaiindex.jsp").forward(req,resp);
		    }
		    else
		    {
		    	resp.setContentType("text/html;charset=utf-8");
				out.print("<script>alert('登录失败!');window.location.href='login.jsp'</script>");
		    }
		
	}

}
