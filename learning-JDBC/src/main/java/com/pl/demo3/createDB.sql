-- 创建一个名称为jdbc_db的数据库
create database jdbc_db;
-- 切换到jdbc_db数据库上
use jdbc_db;
-- 如果存在PET表则删除
create table PET(
	PET_ID int(10) unsigned not null auto_increment,
	PET_NAME varchar(30) not null,
	BIRTHDAY datetime not null,
	FAVOURITE_FOOD varchar(30) not null,
	MASTER varchar(30) not null,
	primary key(PET_ID)
)engine=innodb default charset=utf8;

-- 插入记录
insert into PET (PET_ID,PET_NAME,BIRTHDAY,FAVOURITE_FOOD,MASTER) values (null,'大肥猫','2016-09-02','小鱼干','彭立');
