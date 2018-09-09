
/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月9日 下午5:13:44
 *   
 */
package com.pl.demo7;

/**
 * Connection的三个与事务相关的方法：
 * 	1、setAutoCommit(boolean autoCommit):设置是否为自动提交事务，如果未true（默认值就是true）表示自动提交，
 * 	也就是每条执行SQL语句都是一个单独的事务，如果设置为false，那么就相当于手动管理事务的提交
 * 	2、commit()：提交事务
 * 	3、rollback()：回滚事务
 * 
 * 
 */