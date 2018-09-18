package com.pl.demo2;

import java.util.List;

public class MyBean {
	
	private String name;
	
	private Integer age;
	
	private Wife wife;
	
	private Brother brother;
	
	private Boolean flag;
	
	private List OfficerList;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	public void setBrother(Brother brother) {
		this.brother = brother;
	}

	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public void setOfficerList(List officerList) {
		OfficerList = officerList;
	}
	
	
	
	//必须提供get方法才能让json-lib读到数据
	
	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Wife getWife() {
		return wife;
	}

	public Brother getBrother() {
		return brother;
	}

	public Boolean getFlag() {
		return flag;
	}

	public List getOfficerList() {
		return OfficerList;
	}

	@Override
	public String toString() {
		return "MyBean [name=" + name + ", age=" + age + ", wife=" + wife + ", brother=" + brother + ", flag=" + flag
				+ ", OfficerList=" + OfficerList + "]";
	}

	
	
}
