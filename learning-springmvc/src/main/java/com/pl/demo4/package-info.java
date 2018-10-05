/**
 * @Description:demo4主要学习springmvc框架的常用注解大全
 * @author: 彭立
 * @date: 2018-10-05 13:32:33
 *
 */
package com.pl.demo4;

/**
 * 
 * 下面简单介绍一下Restful风格的请求与传统风格请求之前的对比
 * 
 * Restful风格的请求，括号中为请求的方法：
 * 新增：http://localhost:8080/learning   (POST)
 * 修改：http://localhost:8080/learning/1 (PUT)
 * 删除：http://localhost:8080/learning/1 (DELETE)
 * 获取：http://localhost:8080/learning/1 (GET)
 * 
 * 传统风格的请求，括号中为请求的方法：
 * 新增：http://localhost:8080/learning/insert        (GET或POST)
 * 修改：http://localhost:8080/learning/update?id=1   (GET或POST)
 * 删除：http://localhost:8080/learning/delete?id=1   (GET或POST)
 * 获取：http://localhost:8080/learning/get?id=1      (GET或POST)
 * 
 * 
 */