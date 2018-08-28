package com.pl.demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.pl.demo2.vo.EmployeeQueryCondition1;

/**
 * @author: 彭立
 * @date: 2018年8月19日 下午6:05:55
 * 
 */
public class TestDemo2 {

	@Test
	public void testSelectEmployeeById() {// 测试获取单条记录
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			/**
			 * 通过SqlSession的selectOne方法来获取单条记录
			 * 其中第一个参数传入sql语句的命名空间+id号，命名空间就是在对象-关系映射文件中配置的namespace属性值
			 * 其中第二个参数传入sql语句中具体的参数值，相当与JDBC中PreparedStatement中的？的具体的值
			 */
			Employee employee = sqlSession.selectOne("com.pl.demo2.EmployeeMapper.selectEmployeeById", 1);
			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testSelectEmployeeByIdWithAlias() {// 测试获取单条记录
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			/**
			 * 通过SqlSession的selectOne方法来获取单条记录
			 * 其中第一个参数传入sql语句的命名空间+id号，命名空间就是在对象-关系映射文件中配置的namespace属性值
			 * 其中第二个参数传入sql语句中具体的参数值，相当与JDBC中PreparedStatement中的？的具体的值
			 */
			Employee employee = sqlSession.selectOne("com.pl.demo2.EmployeeMapper.selectEmployeeByIdWithAlias", 2);
			System.out.println(employee);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

	@Test
	public void testSelectEmployeesAll() {// 测试获取表中的所有记录
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			List<Employee> employeeList = sqlSession.selectList("com.pl.demo2.EmployeeMapper.selectEmployeesAll");
			System.out.println("Employees表中的所有记录为以下： ");
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectEmployeesList() {// 测试获取表中符合单一条件的记录
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Date bir=null;//出生日期的下限
		try {
			bir = new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-01");
		} catch (ParseException e1) {
		}
		
		try {
			List<Employee> employeeList = sqlSession.selectList("com.pl.demo2.EmployeeMapper.selectEmployeesList",bir);
			System.out.println("Employees表中的出生日期大于1990-01-01的记录为以下： ");
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectEmployeesByParams1() {// 测试获取表中符合多个条件的记录，使用vo封装查询条件
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Date upper=null;//出生日期的上限
		try {
			upper = new SimpleDateFormat("yyyy-MM-dd").parse("1991-01-01");
		} catch (ParseException e1) {
		}
		Date lower=null;//出生日期的下限
		try {
			lower = new SimpleDateFormat("yyyy-MM-dd").parse("1986-01-01");
		} catch (ParseException e1) {
		}
		EmployeeQueryCondition1 queryCondition=new EmployeeQueryCondition1();
		queryCondition.setUpper(upper);
		queryCondition.setLower(lower);
		
		try {
			List<Employee> employeeList = sqlSession.selectList("com.pl.demo2.EmployeeMapper.selectEmployeesByParams1",queryCondition);
			System.out.println("Employees表中的出生日期大于1988-01-01小于1991-01-01的记录为以下： ");
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectEmployeesByParams2() {// 测试获取表中符合多个条件的记录，使用java.util.Map封装查询条件
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		Date upper=null;//出生日期的上限
		try {
			upper = new SimpleDateFormat("yyyy-MM-dd").parse("1991-01-01");
		} catch (ParseException e1) {
		}
		Date lower=null;//出生日期的下限
		try {
			lower = new SimpleDateFormat("yyyy-MM-dd").parse("1986-01-01");
		} catch (ParseException e1) {
		}
		Map<String,Object> queryConditionMap=new HashMap<String,Object>();
		queryConditionMap.put("upper", upper);
		queryConditionMap.put("lower", lower);
		
		try {
			List<Employee> employeeList = sqlSession.selectList("com.pl.demo2.EmployeeMapper.selectEmployeesByParams2",queryConditionMap);
			System.out.println("Employees表中的出生日期大于1988-01-01小于1991-01-01的记录为以下： ");
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}
	
	@Test
	public void testSelectEmployeesByName() {// 测试${}的使用，用于模糊查询
		// 通过自己封装的MybatisUtil工具类获取SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
		// 通过SqlSessionFactory来获取SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Map<String,Object> queryCondition=new HashMap<String,Object>();
		queryCondition.put("name", "ng");
		try {
			List<Employee> employeeList = sqlSession.selectList("com.pl.demo2.EmployeeMapper.selectEmployeesByName",queryCondition);
			System.out.println("Employees表中的LAST_NAME字段中包含‘ng’的记录为以下： ");
			for(Employee employee:employeeList) {
				System.out.println(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}
	}

}
