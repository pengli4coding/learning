package com.pl.demo2;
/**
 * 
 * @Description:将领类
 * @author 彭立
 * @date: 2018-09-12 15:14:54
 *
 */
public class Officer {
	private String name;
	
	private String age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Officer [name=" + name + ", age=" + age + "]";
	}
	
	
}
