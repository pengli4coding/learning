package com.pl.demo2;

import java.util.Date;

/**
 * @Description:这个持久化类对应数据库中的一张表Employees
 * @author: 彭立
 * @date:   2018年8月19日 下午5:45:50
 *   
 */
public class Employee {
	
	private Integer empNo;
	private Date birthday;
	private String firstName;
	private String lastName;

	
	@Override
	public String toString() {
		return "Employees [empNo=" + empNo + ", birthday=" + birthday + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}
	
	
	
}
