package com.pl.demo2;

/**
 * @Description:获取调用当前代码的线程的方法：currentThread()
 * @author: 彭立
 * @date: 2018年9月23日 下午6:04:27
 * 
 */
public class Thread1 {

	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("当前线程为： " + Thread.currentThread().getName() + " 计数为：" + i);
				}
			}

		}).start();

		for (int i = 0; i < 10; i++) {
			System.out.println("当前线程为： " + Thread.currentThread().getName() + " 计数为：" + i);
		}
	}
}
