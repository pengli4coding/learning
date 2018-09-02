/**
 * 
 */
package com.pl.strategy;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年9月2日 下午5:17:01
 * 
 */
public class Fry implements CookStrategy {

	@Override
	public void howToCook() {
		System.out.println("用“炒”的方式把食材煮熟了");
	}
}
