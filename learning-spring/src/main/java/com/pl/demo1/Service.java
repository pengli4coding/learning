package com.pl.demo1;

/**
 * @Description:service层，为了简单，service就不设计接口层了，直接就一个service类
 * @author: 彭立
 * @date:   2018年8月14日 下午8:59:05
 *   
 */
public class Service {
	
	//这个Dao的具体实现是由spring容器注入进来的，可以注入DaoOracleImpl，也可以注入DaoMysqlImpl
	//由开发人员通过配置文件来决定用哪个
	private Dao dao;
	
	//必须提供set方法，这样才能注入进来
	public void setDao(Dao dao) {
		this.dao = dao;
	}


	public void saveData() {
		dao.save();
	}
	
}
