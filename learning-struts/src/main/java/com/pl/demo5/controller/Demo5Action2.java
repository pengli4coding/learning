/**
 * 
 */
package com.pl.demo5.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: 彭立
 * @date: 2018年8月14日 上午8:12:54
 * 
 */
public class Demo5Action2 extends ActionSupport {
	
	public String hello() {
		System.out.println("第二个包中的action");
		return SUCCESS;
	}

	
}
