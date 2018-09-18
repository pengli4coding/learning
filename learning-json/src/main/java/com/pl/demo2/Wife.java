package com.pl.demo2;

public class Wife {

	private String wifeName;

	private Integer age;

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	// 必须提供get方法才能让json-lib读到数据

	public String getWifeName() {
		return wifeName;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Wife [wifeName=" + wifeName + ", age=" + age + "]";
	}
	
	
}
