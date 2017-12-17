package com.lbl.dao.newsdao;

import java.util.List;

import com.lbl.bean.EasybuyNews;
import com.lbl.dao.CommonDao;
import com.lbl.util.PageUtil;

public interface Newsdao extends CommonDao<EasybuyNews>{
	 public int getCount();
	 public List<EasybuyNews> findAllNewsByPage(PageUtil util);
	 public EasybuyNews findOne(int id);
}
