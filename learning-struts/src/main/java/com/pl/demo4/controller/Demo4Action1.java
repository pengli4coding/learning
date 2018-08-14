/**
 * 
 */
package com.pl.demo4.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: 彭立
 * @date: 2018年8月14日 上午8:12:54
 * 
 */
public class Demo4Action1 extends ActionSupport {
	
	public String dispatcherDemo() {
		System.out.println("请求转发，浏览器地址栏不变");
		return SUCCESS;
	}

	public String redirectDemo() {
		System.out.println("重定向，浏览器地址栏变化");
		return SUCCESS;
	}

	public String chainDemo() {
		System.out.println("请求转发到另外一个action动作类，浏览器地址栏不变");
		return SUCCESS;
	}

	public String redirectActionDemo() {
		System.out.println("重定向到另外一个action动作类，浏览器地址栏变化");
		return SUCCESS;
	}
}
