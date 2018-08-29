package com.pl.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pl.demo1.Service;

/**
 * @Description:测试类
 * @author: 彭立
 * @date:   2018年8月14日 下午9:16:14
 *   
 */
public class TestDemo1 {

	@Test
	public void test() {
		//这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo1.xml");
		//从spring容器中获取bean来用
		Service service = context.getBean("service", Service.class);
		service.saveData();
		
	}

}
