package com.lbl.servlet.qianduan;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyProduct;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/xiangqing")
public class xiangqingServlet extends HttpServlet {

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
			System.out.println(req.getParameter("loginName"));
			String loginName=req.getParameter("loginName");
			PrintWriter out=resp.getWriter();
			if(loginName!=null&&!"".equals(loginName)){
				int num=Integer.parseInt(req.getParameter("id"));
				EasybuyProduct product=new EasybuyProduct();
				productService service=new productServiceImpl();
				product=service.finOneProduct(num);
				System.out.println(product);
				
				if(product!=null){
					 req.getSession().setAttribute("product", product);
				     req.getRequestDispatcher("xiangqing.jsp").forward(req,resp);
				}
			}else{
				resp.setContentType("text/html;charset=utf-8");
				out.print("<script>alert('你没有登录!');window.location.href='login.jsp'</script>");
			}
		
			
		
	}

}
