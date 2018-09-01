package com.pl.demo5;

import java.util.Map;

/**
 * @Description:service层的第一种实现方法
 * @author: 彭立
 * @date:   2018年9月1日 下午7:56:26
 *   
 */
public class ServiceImplA implements Service{

	@Override
	public Map<String, Object> getServiceResult() {
		System.out.println("service层的第一种实现方法");
		return null;
	}

}
