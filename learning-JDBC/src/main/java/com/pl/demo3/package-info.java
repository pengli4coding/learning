/**
 * @Description:demo3主要学习在JDBC中利用PreparedStatement接口来进行CRUD操作
 * @author: 彭立
 * @date:   2018年9月9日 下午2:54:35
 *   
 */
package com.pl.demo3;

/**
 * 由于用Statement的时候有SQL注入的风险，所以一般情况下用的比较多的是使用PreparedStatement来进行增删改查的操作，
 * 这样可以防止SQL注入的问题，而且可以提升运行效率
 * 
 * 
 */