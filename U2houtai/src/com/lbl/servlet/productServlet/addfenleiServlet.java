package com.lbl.servlet.productServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.Easubuy_Product_Category;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/addfenlei")
public class addfenleiServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			System.out.println("addfenleiServlet");
			String name=req.getParameter("name");
			System.out.println(name);
			Easubuy_Product_Category Category=new Easubuy_Product_Category();
			Category.setName(name);
			Category.setParentld(0);
			Category.setType(1);
			productService service=new productServiceImpl();
			service.addfenlei(Category);
			 req.getRequestDispatcher("product.jsp").forward(req,resp);
		
		
	}

}
