package com.lbl.servlet.productServlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.lbl.bean.EasybuyProduct;
import com.lbl.service.product.productService;
import com.lbl.service.product.impl.productServiceImpl;
@WebServlet("/updatepductr")
public class updatepductrServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("临时路径》》"+System.getProperty("java.io.tmpdir"));
		// 1.创建DiskFileItemFactory的实例对象 设置缓冲区大小 ，存放位置 ，可以不设置，有默认值
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// 2.通过DiskFileItemFactory创建出 ServletFileUpload
		ServletFileUpload upload=new ServletFileUpload(factory);
		boolean flg=upload.isMultipartContent(req);
		EasybuyProduct Product=new EasybuyProduct();
		int no = 0;
		if(flg){
			try {
				// 4. 通过parseRequest(req) 获取所有的框框
				List<FileItem> items=upload.parseRequest(req);
				// 5. 使用迭代器进行遍历
				Iterator<FileItem> its=items.iterator();
				while(its.hasNext()){
					FileItem item=its.next(); // 获取每一个框框 （普通，上传）
					if(item.isFormField()){ // 普通的框框
						// 6.如果是普通框框 使用 getFiledName.getString 来获取字段的名称和字段的值
					String fileName=item.getFieldName();
					
					switch (fileName) {
							case "productname":
								Product.setProductname(item.getString("utf-8"));
								break;
							case "description":
								Product.setDescription(item.getString("utf-8"));
								break;
							case "price":
								Product.setPrice(Double.valueOf((item.getString("utf-8"))));
								break;
							case "stock":
								Product.setStock(Integer.parseInt(item.getString("utf-8")));
								break;
							case "categoryLevel1":
								Product.setCategoryLevel1(Integer.parseInt(item.getString("utf-8")));
								no=Product.getCategoryLevel1();
								break;
								
						}
					}else {
						// 必须获取服务器的文件上传位置
						String uploadPath=req.getSession().getServletContext().getRealPath("/img");
						// 创建上传文件夹
						File file = new File(uploadPath);
						if(!file.exists()){
							file.mkdirs();
						}
						// 上传文件的名称
						String fileName = item.getName();
						fileName=new String(fileName.getBytes(),"utf-8");
						// 判断用户是否选择文件
						if(!"".equals(fileName)&&null!=fileName){
							File saveFile=new File(uploadPath,fileName);
							item.write(saveFile);
							Product.setFileName(uploadPath + fileName);
						}
						
					}
					
				}
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		productService service=new productServiceImpl();
		System.out.println(Product.getProductname());
		System.out.println(Product.getDescription());
		System.out.println(Product.getPrice());
		System.out.println(Product.getStock());
		System.out.println(Product.getFileName());
		System.out.println(no);
		int num=service.update(Product);
		if(num>=0){
			 req.getRequestDispatcher("/Product.jsp").forward(req, resp);
		}
	}


}
