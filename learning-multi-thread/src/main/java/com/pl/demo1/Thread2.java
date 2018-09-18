package com.pl.demo1;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("当前线程名称： " + Thread.currentThread().getName() + " 标记：" + i);
		}
	}

}
