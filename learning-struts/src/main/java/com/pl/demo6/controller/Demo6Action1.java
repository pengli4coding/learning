package com.pl.demo6.controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: 彭立
 * @date: 2018年8月14日 上午8:12:54
 * 
 */
public class Demo6Action1 extends ActionSupport {

	public String hello() {
		boolean flag = true;
		if (flag) {
			return super.SUCCESS;
		} else {
			return super.ERROR;
		}
	}
}
