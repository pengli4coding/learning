package com.pl.demo3;

public class Unit {

	private Integer id;// 主键ID
	private String unitCode;// 单元编码
	private String unitName;// 单元名称
	private Integer personCount;// 人口数
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUnitCode() {
		return unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	public Integer getPersonCount() {
		return personCount;
	}
	public void setPersonCount(Integer personCount) {
		this.personCount = personCount;
	}
	@Override
	public String toString() {
		return "Unit [id=" + id + ", unitCode=" + unitCode + ", unitName=" + unitName + ", personCount=" + personCount
				+ "]";
	}
	
	

}
