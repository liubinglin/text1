package com.lbl.servlet.qianduan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.lbl.bean.Easubuy_Product_Category;
import com.lbl.bean.EasybuyProduct;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/indexshowproduct")
public class indexservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("indexshowproduct");
		int num=Integer.parseInt(req.getParameter("no"));
		switch (num) {
		case 1:
			resp.setContentType("text/html;charset=UTF-8");
			req.setCharacterEncoding("utf-8");
			productService product=new productServiceImpl();
			List<EasybuyProduct> list=product.selectProductAll();
			if(list!=null){
				Gson gson=new Gson();
				String json=gson.toJson(list);
				System.out.println(json);
				PrintWriter writer=resp.getWriter();
				writer.print(json);
				writer.close();
			}
			break;
		case 2:
			resp.setContentType("text/html;charset=UTF-8");
			req.setCharacterEncoding("utf-8");
			String id= req.getParameter("num");
			System.out.println(id);
			productService products=new productServiceImpl();
			List<Easubuy_Product_Category> liste=products.finfenlei(id);
			if(liste!=null){
				Gson gson=new Gson();
				String json=gson.toJson(liste);
				System.out.println(json);
				PrintWriter writer=resp.getWriter();
				writer.print(json);
				writer.close();
			}
			break;
		}
		
	}

}
