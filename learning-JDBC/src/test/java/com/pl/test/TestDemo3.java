package com.pl.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author: 彭立
 * @date: 2018年9月9日 下午3:21:49
 * 
 */
public class TestDemo3 {

	@Test
	public void test() {
		com.pl.demo3.Demo3.create();
	}

	@Test
	public void test1() {
		com.pl.demo3.Demo3.read();
	}

	@Test
	public void test2() {
		com.pl.demo3.Demo3.update();
	}

	@Test
	public void test3() {
		com.pl.demo3.Demo3.delete();
	}

}
