package com.pl.demo4;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @Description:封装一个util类，用以返回SqlSessionFactory的单例
 * @author: 彭立
 * @date: 2018年8月23日 下午3:32:00
 * 
 */
public class MybatisUtil {

	private static final SqlSessionFactory sqlSessionFactory = buildSqlSessionFactory();

	private static SqlSessionFactory buildSqlSessionFactory() {
		try {
			// 读取配置文件
			InputStream inputStream = Resources.getResourceAsStream("com/pl/demo4/mybatis-config.xml");
			// 创建SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 返回SqlSessionFactory对象
			return sqlSessionFactory;
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SqlSessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

}
