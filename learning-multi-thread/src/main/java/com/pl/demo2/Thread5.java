package com.pl.demo2;

/**
 * @Description:让当前线程让出时间片yield（说白了就是暂停当前线程，让别的线程去执行）
 * @author: 彭立
 * @date: 2018年9月23日 下午8:51:27
 * 
 */
public class Thread5 {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 0;
				long start = System.currentTimeMillis();
				for (int i = 0; i < 500000000; i++) {
					Thread.yield();// 让当前线程让出时间片yield
					count = count + (i + 1);
				}
				System.out.println("一共耗时（毫秒）： " + (System.currentTimeMillis() - start));

			}

		});
		myThread.start();

	}
}
