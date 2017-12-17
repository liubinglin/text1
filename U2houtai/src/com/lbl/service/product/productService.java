package com.lbl.service.product;

import java.util.List;

import com.lbl.bean.Easubuy_Product_Category;
import com.lbl.bean.EasybuyProduct;
import com.lbl.service.Commenservice;

public interface productService extends Commenservice<EasybuyProduct>{

	public int addCategory(EasybuyProduct Product);
	List<EasybuyProduct> finOne(int id);
	List<Easubuy_Product_Category> selectProduct();
	int addfenlei(Easubuy_Product_Category Category);
	int addProduct_Category(EasybuyProduct Product);
	EasybuyProduct finOneProduct(int id);
	List<EasybuyProduct> selectProductAll();
	public List<Easubuy_Product_Category> finfenlei(String id);
	public List<EasybuyProduct> finleibiao(int id);
	
}
