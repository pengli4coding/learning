package com.pl.test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author: 彭立
 * @date: 2018年9月9日 下午3:21:49
 * 
 */
public class TestDemo7 {

	@Test
	public void testNonTransactional() {
		com.pl.demo7.Demo7.nonTransactional();
	}
	
	@Test
	public void testtransactional() {
		com.pl.demo7.Demo7.transactional();
	}


}
