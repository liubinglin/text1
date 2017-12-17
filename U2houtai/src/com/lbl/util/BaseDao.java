package com.lbl.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BaseDao {
	protected static Connection con = null;
	protected static PreparedStatement stmt = null;
	protected static ResultSet rs = null;

	public static Connection getConnection() {

		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/news");
			con = ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

	protected static void closeConnection() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	protected static int executeUpdate(String sql, Object... params) {
		int rowNum = 0;
		con = getConnection();
		if (con != null) {
			try {
				stmt = con.prepareStatement(sql);
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
				rowNum = stmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				closeConnection();
			}
		}
		return rowNum;
	}

	protected static ResultSet executeQuery(String sql, Object... params) {
		con = getConnection();
		if (con != null) {
			try {
				stmt = con.prepareStatement(sql);
				for (int i = 0; i < params.length; i++) {
					stmt.setObject(i + 1, params[i]);
				}
				rs = stmt.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
}
