/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月11日 下午10:31:50
 *   
 */
package com.pl.demo1;

/**
 * 
 * springmvc框架的基础结构组件及功能如下：
 * 
 * DispatcherServlet：中央控制器，把请求给转发到具体的Controller类
 * Controller：处理具体请求的控制器类（配置文件方式需要配置，注解方式不用配置）
 * HandlerMapping：映射处理器，负责映射中央控制器转发给Controller类时的映射策略
 * ModelAndView：service层返回的数据和视图层的封装类（无论是配置文件还是注解都不需要配置）
 * ViewResolver&View：视图解析器，解析具体的视图
 * Interceptors:拦截器，负责拦截我们自定义的请求然后做处理工作（无论是配置文件方式还是注解都需要先创建再配置）
 * 
 * springmvc由url请求到最终展现的视图中间的流转过程详见本项目文档
 * 
 */