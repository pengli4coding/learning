/**
 * @Description:demo5主要学习IoC中注解@Resource的使用
 * @author: 彭立
 * @date: 2018年8月15日 上午11:22:19
 * 
 */
package com.pl.demo5;

/**
 *
 * “@Resource”并不是spring框架本身提供的注解，而是JSR-250标准的注解，这个注解本身已经包含在javase6及以上版本中，因此使用这个注解的时候不需要额外去导包
 *
 *
 * 要使用IoC中的注解，必须在xml文件中引入context的相关命名空间，详见项目下的ApplicationContext_demo5.xml
 * 
 * 
 * 使用“@Resource”主要的作用是注入bean的依赖，是不包含bean的创建的，所以一定要在ApplicationContext.xml文件中配置bean（不需要配置依赖）
 * 
 * “@Resource”的全类名是javax.annotation.Resource，并不是spring框架本身提供的注解，而是JSR-250标准的注解
 * 
 * 
 * 
 * “@Resource”注解可以加在成员变量上也可以加在set方法上
 * 第一种：加在成员变量上
 * “@Resource”详见本项目document文件夹下的“@Resource注解加在成员变量上的匹配流程.png”
 * 
 * 第二种：加在set方法上
 * 由于个人觉得加在set方法上的匹配规则过多，代码阅读起来不够直观，相对麻烦，在实际开发工作中几乎不会用到，所有这里不会做详细的讲解，如果真的有用到的话再去学一下吧
 * 
 *
 */