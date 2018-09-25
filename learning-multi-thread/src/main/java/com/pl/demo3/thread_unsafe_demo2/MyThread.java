package com.pl.demo3.thread_unsafe_demo2;

/**
 * @author: 彭立
 * @date: 2018年9月24日 下午12:03:22
 * 
 */
public class MyThread extends Thread {

	private Share share;// 共享资源

	private String toWrite;

	public MyThread(Share share, String toWrite) {
		this.share = share;
		this.toWrite = toWrite;
	}

	@Override
	public void run() {
		share.setStr(toWrite);
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Share share=new Share();
		MyThread thread1=new MyThread(share,"a");
		MyThread thread2=new MyThread(share,"b");
		
		thread1.start();
		thread2.start();
		
		Thread.sleep(1000);
		
		System.out.println(share.getStr());
	}

}
