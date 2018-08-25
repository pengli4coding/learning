package com.pl.demo2;

import java.util.Date;

/**
 * @author: 彭立
 * @date: 2018年8月25日 下午4:41:38
 * 
 */
public class User {
	private Integer userId;//这个成员变量对应数据表中的主键，一般也成为OID，即对象id
	private String uname;
	private Integer gender;
	private Date birthday;
	
	//提供set和get方法
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", uname=" + uname + ", gender=" + gender + ", birthday=" + birthday + "]";
	}
	
	

}
