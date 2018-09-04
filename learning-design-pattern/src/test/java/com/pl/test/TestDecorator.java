package com.pl.test;

import org.junit.Test;

import com.pl.decorator.AddOil;
import com.pl.decorator.AddSalt;
import com.pl.decorator.AddWater;
import com.pl.decorator.CookChicken;
import com.pl.decorator.CookFood;


/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月2日 下午5:23:27
 *   
 */
public class TestDecorator {

	@Test
	public void test() {
		
		CookFood cookFood=new AddSalt(new AddOil(new CookChicken()));//烹饪一只鸡，先加点油加点盐
		//再加两次水
		cookFood=new AddWater(cookFood);
		cookFood=new AddWater(cookFood);
		
		cookFood.cook();
		
		
	}

}
