/**
 * @Description:demo8主要学习用注解的方式进行AOP操作
 * @author: 彭立
 * @date:   2018年9月9日 下午9:57:11
 *   
 */
package com.pl.demo8;


/**
 * Aspect（切面）：
 * Join point（连接点）：要拦截的方法
 * Advice（通知或者也叫增强）：在连接点前后或发生异常的时候做的一些方法增强
 * Pointcut（切点）：是连接点的集合
 * Weaving（织入）：进行方法的增强
 * Target object（目标对象）：被代理对象
 * 
 * 
 * 
 * 
 * 一共有五种通知（增强）：
 * 	Before advice:前置通知（增强）
 * 	After returning advice:后置通知（增强）
 * 	After throwing advice:异常通知（增强）
 * 	After (finally) advice: 
 * 	Around advice:环绕通知（增强）
 * 
 * 
 * 
 * 如何创建切面：
 * 	1、创建一个类，在类上面加上@Aspect注解，声明该类是一个切面
 * 	2、配置切点，也就是定义需要拦截哪些方法进行增强
 * 
 * 
 */