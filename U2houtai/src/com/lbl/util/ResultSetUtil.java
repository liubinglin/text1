package com.lbl.util;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSetUtil {

	/**
	 * @param rs
	 *            根据sql语句 从数据库中返回的结果集
	 * @param clazz
	 *            结果集中数据的类型
	 */
	public static <T> List<T> eachResultSet(ResultSet rs, Class<T> clazz) {
		List<T> list = new ArrayList<T>(); // 创建集合用于保存所有对象
		try {
			T object = null; // 创建对象
			while (rs.next()) {
				// 对象实例化
				object = clazz.newInstance();
				// 获取传递过来对象的所有属性
				Field[] fields = clazz.getDeclaredFields();
				for (Field f : fields) {
					if (f.getName().equals("util")) {
						continue;
					}
					f.setAccessible(true); // 开启访问私有属性
					f.set(object, rs.getObject(f.getName()));
				}
				list.add(object); // 所有的对象赋值之后 放进集合中
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * @param rs
	 *            根据sql语句 从数据库中返回的结果集
	 * @param clazz
	 *            结果集中数据的类型
	 */
	public static <T> T findOne(ResultSet rs, Class<T> clazz) {
		T object = null; // 创建对象
		try {
			if (rs.next()) {
				// 对象实例化
				object = clazz.newInstance();
				// 获取传递过来对象的所有属性
				Field[] fields = clazz.getDeclaredFields();
				for (Field f : fields) {
					if (f.getName().equals("util")) {
						continue;
					}
					f.setAccessible(true); // 开启访问私有属性
					f.set(object, rs.getObject(f.getName()));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return object;
	}

}
