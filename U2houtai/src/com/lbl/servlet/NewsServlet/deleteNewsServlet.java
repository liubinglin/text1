package com.lbl.servlet.NewsServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.service.NewsService.newsservice;
import com.lbl.service.NewsService.impl.newsserviceimpl;
@WebServlet("/deleteNewsServlet")
public class deleteNewsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String id= req.getParameter("id");
		System.out.println(id);
		newsservice newsservice=new newsserviceimpl();
		boolean fig=newsservice.delete(Integer.parseInt(id));
		if(fig){
			  req.getRequestDispatcher("/news.jsp").forward(req, resp);
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
