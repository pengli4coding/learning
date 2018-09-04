package com.pl.decorator;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年9月4日 上午10:13:54
 * 
 */
public class AddWater extends CookFood {

	private CookFood cookFood;// 装饰者持有被装饰者的实例引用

	public AddWater(CookFood cookFood) {
		this.cookFood = cookFood;
	}

	@Override
	public void cook() {
		cookFood.cook();
		System.out.println("加一点水");

	}

}
