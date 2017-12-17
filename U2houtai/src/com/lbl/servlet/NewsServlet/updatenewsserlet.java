package com.lbl.servlet.NewsServlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lbl.bean.EasybuyNews;
import com.lbl.service.NewsService.newsservice;
import com.lbl.service.NewsService.impl.newsserviceimpl;
@WebServlet("/updatenews")
public class updatenewsserlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");	
		String id = req.getParameter("id");
		System.out.println();
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		String createTime=req.getParameter("createTime");
		String tame=createTime.substring(0,createTime.indexOf("."));
		System.out.println(tame);
		System.out.println(createTime);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(tame);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EasybuyNews news=new EasybuyNews();
		news.setId(Integer.parseInt(id));
		news.setContent(content);
		news.setCreateTime(date);
		news.setTitle(title);
		newsservice newsservice=new newsserviceimpl();
		int num=newsservice.update(news);
		if (num>0) {
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
