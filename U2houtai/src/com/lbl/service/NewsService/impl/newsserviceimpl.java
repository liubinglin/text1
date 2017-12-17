package com.lbl.service.NewsService.impl;

import java.util.List;

import com.lbl.bean.EasybuyNews;
import com.lbl.dao.newsdao.Newsdao;
import com.lbl.dao.newsdao.impl.NewsDaoimpl;
import com.lbl.service.NewsService.newsservice;
import com.lbl.util.PageUtil;

public class newsserviceimpl implements newsservice{
	Newsdao dao=new NewsDaoimpl();
	@Override
	public int add(EasybuyNews news) {
		// TODO Auto-generated method stub
		return dao.add(news);
	}
	@Override
	public int update(EasybuyNews news) {
		return dao.update(news);
	}

	

	@Override
	public boolean  delete(int id) {
		int num = dao.delete(id);
		if (num > 0) {
			return true;
		} else {
			return false;
		}
	}



	@Override
	public int getCount() {
		return dao.getCount();
	}



	@Override
	public List<EasybuyNews> findAllNewsByPage(PageUtil page) {		
		return dao.findAllNewsByPage(page);
	}



	@Override
	public EasybuyNews findOne(int id) {
		EasybuyNews news=new EasybuyNews();
		news=dao.findOne(id);
		return news;
	}

}
