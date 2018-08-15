package com.pl.demo2;

/**
 * @Description:
 * @author: 彭立
 * @date: 2018年8月15日 上午8:29:12
 * 
 */
public class Bean3 {

	// 通过实例工厂方法的方式创建bean的话，bean不强制要求提供无参构造器
	public Bean3(String initParam) {

	}

	public void doSomething() {
		System.out.println("通过实例工厂方法的方式创建bean");
	}
}
