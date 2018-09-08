package com.pl.test;

import org.junit.Test;

import com.pl.demo3.ChatRoom;

/**
 * @author: 彭立
 * @date: 2018年9月8日 下午12:00:32
 * 
 */
public class TestDemo3 {

	@Test
	public void testChatRoom() {
		new Thread(new ChatRoom("192.168.3.3", 10001)).start();
	}

}
