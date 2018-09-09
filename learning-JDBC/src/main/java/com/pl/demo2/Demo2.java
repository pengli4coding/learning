/**
 * 
 */
package com.pl.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年9月9日 下午3:02:01
 * 
 */
public class Demo2 {

	public static void create() {
		// 准备连接参数
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://182.254.140.184:3306/jdbc_db?characterEncoding=utf-8";
		String username = "root";
		String password = "382346819pl";

		// 准备SQL语句
		String sql = "insert into PET (PET_ID,PET_NAME,BIRTHDAY,FAVOURITE_FOOD,MASTER) values (null,'大黄猫','2017-09-02','鱿鱼丝','彭立');";

		Connection conn = null;
		Statement stmt = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象Statement
			stmt = conn.createStatement();
			// 通过Statement来执行SQL语句，并返回响应条数
			int affectedRows = stmt.executeUpdate(sql);
			System.out.println("执行成功：影响行数为： " + affectedRows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (stmt != null) {
					stmt.close();
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
		String sql = "select * from PET";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象Statement
			stmt = conn.createStatement();
			// 通过Statement来执行SQL语句查询，并返回查询结果集ResultSet
			rs = stmt.executeQuery(sql);
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
			//打印结果
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
				if (stmt != null) {
					stmt.close();
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
		String sql = "update PET set BIRTHDAY='2018-09-02',FAVOURITE_FOOD='小鱼干' where PET_ID=2";

		Connection conn = null;
		Statement stmt = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象Statement
			stmt = conn.createStatement();
			// 通过Statement来执行SQL语句，并返回响应条数
			int affectedRows = stmt.executeUpdate(sql);
			System.out.println("执行成功：影响行数为： " + affectedRows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (stmt != null) {
					stmt.close();
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
		String sql = "delete from PET where PET_ID=1";

		Connection conn = null;
		Statement stmt = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象Statement
			stmt = conn.createStatement();
			// 通过Statement来执行SQL语句，并返回响应条数
			int affectedRows = stmt.executeUpdate(sql);
			System.out.println("执行成功：影响行数为： " + affectedRows);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (stmt != null) {
					stmt.close();
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
