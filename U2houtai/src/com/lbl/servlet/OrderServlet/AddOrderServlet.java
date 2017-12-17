package com.lbl.servlet.OrderServlet;

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
@WebServlet("/AddOrder")
public class AddOrderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		EasybuyOrder order=new EasybuyOrder();
		OrderService service=new OrderServiceImpl();
		System.out.println(req.getParameter("loginName"));
		order.setUseId(service.finuid(req.getParameter("loginName")));
		System.out.println(order.getUseId());
		order.setLoginName(req.getParameter("loginName"));
		order.setUserAddress(req.getParameter("userAddress"));
		order.setCost(Double.parseDouble(req.getParameter("cost")));
		order.setStatus(Integer.parseInt(req.getParameter("status")));
		order.setType(Integer.parseInt(req.getParameter("type")));
		order.setSeraINumber(req.getParameter("seraINumber"));
		int num=service.add(order);
		if(num>0){
			req.getRequestDispatcher("order.jsp").forward(req, resp);
		}
	}

}
