package com.pl.demo2;

/**
 * @Description:
 * @author: 彭立
 * @date: 2018年8月15日 上午8:29:12
 * 
 */
public class Bean2 {

	
	//通过静态工厂方法的方式创建bean的话，bean是不强制要求提供无参构造方法
	public Bean2(String initParam){
		
	}

	public void doSomething() {
		System.out.println("通过静态工厂方法的方式创建bean（不常用）");
	}
}
