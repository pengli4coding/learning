package com.pl.demo1;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * 
 * @Description:自定义用于配置应用资源的类（继承自ResourceConfig类）
 * @author 彭立
 * @date: 2018-09-22 09:48:17
 *
 */
public class MyApplication extends ResourceConfig{
	
	public MyApplication() {
		packages("com.pl.demo1");//注册com.pl.demo1包下的所有REST资源服务类
		packages("com.pl.demo2");//注册com.pl.demo2包下的所有REST资源服务类
		packages("com.pl.demo3");//注册com.pl.demo3包下的所有REST资源服务类
		packages("com.pl.demo4");//注册com.pl.demo4包下的所有REST资源服务类
		register(com.pl.demo3.MyRequestFilter.class).register(com.pl.demo3.MyResponseFilter.class);
	}
}
