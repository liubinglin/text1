package com.lbl.dao.userdao;

import java.sql.SQLException;
import java.util.List;

import com.lbl.bean.EasybuyNews;
import com.lbl.bean.EasybuyUser;
import com.lbl.dao.CommonDao;
import com.lbl.util.PageUtil;

public interface  UserDao  extends CommonDao<EasybuyUser>  {
	/**
	 * 登录
	 */

	  public abstract EasybuyUser loginUser(String paramString1, String paramString2)
	    throws SQLException;
	  
	  public abstract List<EasybuyUser> findAll(Object... paramVarArgs);

	public abstract EasybuyUser findOne(Object... id);

	public abstract int getCount();

	public abstract List<EasybuyUser> findAllNewsByPage(PageUtil page);

	public abstract EasybuyUser findOneuser(String loginName);

}
