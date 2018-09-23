package com.pl.demo2;

/**
 * @Description:如何打断线程（即停止线程）
 * @author: 彭立
 * @date: 2018年9月23日 下午6:04:27
 * 
 */
public class Thread4 {

	public static void main(String[] args) throws InterruptedException {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {

				long start = System.currentTimeMillis();
				for (int i = 0; i < 500000; i++) {
					if (Thread.interrupted()) {// 判断当前线程是否有打断退出标记，通常这个打断退出标记是由外部传进来的。这里的判断也是可以用Thread.currentThread().isInterrupted()来判断
						System.out.println(Thread.currentThread().getName() + "线程被打断，即将退出。。。");
						return;
					}
					System.out.println("当前计数： " + i);
				}
				System.out.println("一共耗时（毫秒）： " + (System.currentTimeMillis() - start));
			}

		});

		myThread.start();

		Thread.sleep(100);

		myThread.interrupt();// 往myThread线程中传入打断退出标记

	}

}
