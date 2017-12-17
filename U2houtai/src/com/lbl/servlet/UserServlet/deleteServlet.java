package com.lbl.servlet.UserServlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.service.UserService.userservice;
import com.lbl.service.UserService.impl.userserviceimpl;

@WebServlet("/deleteServlet")
public class deleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String id = req.getParameter("id");
		// 调用service的代码
		userservice service = new userserviceimpl();

		boolean  flag = service.delete(Integer.parseInt(id));
		if (flag) {
			// 删除成功之后
			 List list = service.selectUsers();
			    req.getSession().setAttribute("userlist", list);
			    req.getRequestDispatcher("tables.jsp").forward(req, resp);
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
