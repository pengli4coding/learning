package com.pl.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pl.demo3.Service;

/**
 * @Description:测试类
 * @author: 彭立
 * @date: 2018年8月14日 下午9:16:14
 * 
 */
public class TestDemo3 {

	@Test
	public void test1() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo3.xml");
		// 从spring容器中获取bean来用
		Service service = context.getBean("service", Service.class);
		service.saveData();
		service.printDescribe();
	}

	@Test
	public void test2() {
		// 这一行基本是非常固定的，简单理解这一行的作用是读取配置文件并初始化spring容器
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext_demo3.xml");
		// 从spring容器中获取bean来用
		com.pl.demo3.ColletionInjection bean = context.getBean("collection", com.pl.demo3.ColletionInjection.class);
		Set<String> set = bean.getSet();
		for (String item : set) {
			System.out.println(item);
		}
		System.out.println("=========================================");
		List<String> list = bean.getList();
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println("=========================================");
		Map<String, String> map = bean.getMap();
		for(Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println("=========================================");
		Properties properties = bean.getProperties();
		System.out.println(properties);

	}

}
