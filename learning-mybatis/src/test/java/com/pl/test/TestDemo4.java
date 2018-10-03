package com.pl.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.pl.demo4.Employee;
import com.pl.demo4.EmployeeDao;
import com.pl.demo4.MybatisUtil;

public class TestDemo4 {

	@Test
	public void testInsert() {
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			//使用mybatis提供的基于接口方式的编程，我们要先获取到这个接口（其实是获取到这个接口的实现类，我们自己不需要编写这个实现类，这个实现类是mybatis通过代理的方式给我们生成的）
			EmployeeDao dao = sqlSession.getMapper(EmployeeDao.class);
			Employee employee=new Employee();
			employee.setFirstName("三");
			employee.setLastName("张");
			employee.setGender("1");
			employee.setEmail("123456@qq.com");
			dao.insertEmployee(employee);
			//手动控制事务的提交
			sqlSession.commit();
		} catch (Exception e) {
			//报错的时候必须要回滚事务
			sqlSession.rollback();
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testUpdate() {
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			//使用mybatis提供的基于接口方式的编程，我们要先获取到这个接口（其实是获取到这个接口的实现类，我们自己不需要编写这个实现类，这个实现类是mybatis通过代理的方式给我们生成的）
			EmployeeDao dao = sqlSession.getMapper(EmployeeDao.class);
			Employee employee=new Employee();
			employee.setId(53);
			employee.setEmail("654321@qq.com");
			dao.updateEmployee(employee);
			//手动控制事务的提交
			sqlSession.commit();
		} catch (Exception e) {
			//报错的时候必须要回滚事务
			sqlSession.rollback();
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testDelete() {
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			//使用mybatis提供的基于接口方式的编程，我们要先获取到这个接口（其实是获取到这个接口的实现类，我们自己不需要编写这个实现类，这个实现类是mybatis通过代理的方式给我们生成的）
			EmployeeDao dao = sqlSession.getMapper(EmployeeDao.class);
			dao.deleteEmployee(53);
			//手动控制事务的提交
			sqlSession.commit();
		} catch (Exception e) {
			//报错的时候必须要回滚事务
			sqlSession.rollback();
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testQuery() {
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			//使用mybatis提供的基于接口方式的编程，我们要先获取到这个接口（其实是获取到这个接口的实现类，我们自己不需要编写这个实现类，这个实现类是mybatis通过代理的方式给我们生成的）
			EmployeeDao dao = sqlSession.getMapper(EmployeeDao.class);
			Employee em = dao.getEmployeeById(53);
			System.out.println(em);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}

	

}
