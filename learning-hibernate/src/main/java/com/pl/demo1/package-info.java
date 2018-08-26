/**
 * @Description:demo1主要学习hibernate框架的搭建以及第一个程序HelloWorld
 * @author: 彭立
 * @date: 2018年8月25日 上午11:10:11
 * 
 */
package com.pl.demo1;

/**
*
*
*hibernate框架的搭建，一般我们需要导入以下的包：
*	hibernate核心包：hibernate-core
*	hibernate与c3p0数据库连接池的整合包：hibernate-c3p0
*	hibernate与ehcache缓存的整合包：hibernate-ehcache
*	数据库驱动包
*详细的pom文件配置请见本项目的pom文件
*
*
*第一个程序HelloWorld
*第一步：创建表TB_USER（详见建表脚本createDB.sql）
*第二步：创建一个类User对应着数据库中的表TB_USER
*第三步：创建配置hibernate.cfg.xml文件
*第四步：创建配置对象-关系映射文件（文件名的命名规范为类名+.hbm+.xml，如User.hbm.xml）
*第五步：创建HibernateUtil用以实例化和获取SessionFactory，注意HibernateUtil获取SessionFactory必须是线程安全的
*
*
*
*
*/