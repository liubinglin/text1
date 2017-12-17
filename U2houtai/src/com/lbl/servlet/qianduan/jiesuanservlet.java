package com.lbl.servlet.qianduan;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyOrder;
import com.lbl.service.UserService.userservice;
import com.lbl.service.UserService.impl.userserviceimpl;
import com.lbl.service.order.OrderService;
import com.lbl.service.order.impl.OrderServiceImpl;
@WebServlet("/jiesuan")
public class jiesuanservlet extends HttpServlet {

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
		EasybuyOrder order=new EasybuyOrder();
		String loginName=req.getParameter("loginName");
		int num=Integer.parseInt(req.getParameter("id"));
		OrderService service=new OrderServiceImpl();
		order=service.findOne(num);
		order.setStatus(1);
		if(order.getUserAddress()!=null&&!"".equals(order.getUserAddress())){
			service.update(order);
		} 
	}

}
