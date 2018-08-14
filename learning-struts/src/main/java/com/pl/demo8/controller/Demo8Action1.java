package com.pl.demo8.controller;


import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: 彭立
 * @date: 2018年8月14日 上午8:12:54
 * 
 */
public class Demo8Action1 extends ActionSupport {
	
	private String name;//定义成员变量以供框架将参数值注入进来
	
	public void setName(String name) {//必须提供set方法，不然注入不进来
		this.name = name;
	}

	private String address;//定义成员变量以供框架将参数值注入进来
	
	public void setAddress(String address) {//必须提供set方法，不然注入不进来
		this.address = address;
	}

	public String hello() {
		System.out.println(this.name);
		System.out.println(this.address);
		return super.SUCCESS;
	}
}
