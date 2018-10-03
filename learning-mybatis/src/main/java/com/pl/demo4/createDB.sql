-- 创建一个名称为mybatis的数据库
create database mybatis;
-- 切换到mybatis数据库上
use mybatis;
-- 创建t_employee表
CREATE TABLE `t_employee` (
  `ID` int(13) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID自增',
  `FIRST_NAME` varchar(255) COMMENT '名',
  `LAST_NAME` varchar(255) COMMENT '姓',
  `GENDER` char(1) COMMENT '性别',
  `EMAIL` varchar(255) COMMENT '邮件地址',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COMMENT='雇员表';
