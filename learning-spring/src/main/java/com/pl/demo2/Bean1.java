/**
 * 
 */
package com.pl.demo2;

/**
 * @Description:通过构造器的方式创建bean（最常用，开发过程中推荐使用）
 * @author: 彭立
 * @date: 2018年8月15日 上午8:29:12
 * 
 */
public class Bean1 {

	// 通过构造器的方式创建bean有一个非常重要的条件就是：这个bean一定要提供无参的构造器
	// 提供无参构造器的两种方法：
	// 只要我们不显式自定义有参构造器，系统会默认提供无参构造器
	// 我们如果显式自定义了有参构造器，默认的无参构造器会被覆盖，所以我们也一定要显式提供无参构造器
	
	public Bean1() {
	}
	
	public Bean1(String initParam){
		
	}

	public void doSomething() {
		System.out.println("通过构造器的方式创建bean（最常用，开发过程中推荐使用）");
	}
}
