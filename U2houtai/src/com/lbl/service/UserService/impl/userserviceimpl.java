package com.lbl.service.UserService.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lbl.bean.EasybuyNews;
import com.lbl.bean.EasybuyUser;
import com.lbl.dao.userdao.UserDao;
import com.lbl.dao.userdao.Impl.UserDaoImpl;
import com.lbl.service.UserService.userservice;
import com.lbl.util.PageUtil;

public class userserviceimpl implements userservice {
	 UserDao dao=new UserDaoImpl();

	@Override
	public int add(EasybuyUser user) {
		return dao.add(user);
	}
	@Override
	public EasybuyUser findOne(int id) {
		EasybuyUser user=new EasybuyUser();
		user=dao.findOne(id);	
		if(user != null){
			System.out.println("查询指定的用户信息成功！");
			return user;
		}else{
			System.out.println("没有查询到指定的用户信息！");
			return null;
		}
		
	}

	@Override
	public int update(EasybuyUser user) {
		int mun=dao.update(user);
		return mun;
	}

	@Override
	public List<EasybuyUser> selectUsers() {
		List<EasybuyUser > list=new ArrayList<EasybuyUser>();
		list=dao.findAll(null);
		return list;
	}
	/**
	 * 登录
	 */
	@Override
	public EasybuyUser loginUser(String loginName, String passward) {
		EasybuyUser user=new EasybuyUser();
		try {
			user=dao.loginUser(loginName, passward);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
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
	public List<EasybuyUser> findAllNewsByPage(PageUtil util) {
		return dao.findAllNewsByPage(util);
	}
	@Override
	public EasybuyUser findOneuser(String loginName) {
		// TODO Auto-generated method stub
		return dao.findOneuser(loginName);
	}



	
	
}
