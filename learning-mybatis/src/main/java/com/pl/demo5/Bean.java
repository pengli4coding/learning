package com.pl.demo5;

/**
 * 
 * @Description:
 * @author: 彭立
 * @date: 2018-10-04 00:26:13
 *
 */
public class Bean {
	private Integer id;
	private String firstName;
	private String lastName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Bean [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	
}
