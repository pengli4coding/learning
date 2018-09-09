package com.pl.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author: 彭立
 * @date: 2018年9月9日 下午3:21:49
 * 
 */
public class TestDemo2 {

	@Test
	public void test() {
		com.pl.demo2.Demo2.create();
	}

	@Test
	public void test1() {
		com.pl.demo2.Demo2.read();
	}

	@Test
	public void test2() {
		com.pl.demo2.Demo2.update();
	}

	@Test
	public void test3() {
		com.pl.demo2.Demo2.delete();
	}

}
