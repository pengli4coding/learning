package com.pl.demo3.thread_unsafe_demo2;

/**
 * @Description:共享资源
 * @author: 彭立
 * @date: 2018年9月24日 下午12:01:06
 * 
 */
public class Share {

	private String str = "";

	public void setStr(String string) {
		this.str += string;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.str += string;
	}
	
	public String getStr() {
		return this.str;
	}
	
	
}
