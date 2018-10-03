package com.pl.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.pl.demo5.Bean;
import com.pl.demo5.BeanDao;

public class TestDemo5 {

	@Test
	public void testQuery() {

		SqlSessionFactory sqlSessionFactory = null;
		try {
			// 读取配置文件
			InputStream inputStream = Resources.getResourceAsStream("com/pl/demo5/mybatis-config.xml");
			// 实例化SqlSessionFactory对象
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Throwable ex) {
			System.err.println("Initial SqlSessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			// 使用mybatis提供的基于接口方式的编程，我们要先获取到这个接口（其实是获取到这个接口的实现类，我们自己不需要编写这个实现类，这个实现类是mybatis通过代理的方式给我们生成的）
			BeanDao dao = sqlSession.getMapper(BeanDao.class);
			Bean bean = dao.getBeanById(1);
			System.out.println(bean);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

}
