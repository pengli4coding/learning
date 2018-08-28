package com.pl.demo2.vo;

import java.util.Date;

/**
 * @Description:封装查询条件的VO类
 * @author: 彭立
 * @date: 2018年8月28日 上午11:40:30
 * 
 */
public class EmployeeQueryCondition1 {
	
	private Date upper;// 出生日期上限
	private Date lower;// 出生日期下限

	public Date getUpper() {
		return upper;
	}

	public void setUpper(Date upper) {
		this.upper = upper;
	}

	public Date getLower() {
		return lower;
	}

	public void setLower(Date lower) {
		this.lower = lower;
	}

}
