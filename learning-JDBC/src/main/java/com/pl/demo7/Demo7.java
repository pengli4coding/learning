package com.pl.demo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年9月9日 下午5:19:52
 * 
 */
public class Demo7 {

	/**
	 * 
	 * 模拟这么一个场景： 张三和李四的账号里面都有10000块钱 张三现在往李四账户转账1000块
	 * 如果转账成功，张三的账户有9000块，李四的账户有11000块
	 * 
	 */

	/**
	 * 这个方法模拟这个转账的过程是非事务性的 也就是张三的账户上减1000在一个事务中，而李四的账户上加1000又是在另外一个事务中
	 * 如果中途发生错误，则会出现张三的账户上减1000成功了，而李四的账户上加1000却失败了，这不是我们想要的结果
	 */
	public static void nonTransactional() {

		// 准备连接参数
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://182.254.140.184:3306/jdbc_db?characterEncoding=utf-8";
		String username = "root";
		String password = "382346819pl";

		// 准备SQL语句
		String sql1 = "update ACCOUNT set AMOUNT=AMOUNT-1000 where ID=1";
		String sql2 = "update ACCOUNT set AMOUNT=AMOUNT+1000 where ID=2";

		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 通过Connection来获取SQL语句的执行对象PreparedStatement
			pstmt1 = conn.prepareStatement(sql1);
			pstmt2 = conn.prepareStatement(sql2);
			// 执行两条SQL语句
			pstmt1.executeUpdate();// 张三减去1000
			int i = 1 / 0;// 模拟转账的过程中发生意外
			pstmt2.executeUpdate();// 李四加上1000

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (pstmt2 != null) {
					pstmt2.close();
				}
				if (pstmt1 != null) {
					pstmt1.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 这个方法模拟整个转账的过程是事务性的 也就是张三的账户上减1000以及李四的账户上加1000都是在一个事务中
	 */
	public static void transactional() {

		// 准备连接参数
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://182.254.140.184:3306/jdbc_db?characterEncoding=utf-8";
		String username = "root";
		String password = "382346819pl";

		// 准备SQL语句
		String sql1 = "update ACCOUNT set AMOUNT=AMOUNT-1000 where ID=1";
		String sql2 = "update ACCOUNT set AMOUNT=AMOUNT+1000 where ID=2";

		Connection conn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		try {
			// 加载JDBC驱动
			Class.forName(driver);
			// 通过DriverManager获得数据库的连接Connection
			conn = DriverManager.getConnection(url, username, password);
			// 手动管理事务的提交回滚
			conn.setAutoCommit(false);
			// 通过Connection来获取SQL语句的执行对象PreparedStatement
			pstmt1 = conn.prepareStatement(sql1);
			pstmt2 = conn.prepareStatement(sql2);
			// 执行两条SQL语句
			pstmt1.executeUpdate();// 张三减去1000
			int i = 1 / 0;// 模拟转账的过程中发生意外
			pstmt2.executeUpdate();// 李四加上1000
			//如果整个转账过程都没有发生错误，则会走到下面一行提交事务的操作
			conn.commit();
		} catch (Exception e) {
			try {
				System.out.println("发生错误，事务即将回滚");
				conn.rollback();
				System.out.println("事务回滚成功");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			// 关闭资源，注意先打开的后关闭
			try {
				if (pstmt2 != null) {
					pstmt2.close();
				}
				if (pstmt1 != null) {
					pstmt1.close();
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
