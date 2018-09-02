/**
 * 
 */
package com.pl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pl.strategy.Fish;
import com.pl.strategy.Food;
import com.pl.strategy.Fry;
import com.pl.strategy.Steam;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月2日 下午5:23:27
 *   
 */
public class TestStrategy {

	@Test
	public void test() {
		Food food=new Fish();
		food.changeCookStrategy(new Steam());//动态改变烹饪方法
		food.howToCook();
		food.changeCookStrategy(new Fry());//动态改变烹饪方法
		food.howToCook();
	}

}
