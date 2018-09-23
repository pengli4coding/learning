package com.pl.demo2;

/**
 * @Description:让当前线程让出时间片yield（说白了就是暂停当前线程，让别的线程去执行）
 * @author: 彭立
 * @date: 2018年9月23日 下午8:51:27
 * 
 */
public class Thread6 {

	public static void main(String[] args) throws InterruptedException {

		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();

		thread1.setPriority(Thread.NORM_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		thread1.start();
		thread2.start();
		
		Thread.sleep(1000);

		System.out.println("thread1线程的计数是： "+thread1.getCount());
		System.out.println("thread2线程的计数是： "+thread2.getCount());
		
	}
}

class MyThread extends Thread {

	private int count = 0;

	public int getCount() {
		return this.count;
	}

	@Override
	public void run() {
		while (true) {
			this.count++;
		}

	}
}
