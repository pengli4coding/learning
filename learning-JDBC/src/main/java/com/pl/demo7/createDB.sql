-- 创建一个名称为jdbc_db的数据库
create database jdbc_db;
-- 切换到jdbc_db数据库上
use jdbc_db;
-- 如果存在ACCOUNT表则删除
create table ACCOUNT(
	ID int(10) unsigned not null auto_increment,
	CLIENT_NAME varchar(30) not null,
	AMOUNT int not null,
	primary key(ID)
)engine=innodb default charset=utf8;

-- 插入记录
insert into ACCOUNT (ID,CLIENT_NAME,AMOUNT) values (null,'张三',10000);
insert into ACCOUNT (ID,CLIENT_NAME,AMOUNT) values (null,'李四',10000);
