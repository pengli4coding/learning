package com.pl.demo4;

/**
 * 
 * @Description:多例bean
 * @author: 彭立
 * @date:   2018年8月15日 上午10:51:55
 *
 */
public class PrototypeBean {

	public void init() {
		System.out.println("初始化bean的时候调用的方法，多例的时候");
	}
	
	public void destroy() {
		System.out.println("销毁bean的时候调用的方法，多例的时候");
	}
}
