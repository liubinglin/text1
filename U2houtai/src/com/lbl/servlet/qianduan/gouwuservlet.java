package com.lbl.servlet.qianduan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lbl.bean.EasybuyOrder;
import com.lbl.bean.easybuy_order_detail;
import com.lbl.service.order.OrderService;
import com.lbl.service.order.impl.OrderServiceImpl;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/gouwu")
public class gouwuservlet extends HttpServlet {

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
		String loginName=req.getParameter("loginName");
		String productname=req.getParameter("productname");
		String price=req.getParameter("price");
		System.out.println(productname);
		EasybuyOrder order=new EasybuyOrder();
		OrderService service=new OrderServiceImpl();
		order.setLoginName(loginName);
		order.setProductname(productname);
		System.out.println(Double.valueOf(price).doubleValue());
		order.setCost(Double.valueOf(price).doubleValue());
		int num=service.add(order);
		PrintWriter out=resp.getWriter();
		if(num>0){
			req.getRequestDispatcher("/gouwushow").forward(req, resp);
		}else {
			resp.setContentType("text/html;charset=utf-8");
			out.print("<script>alert('添加失败!');window.location.href='xiangqing.jsp'</script>");
		}
		
		
	}

}
