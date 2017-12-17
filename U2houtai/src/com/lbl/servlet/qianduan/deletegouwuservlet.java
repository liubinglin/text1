package com.lbl.servlet.qianduan;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.service.order.OrderService;
import com.lbl.service.order.impl.OrderServiceImpl;
@WebServlet("/deletegouwu")
public class deletegouwuservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("deletegouwuservlet");
		String loginName=req.getParameter("loginName");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		int id=Integer.parseInt(req.getParameter("id"));
		OrderService order=new OrderServiceImpl();
		boolean fig=order.delete(id);
		if(fig){
			req.getRequestDispatcher("/gouwushow?loginName="+loginName).forward(req, resp);
		}
	}

}
