/**
 * @Description:demo8主要学习静态参数的封装
 * @author: 彭立
 * @date:   2018年8月14日 下午3:07:21
 *   
 */
package com.pl.demo8.controller;




/**
 * 
 * 
 * 先说封装，什么是封装？
 * 其实在servlet的时代，是没有封装这个一个概念的，这个概念是在主流的mvc开发框架（如struts和springmvc）中才有的
 * 因为在servlet时代，我们直接就通过request.getParameter()、request.getAttribute()之类的方法获得参数的
 * 而开发框架（如struts和springmvc）会为我们把这些参数都封装起来，方便我们调用
 * 具体是怎么样的呢？
 * 其实就是我们在action动作类中定义一些成员变量（通常要提供set方法以供框架去反射赋值），然后框架就会自动地把参数注入到这些成员变量中了
 * 
 * 
 * 再说什么是静态参数
 * 静态参数就是在应用运行期间值不会改变的参数，通常是一些配置的参数
 * 
 * 
 * 
 * 
 * 
 * 
 */
