/**
 * 
 */
package com.pl.demo2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年8月23日 下午3:32:00
 * 
 */
public class MyTest {
	
	static {
		

		SqlSessionFactory sqlSessionFactory = null;
		SqlSession session = null;

		try {
			InputStream inputStream = Resources.getResourceAsStream("com/pl/demo2/mybatis-config.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			Employees user = session.selectOne("com.pl.demo2.EmployeesMapper.select");
			System.out.println(user);
			if (session != null) {
				try {
					session.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (session != null) {
				try {
					session.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			throw new ExceptionInInitializerError("静态代码块发生异常");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("hello");
	}
}
