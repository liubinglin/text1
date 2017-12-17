package com.lbl.servlet.qianduan;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyProduct;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/liebiao")
public class leibiaoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("leibiaoServlet");
		int id=Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		productService service=new productServiceImpl();
		List<EasybuyProduct>list=service.finleibiao(id);
		System.out.println(list);
		if(list!=null){
			 req.getSession().setAttribute("leibiaolist", list);
		     req.getRequestDispatcher("liebiao.jsp").forward(req,resp);
		}
	}

}
