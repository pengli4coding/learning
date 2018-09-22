/**
 * @Description:demo3主要学习基于jersey框架的过滤器Filter
 * @author 彭立
 * @date: 2018-09-22 14:44:47
 *
 */
package com.pl.demo3;

/**
 * 
 * 我们知道Servlet中的过滤器Filter，是一种双向的过滤器，即一个过滤器可以对请求进行一次过滤，然后调用执行链，让请求向下运行，然后再返回响应的时候，再次通过过滤器，在这个时候就可以对响应进行处理。
 * 
 * 而在JAX-RS中，即在jersey中，过滤器是单向的，换句话说，要针对请求进行过滤，要选择针对请求的过滤器，要针对响应进行过滤，就要选择针对响应的过滤器。
 * 
 * 在jersey中，过滤器分为两块，针对服务器端的过滤器和针对客户端的过滤器
 * 
 * 先说针对服务器端的过滤器：
 * 	javax.ws.rs.container.ContainerRequestFilter：针对请求的过滤器
 * 		
 * 	javax.ws.rs.container.ContainerResponseFilter：针对响应的过滤器
 * 
 * 
 */

