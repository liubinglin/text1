package com.lbl.service.order.impl;

import java.util.List;

import com.lbl.bean.EasybuyOrder;
import com.lbl.bean.EasybuyProduct;
import com.lbl.bean.EasybuyUser;
import com.lbl.bean.easybuy_order_detail;
import com.lbl.dao.order.OrderDao;
import com.lbl.dao.order.impl.OrderDaoImpl;
import com.lbl.service.order.OrderService;


public class OrderServiceImpl implements OrderService {
	OrderDao dao=new OrderDaoImpl();
	@Override
	public int add(EasybuyOrder order) {
		int num=(int) ((Math.random()*9+1)*100000); 
		order.setUseId(dao.finuid(order.getLoginName()));//uid
		order.setSeraINumber(Integer.toString(num));//订单号
		order.setCount(1);
		
		return dao.add(order);
	}

	@Override
	public boolean delete(int id) {
		int num=dao.delete(id);
		if(num>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int update(EasybuyOrder order) {
		order.setUseId(dao.finuid(order.getLoginName()));
		return dao.update(order);
	}

	@Override
	public List<EasybuyOrder> selectOrder() {
		return dao.selectOrder();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EasybuyOrder findOne(int id) {
		return dao.findOne(id);
	}

	public int finuid(String loginName){
		
		return dao.finuid(loginName);
		
	}

	@Override
	public List<EasybuyOrder> finduserproduct(String loginName) {
		// TODO Auto-generated method stub
		return dao.finduserproduct(loginName);
	}


	

	

}
