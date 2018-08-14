/**
 * 
 */
package com.pl.demo4.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: 彭立
 * @date:   2018年8月14日 上午8:12:54
 *   
 */
public class Demo4Action2 extends ActionSupport{
	
	public String hello() {
		System.out.println("这是第二个action");
		return SUCCESS;
	}
}
