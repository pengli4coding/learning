package com.pl.demo1;

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
public class TestDemo1 {

	@Test
	public void test() {
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession session = null;

		try {
			//读取mybatis-config资源文件到输入流中
			InputStream inputStream = Resources.getResourceAsStream("com/pl/demo1/mybatis-config.xml");
			//通过上一步的输入流构建SqlSessionFactory
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//开session
			session = sqlSessionFactory.openSession();
			//获取查询结果
			User user = session.selectOne("com.pl.demo1.UserMapper.selectUserById", 1);
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
