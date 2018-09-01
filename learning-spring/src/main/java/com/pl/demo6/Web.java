package com.pl.demo6;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Description:web层，就是放controller的那一层
 * @author: 彭立
 * @date:   2018年9月1日 下午7:55:53
 *   
 */
public class Web {
	@Autowired//@Autowired默认就是按照类型匹配来找到对应的bean来注入，如果找到多于一个的bean类型能够对应的上，则会报错
	//@Qualifier(value="serviceB")//如果要找特定id号的bean来进行注入，则需要配合@Qualifier来使用，指定id号来匹配
	private Service service;
	
	public void returnJson() {
		service.getServiceResult();
		System.out.println("将service层传过来的数据转换为json传到前台去");
	}
}
