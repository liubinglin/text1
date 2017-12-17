package com.lbl.bean;

import java.util.Date;

/**
 * 订单表
 * @author Administrator
 *
 *
 */
public class EasybuyOrder {
	private int id;//'编号'
	private int useId;//'用户ID'
	private String loginName;//'用户名'
	private String userAddress;//'用户地址'
	private Date createTime;//'创建时间'
	private String productname;//商品名字
	private int count;//数量
	private Double cost;//'金额'
	private int status;//'状态1.待审核2.审核通过3.配货4.已发货5.已收货'
	private int type;//'类型'
	private String seraINumber;//'订单号'
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUseId() {
		return useId;
	}
	public void setUseId(int useId) {
		this.useId = useId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getSeraINumber() {
		return seraINumber;
	}
	public void setSeraINumber(String seraINumber) {
		this.seraINumber = seraINumber;
	}
	
	
	
	
}
