-- 创建一个名称为mybatis的数据库
create database mybatis;
-- 切换到mybatis数据库上
use mybatis;
-- 如果存在EMPLOYEES表则删除
create table EMPLOYEES(
	EMP_NO int(11) unsigned not null auto_increment,
	BIRTHDAY date not null,
	FIRST_NAME varchar(14) not null,
	LAST_NAME varchar(16) not null,
	primary key(EMP_NO)
)engine=innodb default charset=utf8;

-- 插入几条记录
insert into EMPLOYEES (EMP_NO,BIRTHDAY,FIRST_NAME,LAST_NAME) values (null,'1990-09-02','li','peng');
insert into EMPLOYEES (EMP_NO,BIRTHDAY,FIRST_NAME,LAST_NAME) values (null,'1987-09-02','shuixiu','hu');
insert into EMPLOYEES (EMP_NO,BIRTHDAY,FIRST_NAME,LAST_NAME) values (null,'1990-07-01','xiaoshan','zhang');
insert into EMPLOYEES (EMP_NO,BIRTHDAY,FIRST_NAME,LAST_NAME) values (null,'1985-11-21','zhenhua','yin');
