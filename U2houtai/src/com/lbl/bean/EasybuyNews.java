package com.lbl.bean;

import java.sql.Timestamp;
import java.util.Date;

import com.lbl.util.PageUtil;

public class EasybuyNews
{
  private int id;
  private String title;
  private String content;
  private Date createTime;
  private PageUtil util;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getCreateTime() {
	return createTime;
}
public void setCreateTime(Date createTime) {
	this.createTime = createTime;
}
public PageUtil getUtil() {
	return util;
}
public void setUtil(PageUtil util) {
	this.util = util;
}
  



}
