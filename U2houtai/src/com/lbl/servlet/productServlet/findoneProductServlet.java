package com.lbl.servlet.productServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyOrder;
import com.lbl.bean.EasybuyProduct;
import com.lbl.service.order.OrderService;
import com.lbl.service.order.impl.OrderServiceImpl;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/findOneproduct")
public class findoneProductServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("findoneProductServlet");
		productService Service=new productServiceImpl();
		int id = Integer.parseInt(req.getParameter("id"));
		// 调用service的代码
				 EasybuyProduct  Product= Service.finOneProduct(id);
				 req.setAttribute("updateproduct", Product);
				 req.getRequestDispatcher("/updateproduct.jsp").forward(req, resp);
	}

}
