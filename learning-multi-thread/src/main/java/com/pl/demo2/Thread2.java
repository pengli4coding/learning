package com.pl.demo2;

/**
 * @Description:判断判断当前线程是否处于活动状态：isAlive()
 * @author: 彭立
 * @date: 2018年9月23日 下午6:04:27
 * 
 */
public class Thread2 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws InterruptedException {

		Thread myThread = new Thread(new Thread2());

		System.out.println("myThread线程是否处于活动状态： " + myThread.isAlive());

		myThread.start();

		System.out.println("myThread线程是否处于活动状态： " + myThread.isAlive());

		Thread.sleep(6000);// myThread线程是休眠5秒，6秒之后myThread线程应该是运行完了
		
		System.out.println("6秒之后，myThread线程是否处于活动状态： " + myThread.isAlive());

	}

}
