package com.lbl.dao.order;

import java.util.List;

import com.lbl.bean.EasybuyOrder;
import com.lbl.bean.EasybuyProduct;
import com.lbl.bean.easybuy_order_detail;
import com.lbl.dao.CommonDao;

public interface OrderDao extends CommonDao<EasybuyOrder>{
 
	public List<EasybuyOrder> selectOrder();
	EasybuyOrder  findOne(int id);
	public int finuid(String loginName);
	public EasybuyProduct findetailid(String productname);
	public int adddetail(easybuy_order_detail order);
	public List<EasybuyOrder> finduserproduct(String loginName);
}
