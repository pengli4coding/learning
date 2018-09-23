package com.pl.demo2;

/**
 * @Description:守护线程
 * @author: 彭立
 * @date: 2018年9月23日 下午8:51:27
 * 
 */
public class Thread7 {

	public static void main(String[] args) throws InterruptedException {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {

				Thread daemon = new Thread(new Runnable() {
					@Override
					public void run() {
						while (true) {
							try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							System.out.println(Thread.currentThread().getName() + "正在运行");
						}
					}

				});
				daemon.setName("守护线程");
				daemon.setDaemon(true);// setDaemon(true)必须要在start()之前，不然无效
				daemon.start();// setDaemon(true)必须要在start()之前，不然无效

				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("计数为： " + i);
				}
			}

		});

		myThread.setName("非守护线程");
		myThread.start();

		Thread.sleep(1000);// 休眠一秒之后main线程完成执行

		// 当虚拟机中所有的非守护线程都执行完毕了，虚拟机要退出

	}
}
