package com.pl.demo2.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 第三种创建action动作类的方法：实现接口com.opensymphony.xwork2.Action
 * @author 彭立
 *
 */
public class Demo2Action3 extends ActionSupport{
	
	//不做任何方法的配置，那么就会找到父类ActionSupport中的execute()方法，
	//父类ActionSupport中的execute()方法返回success字符串
}
