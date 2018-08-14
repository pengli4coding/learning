package com.pl.demo5.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: 彭立
 * @date: 2018年8月14日 上午8:12:54
 * 
 */
public class Demo5Action1 extends ActionSupport {

	public String chainDemo() {
		System.out.println("第一个包中的action，请求转发到另一个包中的action动作类");
		return SUCCESS;
	}

	public String redirectActionDemo() {
		System.out.println("第一个包中的action，重定向到另一个包中的action动作类");
		return SUCCESS;
	}
}
