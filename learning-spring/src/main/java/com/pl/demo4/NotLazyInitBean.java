package com.pl.demo4;

/**
 * 
 * @Description:非延迟加载bean
 * @author: 彭立
 * @date:   2018年8月15日 上午10:51:55
 *
 */
public class NotLazyInitBean {

	public NotLazyInitBean() {
		System.out.println("调用非延迟加载bean构造方法");
	}
}
