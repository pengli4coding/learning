package com.pl.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年9月9日 下午3:02:01
 * 
 */
public class Demo3 {

	public static void create() {
		// 准备连接参数
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://182.254.140.184:3306/jdbc_db?characterEncoding=utf-8";
		String username = "root";
		String password = "382346819pl";

		// 准备SQL语句
		String sql = "insert into PET (PET_ID,PET_NAME,BIRTHDAY,FAVOURITE_FOOD,MASTER) values (null,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象PreparedStatement
			pstmt = conn.prepareStatement(sql);
			// 给PreparedStatement传入参数值，下标从1开始
			pstmt.setString(1, "大黄猫");
			pstmt.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
			pstmt.setString(3, "鱿鱼丝");
			pstmt.setString(4, "彭立");
			// 通过PreparedStatement来执行SQL语句，并返回响应条数
			int affectedRows = pstmt.executeUpdate();
			System.out.println("执行成功：影响行数为： " + affectedRows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void read() {

		// 准备连接参数
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://182.254.140.184:3306/jdbc_db?characterEncoding=utf-8";
		String username = "root";
		String password = "382346819pl";

		// 准备SQL语句
		String sql = "select * from PET where MASTER=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象PreparedStatement
			pstmt = conn.prepareStatement(sql);
			// 给PreparedStatement传入参数值，下标从1开始
			pstmt.setString(1, "彭立");
			// 通过PreparedStatement来执行SQL语句查询，并返回查询结果集ResultSet
			rs = pstmt.executeQuery();
			// 封装查询结果到dto中
			List<Pet> resultList = new ArrayList<>();
			while (rs.next()) {
				Pet pet = new Pet();
				pet.setPetId(rs.getInt("PET_ID"));
				pet.setPetName(rs.getString("PET_NAME"));
				pet.setBirthday(rs.getDate("BIRTHDAY"));
				pet.setFavouriteFood(rs.getString("FAVOURITE_FOOD"));
				pet.setMaster(rs.getString("MASTER"));
				resultList.add(pet);
			}
			// 打印结果
			for (Pet pet : resultList) {
				System.out.println(pet);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void update() {

		// 准备连接参数
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://182.254.140.184:3306/jdbc_db?characterEncoding=utf-8";
		String username = "root";
		String password = "382346819pl";

		// 准备SQL语句
		String sql = "update PET set BIRTHDAY=?,FAVOURITE_FOOD=? where PET_ID=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象PreparedStatement
			pstmt = conn.prepareStatement(sql);
			// 给PreparedStatement传入参数值，下标从1开始
			pstmt.setDate(1, new java.sql.Date(new java.util.Date().getTime()));
			pstmt.setString(2, "小鱼干");
			pstmt.setInt(3, 1);
			// 通过PreparedStatement来执行SQL语句，并返回响应条数
			int affectedRows = pstmt.executeUpdate();
			System.out.println("执行成功：影响行数为： " + affectedRows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void delete() {

		// 准备连接参数
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://182.254.140.184:3306/jdbc_db?characterEncoding=utf-8";
		String username = "root";
		String password = "382346819pl";

		// 准备SQL语句
		String sql = "delete from PET where PET_ID=?";

		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象PreparedStatement
			pstmt = conn.prepareStatement(sql);
			// 给PreparedStatement传入参数值，下标从1开始
			pstmt.setInt(1, 1);
			// 通过PreparedStatement来执行SQL语句，并返回响应条数
			int affectedRows = pstmt.executeUpdate();
			System.out.println("执行成功：影响行数为： " + affectedRows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
