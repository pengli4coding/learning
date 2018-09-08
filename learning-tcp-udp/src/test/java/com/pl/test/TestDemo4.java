package com.pl.test;

import org.junit.Test;

/**
 * @author: 彭立
 * @date: 2018年9月8日 下午12:00:32
 * 
 */
public class TestDemo4 {

	@Test
	public void testServer() {
		com.pl.demo4.Demo4.startServer(10001);
	}

	@Test
	public void testClient() {
		com.pl.demo4.Demo4.startClient("192.168.3.3", 10001);
	}

}
