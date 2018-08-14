/**
 * 
 */
/**
 * @Description:demo7主要学习在action动作类中获取servlet的API
 * @author: 彭立
 * @date:   2018年8月14日 下午2:33:35
 *   
 */
package com.pl.demo7.controller;


/**
 * 
 * 为什么要在action动作类中获取servlet的API呢？
 * 其实我到现在也找不到一个一定要这么做的理由，呵呵。。。。
 * 
 * 
 * 可以通过以下两种方法获得
 * 第一种：
 * 通过ServletActionContext获得
 * 如HttpServletRequest request = ServletActionContext.getRequest();
 * 如HttpServletResponse response = ServletActionContext.getResponse();
 * 
 * 
 * 第二种：
 * 通过实现ServletRequestAware、ServletResponseAware等接口来获取
 * 
 * 
 * 
 * 
 * 
 */

