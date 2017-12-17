package com.lbl.servlet.UserServlet;

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
import com.lbl.bean.EasybuyNews;
import com.lbl.bean.EasybuyUser;
import com.lbl.service.NewsService.newsservice;
import com.lbl.service.NewsService.impl.newsserviceimpl;
import com.lbl.service.UserService.userservice;
import com.lbl.service.UserService.impl.userserviceimpl;
import com.lbl.util.PageUtil;
@WebServlet("/listServlet")
public class listServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("utf-8");
		userservice user=new userserviceimpl();
		PageUtil page=new PageUtil();	
		page.setTotalCount(user.getCount());//获取总记录数
		String num=req.getParameter("pageIndex");
		System.out.println(num);
		if(""==num||null==num){
			page.setPageIndex(1);
		}else {
			page.setPageIndex(Integer.parseInt(num));
		}
		List<EasybuyUser> list=user.findAllNewsByPage(page);
		if(list!=null){
			list.get(0).setUtil(page);
			Gson gson=new Gson();
			String json=gson.toJson(list);
			PrintWriter writer = resp.getWriter();
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
