package com.pl.test;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestDemo1 {

	@Test
	public void test() {
		// 开启另一个线程
		new com.pl.demo1.Thread1().start();
		// 主线程
		for (int i = 0; i < 10; i++) {
			System.out.println("当前线程名称： " + Thread.currentThread().getName() + " 标记：" + i);
		}

	}

	@Test
	public void test1() {
		// 开启另一个线程
		Thread thread = new Thread(new com.pl.demo1.Thread2());
		thread.start();
		// 主线程
		for (int i = 0; i < 10; i++) {
			System.out.println("当前线程名称： " + Thread.currentThread().getName() + " 标记：" + i);
		}

	}

	/**
	 * 推荐的创建线程的方法（个人也是比较喜欢这种方式）
	 */
	@Test
	public void test2() {
		// 开启另一个线程
		new Thread(new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("当前线程名称： " + Thread.currentThread().getName() + " 标记：" + i);
				}

			}
		}).start();

		// 主线程
		for (int i = 0; i < 10; i++) {
			System.out.println("当前线程名称： " + Thread.currentThread().getName() + " 标记：" + i);
		}

	}

}
