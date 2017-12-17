package com.lbl.service.NewsService;

import java.util.List;

import com.lbl.bean.EasybuyNews;
import com.lbl.service.Commenservice;
import com.lbl.util.PageUtil;

public interface newsservice extends Commenservice<EasybuyNews> {

	int getCount();
	List<EasybuyNews> findAllNewsByPage(PageUtil page);
	EasybuyNews findOne(int id);

}
