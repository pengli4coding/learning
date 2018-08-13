package com.pl.demo3.controller;

/**
 * action动作类
 * 
 * @author 彭立
 *
 */
public class Demo3Action1 {

	public String hello() {
		//打印this，用以观察多次请求过来的时候创建的action动作类是单例还是多例的
		//通过观察控制台打印输出结果来看
		//action动作类是在每一次请求的时候struts框架都会创建一个action动作类的实例
		//由此可以得出action动作类是多例的（不同于servlet是单例的）
		System.out.println(this);
		return "success";
	}
}
