package com.pl.demo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: 彭立
 * @date: 2018年9月8日 上午11:56:02
 * 
 */
public class Demo1 {

	public static void testInetAddress() {
		try {
			// 通过InetAddress的静态方法获取本机ip对象
			InetAddress localHost = InetAddress.getLocalHost();
			// 获取本机ip地址字符串
			System.out.println(localHost.getHostAddress());
			// 获取本机的主机名
			System.out.println(localHost.getHostName());
			// 通过给定主机名获取特定的ip对象
			InetAddress local = InetAddress.getByName("LAPTOP-7S8BK84C");
			System.out.println(local);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
