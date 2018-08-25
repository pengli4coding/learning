-- 创建一个名称为hibernate的数据库
create database hibernate;
-- 切换到hibernate数据库上
use hibernate;
-- 如果存在TB_USER表则删除
create table TB_USER(
	ID int unsigned not null auto_increment,
	NAME varchar(18) not null,
	SEX char(2) not null,
	AGE int not null,
	primary key(ID)
)engine=innodb default charset=utf8;

-- 插入两条记录
insert into TB_USER (ID,NAME,SEX,AGE) values (null,'用户A','男','28');
insert into TB_USER (ID,NAME,SEX,AGE) values (null,'用户B','女','24');