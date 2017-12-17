package com.lbl.service;

import java.io.Serializable;
import java.util.List;

import com.lbl.bean.EasybuyProduct;

public abstract interface Commenservice<T> {
	 	public abstract int add(T paramT);
	  
	  public abstract boolean  delete(int id);
	  
	  public abstract int update(T paramT);

	  int getCount();


}
