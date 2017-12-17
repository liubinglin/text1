package com.lbl.dao.product;

import java.util.List;

import com.lbl.bean.Easubuy_Product_Category;
import com.lbl.bean.EasybuyProduct;
import com.lbl.dao.CommonDao;

public interface productDao extends CommonDao<EasybuyProduct> {

	List<Easubuy_Product_Category> selectProduct();
	List<EasybuyProduct> finOne(int id);
	int addfenlei(Easubuy_Product_Category addfenlei);
	int addCategory(Easubuy_Product_Category category);
	int updateID(EasybuyProduct Product);
	int fianid(String productname);
	EasybuyProduct finOneProduct(int id);
	List<EasybuyProduct> selectProductAll();
	List<Easubuy_Product_Category> finfenlei(int id);
	List<EasybuyProduct> finleibiao(int id);
}
