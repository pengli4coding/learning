package com.pl.demo3.thread_unsafe_demo1;

/**
 * @author: 彭立
 * @date: 2018年9月24日 上午11:53:50
 * 
 */
public class MyThread {

	static String str = "";// 这个就是共享资源

	public static void main(String[] args) throws InterruptedException {

		new Thread(new Runnable() {

			@Override
			public void run() {
				str += "a";
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				str += "a";

			}

		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				str += "b";
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				str += "b";

			}

		}).start();

		Thread.sleep(1000);

		System.out.println(str);

	}

}
