package com.lbl.servlet.OrderServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.service.order.OrderService;
import com.lbl.service.order.impl.OrderServiceImpl;
@WebServlet("/deleteOrder")
public class deleteOrderServlet extends HttpServlet {

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
			System.out.println("deleteOrderServlet");
			int id=Integer.parseInt(req.getParameter("id"));
			OrderService order=new OrderServiceImpl();
			boolean fig=order.delete(id);
			if(fig){
				req.getRequestDispatcher("/gouwushow").forward(req, resp);
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
