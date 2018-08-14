package com.pl.demo7.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author: 彭立
 * @date: 2018年8月14日 上午8:12:54
 * 
 */
public class Demo7Action2 extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	
	
	HttpServletRequest request;//定义一个HttpServletRequest变量来接收
	
	HttpServletResponse response;//定义一个HttpServletResponse变量来接收

	public String hello() {
		Enumeration<String> headers = this.request.getHeaderNames();//通过HttpServletRequest获得请求头
		while(headers.hasMoreElements()) {
			String head = headers.nextElement();
			System.out.println(head+"\t"+request.getHeader(head));
		}
		return super.SUCCESS;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response=response;//赋值
		
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;//赋值
		
	}
}
