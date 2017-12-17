package com.lbl.service.order;

import java.util.List;

import com.lbl.bean.EasybuyOrder;
import com.lbl.bean.EasybuyUser;
import com.lbl.service.Commenservice;

public interface OrderService extends Commenservice<EasybuyOrder>{

	List<EasybuyOrder> selectOrder();

	EasybuyOrder findOne(int id);

	int finuid(String loginName);

	List<EasybuyOrder> finduserproduct(String loginName);



}
