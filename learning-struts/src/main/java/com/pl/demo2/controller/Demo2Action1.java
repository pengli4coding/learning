package com.pl.demo2.controller;
/**
 * 第一种创建action动作类的方法：使用POJO（普通JavaBean）
 * @author 彭立
 *
 */
public class Demo2Action1 {
	
	public String hello() {
		System.out.println("动作类中的hello方法被执行");
		return "success";
	}
	
	//如果struts.xml文件中的action标签没有配置method属性指定方法，则默认会找execute()方法
	public String execute() {
		System.out.println("动作类中的execute方法被执行");
		return "success";
	}
}
