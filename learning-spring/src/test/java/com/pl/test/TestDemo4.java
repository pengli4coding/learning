package com.pl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:测试类
 * @author: 彭立
 * @date: 2018年8月14日 下午9:16:14
 * 
 */
public class TestDemo4 {

	@Test
	public void test_not_lazy_init() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo4.xml");
		System.out.println("分割线======================================");
		// 从spring容器中获取bean来用
		com.pl.demo4.NotLazyInitBean bean = context.getBean("notlazyinit", com.pl.demo4.NotLazyInitBean.class);
	}
	
	@Test
	public void test_lazy_init() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo4.xml");
		System.out.println("分割线======================================");
		// 从spring容器中获取bean来用
		com.pl.demo4.LazyInitBean bean = context.getBean("lazyinit", com.pl.demo4.LazyInitBean.class);
	}
	
	@Test
	public void test_singleton() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo4.xml");
		System.out.println("分割线======================================");
		// 从spring容器中获取bean来用
		com.pl.demo4.SingletonBean bean1 = context.getBean("singleton", com.pl.demo4.SingletonBean.class);
		System.out.println("第一次获取的bean "+bean1);
		
		com.pl.demo4.SingletonBean bean2 = context.getBean("singleton", com.pl.demo4.SingletonBean.class);
		System.out.println("第二次获取的bean "+bean2);
	}
	
	@Test
	public void test_prototype() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo4.xml");
		System.out.println("分割线======================================");
		// 从spring容器中获取bean来用
		com.pl.demo4.PrototypeBean bean1 = context.getBean("prototype", com.pl.demo4.PrototypeBean.class);
		System.out.println("第一次获取的bean "+bean1);
		
		com.pl.demo4.PrototypeBean bean2 = context.getBean("prototype", com.pl.demo4.PrototypeBean.class);
		System.out.println("第二次获取的bean "+bean2);
	}
	
	@Test
	public void test_lifecycle() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo4.xml");
		System.out.println("分割线======================================");
		// 从spring容器中获取bean来用
		com.pl.demo4.SingletonBean bean = context.getBean("singleton", com.pl.demo4.SingletonBean.class);
		//spring容器关闭，这时候要转为AbstractApplicationContext才能调用close方法
		AbstractApplicationContext abcontext=(AbstractApplicationContext)context;
		abcontext.close();
	}
	
	
	

}
