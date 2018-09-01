/**
 * @Description:demo3主要学习依赖的注入
 * @author: 彭立
 * @date: 2018年8月15日 上午9:38:22
 * 
 */
package com.pl.demo3;

/**
 *
 * 首先搞清楚什么是依赖？
 * 依赖其实具体来说就是bean中的成员变量的值，如下面这个bean
 * public class MyBean{
 * 
 *     private OtherBean otherBean;
 *     
 *     private String aaa;
 * 
 * 
 * }
 * 
 * MyBean中的成员变量otherBean和aaa都可以说是MyBean的依赖（准确的说是MyBean实例的依赖）
  * 所以依赖可以是其它bean的实例，也可以是常量、基本数据类型等
  * 简单的理解就是成员变量的值
 * 
 *
 * 依赖注入的两种方式：
 * 
 * 第一种：利用set方法进行注入（工作中几乎都是用这种注入方式）
 * 1、常量的注入
 * 2、bean的注入
 * 3、集合的注入
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 第二种：利用构造器进行注入（了解一下就好了，工作中几乎不会用到，这里也不做详细讲解）
 * 
 * 
 * 
 */
