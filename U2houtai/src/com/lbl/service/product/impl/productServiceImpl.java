package com.lbl.service.product.impl;

import java.util.List;

import com.lbl.bean.Easubuy_Product_Category;
import com.lbl.bean.EasybuyProduct;
import com.lbl.dao.product.productDao;
import com.lbl.dao.product.impl.productDaoImpl;

import com.lbl.service.product.productService;

public  class productServiceImpl implements productService{
	productDao dao=new productDaoImpl();
	@Override
	public int add(EasybuyProduct paramT) {
		int no=dao.add(paramT);
		int num=0;
		if(no>0){
			num=addProduct_Category(paramT);
		}
		return num;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int update(EasybuyProduct paramT) {
		return dao.update(paramT);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Easubuy_Product_Category> selectProduct() {
		return dao.selectProduct();
	}

	@Override
	public int addCategory(EasybuyProduct Product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<EasybuyProduct> finOne(int id) {
		return dao.finOne(id);
	}

	@Override
	public int addfenlei(Easubuy_Product_Category Category) {
		return dao.addfenlei(Category);
	}

	@Override
	public int addProduct_Category(EasybuyProduct Product) {
		Easubuy_Product_Category Category=new Easubuy_Product_Category();
		Category.setName(Product.getProductname());
		Category.setParentld(Product.getCategoryLevel1());
		Category.setType(2);
		dao.addCategory(Category);
		int num=dao.fianid(Product.getProductname());
		Product.setId(num);
		return dao.updateID(Product);
	}

	@Override
	public EasybuyProduct finOneProduct(int id) {
		// TODO Auto-generated method stub
		return dao.finOneProduct(id);
	}

	@Override
	public List<EasybuyProduct> selectProductAll() {
		 return dao.selectProductAll();
	}

	@Override
	public List<Easubuy_Product_Category> finfenlei(String id) {
		int num=dao.fianid(id);
		return dao.finfenlei(num);
	}

	@Override
	public List<EasybuyProduct> finleibiao(int id) {
		// TODO Auto-generated method stub
		return dao.finleibiao(id);
	}

	
	
}
