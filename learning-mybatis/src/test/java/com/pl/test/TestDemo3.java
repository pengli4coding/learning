package com.pl.test;

import static org.junit.Assert.fail;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.pl.demo3.MybatisUtil;
import com.pl.demo3.Unit;

public class TestDemo3 {

	@Test
	public void testInsert() {
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			/**
			 * 通过SqlSession的insert方法来插入记录
			 * 其中第一个参数传入sql语句的命名空间+id号，命名空间就是在对象-关系映射文件中配置的namespace属性值
			 * 其中第二个参数传入sql语句中具体的参数值，相当与JDBC中PreparedStatement中的？的具体的值
			 */
			Unit unit=new Unit();
			unit.setUnitCode("UNIT_"+String.valueOf(System.currentTimeMillis()));
			unit.setUnitName("鑫海公寓");
			unit.setPersonCount(1300);
			int result = sqlSession.insert("com.pl.demo3.UnitMapper.insertUnit", unit);
			//手动控制事务的提交
			sqlSession.commit();
			System.out.println("插入成功，影响条数为："+result);
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
			/**
			 * 通过SqlSession的update方法来更新记录
			 * 其中第一个参数传入sql语句的命名空间+id号，命名空间就是在对象-关系映射文件中配置的namespace属性值
			 * 其中第二个参数传入sql语句中具体的参数值，相当与JDBC中PreparedStatement中的？的具体的值
			 */
			//先查询出来
			Unit unit = sqlSession.selectOne("com.pl.demo3.UnitMapper.selectUnitById", 51);
			System.out.println(unit);
			//修改
			unit.setUnitName("惠鑫公寓");
			unit.setPersonCount(1000);//尝试一下把这行换为unit.setPersonCount(null);
			int result = sqlSession.update("com.pl.demo3.UnitMapper.updateUnitById", unit);
			//手动控制事务的提交
			sqlSession.commit();
			System.out.println("成功，影响条数为："+result);
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
			/**
			 * 通过SqlSession的update方法来更新记录
			 * 其中第一个参数传入sql语句的命名空间+id号，命名空间就是在对象-关系映射文件中配置的namespace属性值
			 * 其中第二个参数传入sql语句中具体的参数值，相当与JDBC中PreparedStatement中的？的具体的值
			 */
			int result = sqlSession.delete("com.pl.demo3.UnitMapper.deleteUnitById", 54);
			//手动控制事务的提交
			sqlSession.commit();
			System.out.println("成功，影响条数为："+result);
		} catch (Exception e) {
			//报错的时候必须要回滚事务
			sqlSession.rollback();
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}

}
