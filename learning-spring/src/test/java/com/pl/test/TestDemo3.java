package com.pl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pl.demo2.Bean1;
import com.pl.demo2.Bean2;
import com.pl.demo2.Bean3;

/**
 * @Description:测试类
 * @author: 彭立
 * @date: 2018年8月14日 下午9:16:14
 * 
 */
public class TestDemo3 {

	@Test
	public void test_instantiation_with_a_constructor() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo2.xml");
		// 从spring容器中获取bean来用
		Bean1 bean1 = context.getBean("bean1", Bean1.class);
		bean1.doSomething();
	}
	
	@Test
	public void test_instantiation_with_a_static_factory_method() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo2.xml");
		// 从spring容器中获取bean来用
		Bean2 bean2 = context.getBean("bean2", Bean2.class);
		bean2.doSomething();
	}
	
	@Test
	public void test_instantiation_using_an_instance_factory_method() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo2.xml");
		// 从spring容器中获取bean来用
		Bean3 bean3 = context.getBean("bean3", Bean3.class);
		bean3.doSomething();
	}
	

}
