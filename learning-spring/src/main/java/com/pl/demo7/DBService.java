package com.pl.demo7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Description:service层，为了简单，service就不设计接口层了，直接就一个service类
 * @author: 彭立
 * @date:   2018年8月14日 下午8:59:05
 *   
 */

@Service(value="service")
public class DBService {
	
	@Autowired//配合@Autowired来进行依赖的注入
	@Qualifier(value="daoOracleImpl")
	private Dao dao;
	
	public void saveData() {
		dao.save();
	}
	
}
