package com.lbl.servlet.productServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lbl.bean.Easubuy_Product_Category;
import com.lbl.bean.EasybuyOrder;
import com.lbl.bean.EasybuyProduct;
import com.lbl.service.order.OrderService;
import com.lbl.service.order.impl.OrderServiceImpl;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/showproduct")
public class productServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("utf-8");
		productService product=new productServiceImpl();
		List<Easubuy_Product_Category> list=product.selectProduct();
		if(list!=null){
			Gson gson=new Gson();
			String json=gson.toJson(list);
			System.out.println(json);
			PrintWriter writer=resp.getWriter();
			writer.print(json);
			writer.close();
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
