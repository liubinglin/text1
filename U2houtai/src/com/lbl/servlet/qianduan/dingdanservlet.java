package com.lbl.servlet.qianduan;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyOrder;
import com.lbl.service.order.OrderService;
import com.lbl.service.order.impl.OrderServiceImpl;
@WebServlet("/dingdan")
public class dingdanservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("dingdanservlet");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String loginName=req.getParameter("loginName");
		OrderService order=new OrderServiceImpl();
		List<EasybuyOrder> list=order.finduserproduct(loginName);
		req.getSession().setAttribute("dingdan", list);
		req.getRequestDispatcher("dingdanzhongxin.jsp").forward(req, resp);
		
		
	}

}
