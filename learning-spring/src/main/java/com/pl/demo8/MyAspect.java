package com.pl.demo8;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Description:自定义切面
 * @author: 彭立
 * @date:   2018年9月9日 下午10:28:59
 *   
 */


@Component//切面也是要纳入spring容器中管理的
@Aspect//加上@Aspect注解，声明该类是一个切面
public class MyAspect {
	
	/**
	 * 第一个星号：拦截方法的返回值类型是任意的
	 * 第一个连续的两点：com.pl.demo8包及其子包
	 * 第二个星号：拦截的类是com.pl.demo8包及其子包下的任意类
	 * 第三个星号：拦截的类是com.pl.demo8包及其子包下的任意类的任意方法
	 * 第二个连续的两点：参数个数和类型是任意的
	 * 
	 * 整个表达式表达的意思就是：拦截的是com.pl.demo8包及其子包下的任意类的任意方法（其中方法参数的个数和类型是任意的、方法的返回值是任意的）
	 */
	@Pointcut("execution(* com.pl.demo8..*.*(..))")
	public void anyMethod() {
		//一般是空方法
	}
	
	//定义前置通知（加上@Before注解，value属性要指定切点，就是切点方法名），这里的方法名是任意的
	//"anyMethod()&&args(data,ip)"表示的意思是拦截的切点是anyMethod()中定义的切点，并且拦截的方法有两个形参（data和ip），必须与beforeAdvice(String data,String ip)中的两个形参名一致
	@Before(value = "anyMethod()&&args(data,ip)")//一定要注意：value = "anyMethod"这样是错误的，一定要加上括号
	public void beforeAdvice(String data,String ip) {
		System.out.println("执行前置通知");
		System.out.println("打印传入的参数值：");
		System.out.println(data);
		System.out.println(ip);
		System.out.println("==============往上是前置通知的内容，往下是被代理对象的方法执行的内容========================");
	}
}
