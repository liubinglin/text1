package com.lbl.servlet.UserServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyUser;
import com.lbl.service.UserService.impl.userserviceimpl;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		 EasybuyUser user = new EasybuyUser();
		    userserviceimpl users = new userserviceimpl();
		    String name = req.getParameter("loginName");
		    req.setCharacterEncoding("utf-8");
		    user.setLoginName(req.getParameter("loginName"));
		    user.setUserName(req.getParameter("userName"));
		    user.setPassword(req.getParameter("password"));
		    int sex = Integer.parseInt(req.getParameter("sex"));
		    user.setSex(sex);
		    user.setIdentityCode(req.getParameter("indentityCode"));
		    user.setEmail(req.getParameter("email"));
		    user.setMobile(req.getParameter("mobile"));
		    int type = Integer.parseInt(req.getParameter("type"));
		    user.setType(type);
		    int num = users.add(user);
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
