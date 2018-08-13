package com.pl.demo2.controller;

import com.opensymphony.xwork2.Action;

/**
 * 第二种创建action动作类的方法：实现接口com.opensymphony.xwork2.Action
 * @author 彭立
 *
 */
public class Demo2Action2 implements Action{

	@Override
	public String execute() throws Exception {
		/**
		 * 
		 * Action接口中提供了一些常量，如下所示：
		 * 常量名                           值                                      应用场景
		 * SUCCESS         success         返回成功页面
		 * NONE            none            不返回任何页面
		 * ERROR           error           返回错误提示页面
		 * INPUT           input           当提交表单时发生错误，就跳回表单页面
		 * LOGIN           login           返回登录页面
		 * 
		 * 
		 */
		System.out.println("第二种创建action动作类的方法：实现接口com.opensymphony.xwork2.Action");
		return SUCCESS;
	}
	
}
