-- 创建一个名称为hibernate的数据库
create database hibernate;
-- 切换到hibernate数据库上
use hibernate;
-- 如果存在TB_USER表则删除
drop table if exists TB_USER;
-- 创建TB_USER表
create table TB_USER(
	USER_ID integer not null,
	UNAME varchar(50),
	GENDER integer,
	BIRTHDAY datetime,
    primary key (USER_ID)
)engine=innodb default charset=utf8;

-- 插入两条记录
-- insert into TB_USER (ID,NAME,SEX,AGE) values (1,'用户A',1,'1990-09-02');
-- insert into TB_USER (ID,NAME,SEX,AGE) values (2,'用户B',0,'1987-08-01');