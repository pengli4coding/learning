/**
 * @Description:demo2主要学习springmvc框架的helloworld程序
 * @author: 彭立
 * @date:   2018年9月11日 下午10:53:29
 *   
 */
package com.pl.demo2;

/**
 * 
 * 大致流程如下：
 * 	第一步：配置pom.xml文件以导入依赖包（详见项目的pom.xml文件）
 * 	第二步：在web.xml文件中配置DispatcherServlet（详见项目的web.xml文件）
 * 	第三步：创建controller，即创建一个类继承自org.springframework.web.servlet.mvc.AbstractController
 * 	第四步：创建springmvc的配置文件（详见项目的WEB-INF下的springmvc-config文件），文件位置可以任意指定（习惯放在/WEB-INF文件夹下），文件名可以任意指定（习惯是第二步中Servlet的名称加上-servelt.xml（例如：Servlet的名称是springmvc，则这个文件名就是springmvc-servlet.xml））
 * 	第五步：在第四步中的springmvc的配置文件中配置上controller的bean
 */