/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月20日 上午12:06:55
 *   
 */
package com.pl.demo1;


/**
 * 
 * 实现了avax.servlet.ServletContextListener接口的监听器在实际工作中常用于以下两种应用场景：
 * 	第一种：做一些初始化的工作（如初始化spring容器）
 * 	第二种：做一些任务调度的工作
 * 
 * 
 * 要对ServletContext这个域对象进行监听的话，需要做以下两个步骤：
 * 	第一步：创建一个类实现了avax.servlet.ServletContextListener接口
 * 	第二步：在web.xml文件中配置这个监听器
 * 
 * 
 * 
 */