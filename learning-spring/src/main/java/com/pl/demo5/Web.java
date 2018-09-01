package com.pl.demo5;

import javax.annotation.Resource;

/**
 * @Description:web层，就是放controller的那一层
 * @author: 彭立
 * @date:   2018年9月1日 下午7:55:53
 *   
 */
public class Web {
	//@Resource(name="serviceB")//如果指定了name属性值对应bean的id号，则只会找对应的bean，如果没有找到对应的bean的id号对应name属性值，则报错，不会按照继承关系来找了
	@Resource//如果没有指定name属性值的话，默认找id号对应成员变量名的bean，如果找不到，则按照继承关系来找，如果找到唯一的继承者bean则注入，如果找到多个继承者bean则报错
	private Service service;
	
	public void returnJson() {
		service.getServiceResult();
		System.out.println("将service层传过来的数据转换为json传到前台去");
	}
}
