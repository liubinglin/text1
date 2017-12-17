package com.lbl.servlet.UserServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyUser;
import com.lbl.service.UserService.userservice;
import com.lbl.service.UserService.impl.userserviceimpl;

public class UpdateServlet extends HttpServlet {
	userservice service =new userserviceimpl();
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
		String id = req.getParameter("id");
		String loginName = req.getParameter("loginName");
		String userName = req.getParameter("userName");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		int sex = Integer.parseInt(req.getParameter("sex"));
		EasybuyUser user = new EasybuyUser();
		user.setId(Integer.parseInt(id));
		user.setLoginName(loginName);
		user.setUserName(userName);
		user.setSex(sex);
		user.setEmail(email);
		user.setMobile(mobile);
		update(user, req, resp);
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
	// 修改
		private void update(EasybuyUser user, HttpServletRequest req,
				HttpServletResponse resp) {
			int num = service.update(user);
			if (num>0) {
				try {
					resp.sendRedirect("listServlet");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				try {
					req.getRequestDispatcher("/update.jsp").forward(req, resp);
				} catch (ServletException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	
}
