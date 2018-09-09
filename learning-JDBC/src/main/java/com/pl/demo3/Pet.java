package com.pl.demo3;

import java.util.Date;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年9月9日 下午3:30:45
 * 
 */
public class Pet {
	private Integer petId;
	private String petName;
	private Date birthday;
	private String favouriteFood;
	private String master;
	
	
	/**
	 * @return the petId
	 */
	public Integer getPetId() {
		return petId;
	}
	/**
	 * @param petId the petId to set
	 */
	public void setPetId(Integer petId) {
		this.petId = petId;
	}
	/**
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}
	/**
	 * @param petName the petName to set
	 */
	public void setPetName(String petName) {
		this.petName = petName;
	}
	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}
	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	/**
	 * @return the favouriteFood
	 */
	public String getFavouriteFood() {
		return favouriteFood;
	}
	/**
	 * @param favouriteFood the favouriteFood to set
	 */
	public void setFavouriteFood(String favouriteFood) {
		this.favouriteFood = favouriteFood;
	}
	/**
	 * @return the master
	 */
	public String getMaster() {
		return master;
	}
	/**
	 * @param master the master to set
	 */
	public void setMaster(String master) {
		this.master = master;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", birthday=" + birthday + ", favouriteFood="
				+ favouriteFood + ", master=" + master + "]";
	}
	
	
}
