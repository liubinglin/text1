package com.lbl.bean;
/**
 * 订单详情表
 * @author Administrator
 * 
 */
public class easybuy_order_detail {
	private int id;//编号
	private int orderId;//订单ID
	private int productld;//商品ID
	private int quantity;//数量
	private double cost; //金额
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductld() {
		return productld;
	}
	public void setProductld(int productld) {
		this.productld = productld;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public easybuy_order_detail() {
		super();
	}
	public easybuy_order_detail(int id, int orderId, int productld,
			int quantity, double cost) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.productld = productld;
		this.quantity = quantity;
		this.cost = cost;
	}
	
}
