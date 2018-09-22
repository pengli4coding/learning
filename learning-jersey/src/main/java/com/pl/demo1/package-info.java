/**
 * @Description:demo1主要学习基于jersey框架的REST服务搭建
 * @author 彭立
 * @date: 2018-09-22 09:12:01
 *
 */
package com.pl.demo1;


/**
 * 
 * jersey框架的搭建：
 * 	第一步：导包，详见pom.xml文件
 * 	第二步：在web.xml文件上配置jersey的核心控制器
 * 	第三步：自定义一个用于配置应用资源的类并配置到web.xml文件上（详见com.pl.demo1.MyApplication类）
 * 	第四步：编写REST资源服务类
 * 说明：这里的基于jersey框架的REST服务搭建一定要部署到web容器（一般是tomcat）上的
 * 
 * 
 * 
 */