package com.lbl.servlet.NewsServlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyNews;
import com.lbl.service.NewsService.newsservice;
import com.lbl.service.NewsService.impl.newsserviceimpl;
@WebServlet("/showNewsServlet")
public class showNewsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("showNewsServlet");
		String id=req.getParameter("id");
		newsservice newsservice=new newsserviceimpl();
		EasybuyNews news= newsservice.findOne(Integer.parseInt(id));
		 req.setAttribute("updateNews", news);
		req.getRequestDispatcher("/updatenews.jsp").forward(req, resp);
		
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
