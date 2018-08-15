/**
 * 
 */
package com.pl.demo2;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年8月15日 上午8:46:18
 *   
 */
public class StaticFactory {
	private static Bean2 bean2 = new Bean2("初始化参数");
    private StaticFactory(String initParam) {}

    public static Bean2 getBean2Instance() {
        return bean2;
    }
}
