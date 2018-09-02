package com.pl.strategy;

/**
 * @Description:食物的抽象类
 * @author: 彭立
 * @date:   2018年9月2日 下午12:25:37
 *   
 */
public abstract class Food {
	
	private CookStrategy cookStrategy;//食材的烹饪方法时常会有变动
	

	public void changeCookStrategy(CookStrategy cookStrategy) {
		this.cookStrategy = cookStrategy;
	}

	//不变的部分
	public void howToGetFood() {
		System.out.println("可以在菜市场或者超市中获取食物");
	}
	
	public void howToCook() {
		cookStrategy.howToCook();
	}
}
