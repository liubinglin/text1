package com.lbl.bean;

public class Easubuy_Product_Category {
		private int id;//编号    
		private String name;//名字
		private int parentld;//父分类   
		private int type;//类型 1.一级 2.二级 3.三级 
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getParentld() {
			return parentld;
		}
		public void setParentld(int parentld) {
			this.parentld = parentld;
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public Easubuy_Product_Category() {
			super();
		}
		public Easubuy_Product_Category(int id, String name, int parentld,
				int type) {
			super();
			this.id = id;
			this.name = name;
			this.parentld = parentld;
			this.type = type;
		}
		
}
