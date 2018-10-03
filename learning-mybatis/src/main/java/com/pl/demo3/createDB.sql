-- 创建一个名称为mybatis的数据库
create database mybatis;
-- 切换到mybatis数据库上
use mybatis;
-- 创建t_unit表
CREATE TABLE `t_unit` (
  `ID` int(13) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID自增',
  `UNIT_CODE` varchar(64) NOT NULL COMMENT '单元编码',
  `UNIT_NAME` varchar(64) NOT NULL COMMENT '单元名称',
  `PERSON_COUNT` int(13) unsigned NOT NULL COMMENT '人口数',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COMMENT='单元信息表';
