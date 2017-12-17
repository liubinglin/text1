package com.lbl.dao.userdao.Impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lbl.bean.EasybuyNews;
import com.lbl.bean.EasybuyUser;
import com.lbl.dao.userdao.UserDao;
import com.lbl.util.BaseDao;
import com.lbl.util.PageUtil;
import com.lbl.util.ResultSetUtil;
import com.mysql.fabric.xmlrpc.base.Array;

public class UserDaoImpl extends BaseDao implements UserDao {
	

	@Override
	public int update(EasybuyUser user) {
		String sql = "UPDATE  easybuy_user  SET  loginName=?,userName=?,`passWord`=?,`sex`=?,`identityCode`=?,email=?,mobile=?,`userAddress`=? WHERE id=? ";
		Object[] params = { user.getLoginName(),user.getUserName(),user.getPassword(),user.getSex(),user.getIdentityCode(),user.getEmail(),user.getMobile(),user.getUserAddress(),user.getId() };
		return executeUpdate(sql, params);
		
	}

	@Override
	public EasybuyUser loginUser(String loginName, String password)
			throws SQLException {
		 EasybuyUser user = new EasybuyUser();
		 String sql = "SELECT * FROM easybuy_user where loginName=? and password=?";
	     Object[] params = { loginName, password };
	     rs = executeQuery(sql, params);
	     user=ResultSetUtil.findOne(rs, EasybuyUser.class);
		 return user;
	}

	@Override
	public List<EasybuyUser> findAll(Object ... objects) {
		List<EasybuyUser> list=new ArrayList<EasybuyUser>();
		 String sql ="SELECT * FROM easybuy_user";
		  rs = executeQuery(sql);
		  list=ResultSetUtil.eachResultSet(rs, EasybuyUser.class);
		return list;
	}

	
	@Override
	public int add(EasybuyUser user) {
		String sql = "INSERT INTO  `easybuy_user`(`loginName`,`userName`,`passWord`,`sex`,`identityCode`,`email`,`mobile`,`type`,`userAddress`) VALUES(?,?,?,?,?,?,?,?,?)";
		Object[] params = { user.getLoginName(),user.getUserName(),user.getPassword(),user.getSex(),user.getIdentityCode(),user.getEmail(),user.getMobile(),user.getType(),user.getUserAddress()
				 };
		int num = executeUpdate(sql, params);
		return num;
	}

	@Override
	public int delete(Serializable id) {
		String sql = "delete from easybuy_user where id=? ";
		Object[] params = { id };
		return executeUpdate(sql, params);
	}


	@Override
	public EasybuyUser findOne(Object... id) {
		 EasybuyUser user = new EasybuyUser();
		 String sql = "select * from  easybuy_user where id=?";	
		  rs = executeQuery(sql,id);
		  user=ResultSetUtil.findOne(rs, EasybuyUser.class);
		return user;
			
	}

	@Override
	public int getCount() {
		String sql="SELECT COUNT(1) FROM `easybuy_user`";
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
	public List<EasybuyUser> findAllNewsByPage(PageUtil util) {
		String sql="select * from easybuy_user limit ?,?";
		Object []params={(util.getPageIndex()-1)*util.getPageSize(),util.getPageSize()};
		rs = executeQuery(sql, params);
		return ResultSetUtil.eachResultSet(rs, EasybuyUser.class);
	}

	@Override
	public EasybuyUser findOneuser(String loginName) {
		 EasybuyUser user = new EasybuyUser();
		 String sql = "select * from  easybuy_user where loginName=?";	
		  rs = executeQuery(sql,loginName);
		  user=ResultSetUtil.findOne(rs, EasybuyUser.class);
		return user;
	}

	

}
