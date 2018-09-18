package com.pl.demo2;

public class Brother {
	
	private String brotherName;
	
	private Integer age;

	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Brother [brotherName=" + brotherName + ", age=" + age + "]";
	}
	
	
}
