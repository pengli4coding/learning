package com.pl.test;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * @author: 彭立
 * @date: 2018年9月8日 下午12:00:32
 * 
 */
public class TestDemo2 {

	@Test
	public void testServer() {
		System.out.println("启动服务器");
		com.pl.demo2.Demo2.startServer(10000);
	}
	
	@Test
	public void testClient() {
		com.pl.demo2.Demo2.startClient("192.168.3.3",10000);
	}

}
