package com.lbl.dao.newsdao.impl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lbl.bean.EasybuyNews;
import com.lbl.bean.EasybuyUser;
import com.lbl.dao.newsdao.Newsdao;
import com.lbl.util.BaseDao;
import com.lbl.util.PageUtil;
import com.lbl.util.ResultSetUtil;

public class NewsDaoimpl  extends BaseDao implements Newsdao{

	@Override
	public int add(EasybuyNews t) {
		String sql = "INSERT INTO  `easybuy_news`(`title`，`content`，`createTime`) VALUES(?,?,?)";
		Object[] params = { t.getTitle(), t.getContent(), t.getCreateTime()
				 };
		int num = executeUpdate(sql, params);
		return num;
	}

	@Override
	public int delete(Serializable id) {
		String sql = "delete from easybuy_news where id=? ";
		Object[] params = { id };
		return executeUpdate(sql, params);
	}

	@Override
	public int update(EasybuyNews news) {
		String sql = "UPDATE  `easybuy_news`  SET  `title`=?,`content`=?,`createTime`=?WHERE id=? ";
		Object[] params = { news.getTitle(),news.getContent(),news.getCreateTime(),news.getId()};
		return executeUpdate(sql, params);
	}

	@Override
	public List<EasybuyNews> findAll(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EasybuyNews> findAllNewsByPage(PageUtil util) {
		String sql="select * from easybuy_news limit ?,?";
		Object []params={(util.getPageIndex()-1)*util.getPageSize(),util.getPageSize()};
		rs = executeQuery(sql, params);
		return ResultSetUtil.eachResultSet(rs, EasybuyNews.class);
	}

	@Override
	public int getCount() {
		String sql="SELECT COUNT(1) FROM `easybuy_news`";
		rs=executeQuery(sql);
		int num=0;
		try {
			if(rs.next()){
				num=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(num);
		return num;
	}

	@Override
	public EasybuyNews findOne(int id) {
		EasybuyNews news=new EasybuyNews();
		String sql = "select * from  easybuy_news where id=?";	
		  rs = executeQuery(sql,id);
		 return news=ResultSetUtil.findOne(rs, EasybuyNews.class);
	}


	
}
