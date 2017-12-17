package com.lbl.util;

public class PageUtil {
	private int totalCount;//总记录页
	private int pageSize=5;//页大小
	private int pageCount;//总页数
	private int pageIndex;//当前页
	public int getTotalCount() {
		return totalCount;
	}
	/*
	 * 在记录总记录说时候，给总页数赋值
	 */
	public void setTotalCount(int totalCount) {
		if (totalCount > 0) {
			this.totalCount = totalCount;
			// 获取总页数
			this.pageCount = (totalCount % pageSize == 0) ? (totalCount / pageSize)
					: (totalCount / pageSize + 1);
		}
		System.out.println(pageCount);
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	
}
