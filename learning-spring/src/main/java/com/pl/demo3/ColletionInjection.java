package com.pl.demo3;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @Description:这个类演示集合的注入
 * @author: 彭立
 * @date:   2018年9月1日 下午4:37:41
 *   
 */
public class ColletionInjection {
	
	private Set<String> set;
	
	private List<String> list;
	
	private Map<String,String> map;
	
	private Properties properties;

	/**
	 * @return the set
	 */
	public Set<String> getSet() {
		return set;
	}

	/**
	 * @param set the set to set
	 */
	public void setSet(Set<String> set) {
		this.set = set;
	}

	/**
	 * @return the list
	 */
	public List<String> getList() {
		return list;
	}

	/**
	 * @param list the list to set
	 */
	public void setList(List<String> list) {
		this.list = list;
	}

	/**
	 * @return the map
	 */
	public Map<String, String> getMap() {
		return map;
	}

	/**
	 * @param map the map to set
	 */
	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
	
	
}
