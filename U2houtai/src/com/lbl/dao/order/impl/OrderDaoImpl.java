package com.lbl.dao.order.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.lbl.bean.EasybuyOrder;
import com.lbl.bean.EasybuyProduct;
import com.lbl.bean.EasybuyUser;
import com.lbl.bean.easybuy_order_detail;
import com.lbl.dao.order.OrderDao;
import com.lbl.util.BaseDao;
import com.lbl.util.ResultSetUtil;

public class OrderDaoImpl extends BaseDao implements OrderDao {

	@Override
	public int add(EasybuyOrder order) {
		String sql="INSERT INTO  `easuby_order`(`useId`,`loginName`,`userAddress`,`productname`,`count`,`cost`,`status`,`type`,`seraINumber`) VALUES(?,?,?,?,?,?,?,?,?)";
		Object[]params={order.getUseId(),order.getLoginName(),order.getUserAddress(),order.getProductname(),order.getCount(),order.getCost(),order.getStatus(),order.getType(),order.getSeraINumber()};
		return executeUpdate(sql, params);
	}

	@Override
	public int delete(Serializable id) {
		String sql="DELETE FROM `easuby_order` WHERE id=? ";
		Object[]params={id};
		return executeUpdate(sql, params);
	}

	@Override
	public int update(EasybuyOrder order) {
		String sql="UPDATE  `easuby_order`  SET  `useId`=?,`loginName`=?,`userAddress`=?,`cost`=?,`status`=?,`type`=?,`seraINumber`=? WHERE `id`=?";
		Object[]params={order.getUseId(),order.getLoginName(),order.getUserAddress(),order.getCost(),order.getStatus(),order.getType(),order.getSeraINumber(),order.getId()};
		return executeUpdate(sql, params);
	}

	@Override
	public List<EasybuyOrder> findAll(Object... objects) {
		List<EasybuyOrder> list=new ArrayList<EasybuyOrder>();
		 String sql ="SELECT * FROM easuby_order";
		  rs = executeQuery(sql);
		  list=ResultSetUtil.eachResultSet(rs, EasybuyOrder.class);
		return list;
	}

	@Override
	public List<EasybuyOrder> selectOrder() {
		List<EasybuyOrder> list=new ArrayList<EasybuyOrder>();
		 String sql ="SELECT * FROM easuby_order";
		  rs = executeQuery(sql);
		  list=ResultSetUtil.eachResultSet(rs, EasybuyOrder.class);
		  System.out.println(list);
		return list;
	}

	@Override
	public EasybuyOrder findOne(int id) {
		EasybuyOrder order=new EasybuyOrder();
		String sql="SELECT * FROM`easuby_order` WHERE`id`=?";
		Object[]params={id};
		rs=executeQuery(sql, params);
		order=ResultSetUtil.findOne(rs, EasybuyOrder.class);
		return order;
	}

	public int finuid(String loginName){
		EasybuyUser user=new EasybuyUser();
		String sql="SELECT * FROM`easybuy_user`WHERE`loginName`=?";
		Object[]params={loginName};
		rs=executeQuery(sql, params);
		user=ResultSetUtil.findOne(rs, EasybuyUser.class);
		return user.getId();
	}

	@Override
	public EasybuyProduct findetailid(String productname) {
		EasybuyProduct Product=new EasybuyProduct();
		String sql="SELECT * FROM`easubuy_product`WHERE`productname`=?";
		Object[]params={productname};
		rs=executeQuery(sql, params);
		Product=ResultSetUtil.findOne(rs, EasybuyProduct.class);
		return Product;
	}

	@Override
	public int adddetail(easybuy_order_detail order) {
		String sql="INSERT INTO `easybuy_order_detail`(`orderId`,`productld`,`quantity`,`cost`) VALUES(?,?,?,?)";
		Object[]params={order.getOrderId(),order.getProductld(),order.getQuantity(),order.getCost()};
		return executeUpdate(sql, params);
	}

	@Override
	public List<EasybuyOrder> finduserproduct(String loginName) {
		List<EasybuyOrder> list=new ArrayList<EasybuyOrder>();
		 String sql ="SELECT * FROM easuby_order WHERE `loginName`=?AND`status`='0'";
		 Object[]params={loginName};
		  rs = executeQuery(sql,params);
		  list=ResultSetUtil.eachResultSet(rs, EasybuyOrder.class);
		return list;
	}


	

	

}
