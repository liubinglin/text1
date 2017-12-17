package com.lbl.bean;

import com.lbl.util.PageUtil;

public class EasybuyUser {
	private int id; // 主键
	private int sex; // 性别(1:男 0：女)
	private String loginName; // 登录名
	private String password; // 登录名
	private String userName; // 密码
	private String identityCode; // 身份证号
	private String email; // 邮箱
	private String mobile; // 手机号
	private int type; // 用户类型
	private String userAddress;//用户地址
	private PageUtil util;
	
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public PageUtil getUtil() {
		return util;
	}
	public void setUtil(PageUtil util) {
		this.util = util;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdentityCode() {
		return identityCode;
	}
	public void setIdentityCode(String identityCode) {
		this.identityCode = identityCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
