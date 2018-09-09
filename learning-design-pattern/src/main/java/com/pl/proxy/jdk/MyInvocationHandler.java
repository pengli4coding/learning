package com.pl.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: 彭立
 * @date:   2018年9月9日 下午9:12:42
 *   
 */
public class MyInvocationHandler implements InvocationHandler{
	
	//被代理对象
	private Object targetObj;
	
	public Object createProxyInstance(Object targetObj) {
		this.targetObj=targetObj;
		
		/**
		 * 第一个参数：被代理对象的类加载器
		 * 第二个参数：被代理对象的实现的接口
		 * 第三个参数：设置回调对象InvocationHandler，当代理对象的方法被调用时，最终会调用该InvocationHandler的invoke方法
		 */
		return Proxy.newProxyInstance(this.targetObj.getClass().getClassLoader(), this.targetObj.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("之前做一些事情");
		Object result = method.invoke(this.targetObj, args);//这里返回的对象就是实际被代理类的方法执行后返回的对象
		System.out.println("之后做一些事情");
		return result;
	}

}
