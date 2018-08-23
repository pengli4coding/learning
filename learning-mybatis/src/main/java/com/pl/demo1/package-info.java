/**
 * @Description:demo1主要学习mybatis框架的基础搭建以及mybatis-config.xml配置文件详解
 * @author: 彭立
 * @date:   2018年8月19日 上午9:18:36
 *   
 */
package com.pl.demo1;


/**
 * 
 * mybatis框架的基础搭建
 * 第一步：利用maven导包，主要导mybatis的核心包、数据库驱动包以及日志包，详细pom文件配置请看本项目的pom文件
 * 第二步：创建mybatis配置文件mybatis-config.xml
 * 第三步：数据库中建表，参见包下的createDB.sql建表脚本
 * 第四步：创建一个POJO对应数据库中的一张表（或者创建一个POJO对应着SQL语句）
 * 第五步：创建映射文件
 * 
 * 
 * 
 * 
 * 
 * 
 * 关于日志
 * Mybatis 的内置日志工厂提供日志功能，内置日志工厂将日志交给以下其中一种工具作代理：
 * SLF4J
 * Apache Commons Logging
 * Log4j 2
 * Log4j
 * JDK logging
 * 
 * 
 * 
 * 
 * 
 */


