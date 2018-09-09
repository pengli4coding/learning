package com.pl.demo8;

import org.springframework.stereotype.Repository;

/**
 * @Description:Dao接口实现类，这个实现类是模拟mysql数据库的crud实现
 * @author: 彭立
 * @date: 2018年8月14日 下午9:02:26
 * 
 */
@Repository
public class DaoMysqlImpl implements Dao {
	@Override
	public void save() {
		System.out.println("在mysql数据库中保存数据");

	}
}
