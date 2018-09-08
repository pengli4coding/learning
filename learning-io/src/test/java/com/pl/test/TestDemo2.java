package com.pl.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pl.demo2.Demo2;


/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date:   2018年9月2日 下午8:48:37
 *   
 */
public class TestDemo2 {

	@Test
	public void test() {
		Demo2.output("src/main/java/com/pl/demo2/demo2.txt");
	}
	
	@Test
	public void test1() {
		Demo2.input("src/main/java/com/pl/demo2/demo2.txt");
	}
	
	
}
