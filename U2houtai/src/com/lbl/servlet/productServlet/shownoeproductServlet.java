package com.lbl.servlet.productServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lbl.bean.EasybuyProduct;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/shownoe")
public class shownoeproductServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			System.out.println("shownoeproductServlet");
			resp.setContentType("text/html;charset=UTF-8");
			int num=Integer.parseInt(req.getParameter("categoryLevel1"));
			productService product=new productServiceImpl();
			List<EasybuyProduct> list=product.finOne(num);
			if(list!=null){
				Gson gson=new Gson();
				String json=gson.toJson(list);
				System.out.println(json);
				PrintWriter writer=resp.getWriter();
				writer.print(json);
				writer.close();
			}
			
			
			
	}

}
