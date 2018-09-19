package com.pl.demo1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @Description:实现了avax.servlet.ServletContextListener接口，用以对ServletContext这个域对象的创建和销毁进行监听
 * @author: 彭立
 * @date: 2018年9月20日 上午12:07:07
 * 
 */
public class MyServletContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {// ServletContext创建的时候被监听到，触发事件
		//可以获得ServletContext的对象引用
		ServletContext servletContext = sce.getServletContext();
		//模拟一些初始化的工作
		System.out.println(this.getClass().getSimpleName()+" 做一些初始化工作");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {// ServletContext销毁的时候被监听到，触发事件
		// TODO Auto-generated method stub

	}

}
