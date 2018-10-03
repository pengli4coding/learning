package com.pl.demo4;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年10月3日 下午6:40:41
 *   
 */
public interface EmployeeDao {
	
	void insertEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployee(Integer id);

	Employee getEmployeeById(Integer id);
	
}
