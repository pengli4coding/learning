/**
 * @Description:demo5主要学习基于jersey框架的统一异常处理
 * @author 910146
 * @date: 2018-09-25 09:39:52
 *
 */
package com.pl.demo5;


/**
 * 
 * Web应用的异常处理基本思路，服务层隐藏底层的Checked Exception，服务层的异常统一包装为RuntimeException抛出到Web层，由Web层统一对服务层异常进行处理。
 * 常见的两种处理方式：
 * 		1、针对Json格式的请求，返回包含异常代码，异常消息或者异常数据的对象返回
 * 		2、针对web页面的请求，统一返回到异常结果展示页面
 * 
 * 
 * 
 * 
 */