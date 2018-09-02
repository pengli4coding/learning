/**
 * 
 */
package com.pl.strategy;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月2日 下午5:15:44
 *   
 */
public class Steam implements CookStrategy{

	@Override
	public void howToCook() {
		System.out.println("用“蒸”的方式把食材煮熟了");
	}
}
