package com.lbl.service.UserService;

import java.util.List;

import com.lbl.bean.EasybuyNews;
import com.lbl.bean.EasybuyUser;
import com.lbl.service.Commenservice;
import com.lbl.util.PageUtil;

public interface userservice extends Commenservice<EasybuyUser> {
	 public abstract EasybuyUser loginUser(String loginName, String passward);

	public abstract EasybuyUser findOne(int id);

	public abstract List<EasybuyUser> findAllNewsByPage(PageUtil page);
	
	public abstract List<EasybuyUser> selectUsers();

	public abstract EasybuyUser findOneuser(String loginName);
}
