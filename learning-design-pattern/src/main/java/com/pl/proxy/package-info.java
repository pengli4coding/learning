/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月9日 下午8:56:06
 *   
 */
package com.pl.proxy;


/**
 * 
 * JDK动态代理要求：被代理类必须实现接口
 * 
 * CGLIB动态代理要求：被代理类不能是final，被代理类的方法不能是final
 * 
 * 
 * 
 * 实现JDK动态代理的一般流程：
 * 		1、创建被代理类（必须实现接口）
 * 		2、创建InvocationHandler接口的实现类，用于定义被代理类的方法的增强
 * 
 * 
 */