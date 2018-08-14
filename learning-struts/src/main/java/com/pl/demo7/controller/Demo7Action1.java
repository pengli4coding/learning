package com.pl.demo7.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: 彭立
 * @date: 2018年8月14日 上午8:12:54
 * 
 */
public class Demo7Action1 extends ActionSupport {

	public String hello() {
		HttpServletRequest request = ServletActionContext.getRequest();//通过ServletActionContext获得HttpServletRequest
		Enumeration<String> headers = request.getHeaderNames();//通过HttpServletRequest获得请求头
		while(headers.hasMoreElements()) {
			String head = headers.nextElement();
			System.out.println(head+"\t"+request.getHeader(head));
		}
		HttpServletResponse response = ServletActionContext.getResponse();//通过ServletActionContext获得HttpServletResponse
		return super.SUCCESS;
	}
}
