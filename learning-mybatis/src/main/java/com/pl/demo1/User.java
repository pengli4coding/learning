package com.pl.demo1;

/**
 * @Description:这个POJO对应数据库中的一张表TB_USER
 * @author: 彭立
 * @date:   2018年8月19日 下午5:45:50
 *   
 */
public class User {
	private Integer id;
	private String name;
	private String sex;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
