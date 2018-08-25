package com.pl.demo1;

import java.util.Date;

/**
 * @author: 彭立
 * @date: 2018年8月25日 下午4:41:38
 * 
 */
public class User {
	private Integer userId;
	private String uname;
	private Integer gender;
	private Date birthday;

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

}
