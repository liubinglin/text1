package com.lbl.dao.product.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.lbl.bean.Easubuy_Product_Category;
import com.lbl.bean.EasybuyOrder;
import com.lbl.bean.EasybuyProduct;
import com.lbl.bean.EasybuyUser;
import com.lbl.dao.product.productDao;
import com.lbl.util.BaseDao;
import com.lbl.util.ResultSetUtil;

public class productDaoImpl extends BaseDao implements productDao{

	@Override
	public int add(EasybuyProduct product) {
		String sql = "INSERT INTO  `easubuy_product`(`productname`,`description`,`price`,`stock`,`categoryLevel1`,`fileName`) VALUES(?,?,?,?,?,?)";
		Object[] params = {product.getProductname(),product.getDescription(),product.getPrice(),product.getStock(),product.getCategoryLevel1(),product.getFileName()};
		int num = executeUpdate(sql, params);
		return num;
	}

	@Override
	public int delete(Serializable s) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(EasybuyProduct Product) {
		String sql="UPDATE  `easubuy_product`  SET`productname`=?,`description`=?,`price`=?,`stock`=?,`categoryLevel1`=?,`fileName`=?  WHERE `id`=?";
		Object[]params={Product.getProductname(),Product.getDescription(),Product.getPrice(),Product.getStock(),Product.getCategoryLevel1(),Product.getFileName(),Product.getId()};
		return executeUpdate(sql, params);
	}

	@Override
	public List<EasybuyProduct> findAll(Object... objects) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Easubuy_Product_Category> selectProduct() {
		String sql="SELECT * FROM`easubuy_product_category`WHERE`parentld`=0;";
		rs=executeQuery(sql);
		List<Easubuy_Product_Category> list=new ArrayList<Easubuy_Product_Category>();
		list=ResultSetUtil.eachResultSet(rs, Easubuy_Product_Category.class);
		System.out.println(list);
		return list;
	}

	@Override
	public List<EasybuyProduct> finOne(int id) {
		String sql="SELECT * FROM`easubuy_product`WHERE`categoryLevel1`=?";
		Object[] params={id};
		rs=executeQuery(sql, params);
		List<EasybuyProduct> list=new ArrayList<EasybuyProduct>();
		list=ResultSetUtil.eachResultSet(rs, EasybuyProduct.class);
		System.out.println(list);
		return list;
	}

	@Override
	public int addfenlei(Easubuy_Product_Category Category) {
		String sql="INSERT INTO  `easubuy_product_category`(`name`,`parentld`,`type`) VALUES(?,?,?)";
		Object [] params={Category.getName(),Category.getParentld(),Category.getType()};
		int num=executeUpdate(sql, params);
		return num;
	}

	@Override
	public int addCategory(Easubuy_Product_Category category) {
		Easubuy_Product_Category Cat=new Easubuy_Product_Category();
		String sql="INSERT INTO  `easubuy_product_category`(`name`,`parentld`,`type`) VALUES(?,?,?)";
		Object[]params={category.getName(),category.getParentld(),category.getType()};
		return executeUpdate(sql, params);
		
	}
	@Override
	public int updateID(EasybuyProduct Product){
		String sql="UPDATE  `easubuy_product`  SET  `id`=? WHERE `productname`=?";
		Object[]params={Product.getId(),Product.getProductname()};
		return executeUpdate(sql, params);
		
	}

	@Override
	public int fianid(String productname) {
		Easubuy_Product_Category Category=new Easubuy_Product_Category();
		String sql="SELECT * FROM easubuy_product_category WHERE `name`=?";
		Object[]params={productname};
		rs=executeQuery(sql, params);
		Category=ResultSetUtil.findOne(rs, Easubuy_Product_Category.class);
		System.out.println(Category.getId());
		return Category.getId();
	}

	@Override
	public EasybuyProduct finOneProduct(int id) {
		EasybuyProduct  Product=new EasybuyProduct();
		String sql="SELECT * FROM`easubuy_product` WHERE`id`=?";
		Object[]params={id};
		rs=executeQuery(sql, params);
		Product=ResultSetUtil.findOne(rs, EasybuyProduct.class);
		return Product;
	}

	@Override
	public List<EasybuyProduct> selectProductAll() {
		String sql="SELECT * FROM`easubuy_product`";
		rs=executeQuery(sql);
		List<EasybuyProduct> list=new ArrayList<EasybuyProduct>();
		list=ResultSetUtil.eachResultSet(rs, EasybuyProduct.class);
		System.out.println(list);
		return list;
	}

	@Override
	public List<Easubuy_Product_Category> finfenlei(int id) {
		String sql="SELECT *FROM`easubuy_product_category`WHERE`parentld`=?";
		Object[]params={id};
		rs=executeQuery(sql,params);
		List<Easubuy_Product_Category> list=new ArrayList<Easubuy_Product_Category>();
		System.out.println(list);
		list=ResultSetUtil.eachResultSet(rs, Easubuy_Product_Category.class);
		return list;
	}

	@Override
	public List<EasybuyProduct> finleibiao(int id) {
		String sql="SELECT * FROM `easubuy_product`WHERE`categoryLevel1`=?";
		Object[]params={id};
		rs=executeQuery(sql,params);
		List<EasybuyProduct> list=new ArrayList<EasybuyProduct>();
		System.out.println(list);
		list=ResultSetUtil.eachResultSet(rs, EasybuyProduct.class);
		return list;
	}

	
	
	

	
	

}
