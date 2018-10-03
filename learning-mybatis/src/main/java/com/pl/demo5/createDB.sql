-- 创建一个名称为mybatis的数据库
-- create database mybatis;
-- 切换到mybatis数据库上
use mybatis;
-- 如果表存在则删除
drop table if exists t_test;
-- 创建表
CREATE TABLE `t_test` (
  `ID` int(13) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID自增',
  `FIRST_NAME` varchar(255) COMMENT '名',
  `LAST_NAME` varchar(255) COMMENT '姓',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='测试表';
