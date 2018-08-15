package com.pl.demo2;

/**
 * @author: 彭立
 * @date:   2018年8月15日 上午9:20:30
 *   
 */
public class InstanceFactory {
	
	public InstanceFactory(String initParam) {
		
	}
	public InstanceFactory() {
		
	}
	
	private static Bean3 bean3 = new Bean3("初始化参数");

    public Bean3 getBean3Instance() {
        return bean3;
    }
}
