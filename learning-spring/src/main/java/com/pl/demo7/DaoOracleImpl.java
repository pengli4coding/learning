package com.pl.demo7;

import org.springframework.stereotype.Repository;

/**
 * @Description:Dao接口实现类，这个实现类是模拟oracle数据库的crud实现
 * @author: 彭立
 * @date: 2018年8月14日 下午9:02:26
 * 
 */
//@Repository(value="oracle")//如果要指定bean的id的话，则配置value属性
@Repository//bean的id默认就是类名的首字母小写
public class DaoOracleImpl implements Dao {

	@Override
	public void save() {
		System.out.println("在oracle数据库中保存数据");

	}

}
