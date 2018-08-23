package com.pl.demo2;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

/**
 * @author: 彭立
 * @date: 2018年8月19日 下午6:05:55
 * 
 */
public class TestDemo2 {

	@Test
	public void test() {
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession session = null;

		try {
			InputStream inputStream = Resources.getResourceAsStream("com/pl/demo2/mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			Employees user = session.selectOne("com.pl.demo2.EmployeesMapper.selectEmployeeById", 2);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Test
	public void test1() {
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession session = null;

		try {
			InputStream inputStream = Resources.getResourceAsStream("com/pl/demo2/mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			Employees user = session.selectOne("com.pl.demo2.EmployeesMapper.selectEmployeeByIdWithAlias", 2);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				try {
					session.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
