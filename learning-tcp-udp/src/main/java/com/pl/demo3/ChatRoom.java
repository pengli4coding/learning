package com.pl.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * @Description:UDP简易聊天室，开两个线程，一个线程是服务器端角色，一个线程是客户端角色
 * @author: 彭立
 * @date: 2018年9月8日 下午8:47:00
 * 
 */
public class ChatRoom implements Runnable {
	
	public static void main(String[] args) {
		new Thread(new ChatRoom("192.168.3.8",10001)).start();
	}

	private String ip;

	private int port;

	public ChatRoom(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	@Override
	public void run() {

		// 服务器端角色
		new Thread(new Runnable() {

			@Override
			public void run() {

				DatagramSocket socket = null;
				try {
					// 创建服务器端的socket服务对象
					socket = new DatagramSocket(port);// 传入的参数是端口号，一般我们自定义的一般用1万以上的端口号
					// 定义接收数据的字节数组缓冲区
					byte[] buffer = new byte[1024];
					// 定义接收的数据包
					DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
					while (true) {
						// 从套接字中接受数据，放到我们上面定义的数据包中
						socket.receive(packet);// 注意：这一步如果客户端没有数据过来的话，这里是阻塞的
						// 获得数据包中的数据
						String data = new String(packet.getData(), 0, packet.getLength());
						// 获得发送端的ip地址
						InetAddress address = packet.getAddress();
						// 打印
						System.out.println(address + "说："+System.lineSeparator() + data);
						// 定义退出标志
						if ("exit".equals(data)) {
							System.out.println("获取到来自" + address + "的推出指令，服务器端准备退出");
							break;
						}
					}

				} catch (SocketException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (socket != null) {
						// 关闭资源
						socket.close();
					}
				}

			}

		}).start();

		// 客户端角色
		new Thread(new Runnable() {

			@Override
			public void run() {

				DatagramSocket socket = null;
				BufferedReader br = null;
				try {
					// 获取输入流对象
					br = new BufferedReader(new InputStreamReader(System.in));
					// 创建服务器端的socket服务对象
					socket = new DatagramSocket();// 在创建服务器端的socket服务对象的时候不需要指定端口号，要发送到的服务器的ip地址和端口号在数据包中指定
					while (true) {
						System.out.println("我说"+System.lineSeparator());
						// 从输入流对象中获取内容
						String content = br.readLine();
						// 创建要发送的目的地的ip对象
						InetAddress address = InetAddress.getByName(ip);
						// 打数据包
						DatagramPacket packet = new DatagramPacket(content.getBytes(), content.getBytes().length, address, port);
						// 发送数据包
						socket.send(packet);
						// 退出标志
						if ("exit".equals(content)) {
							System.out.println("客户端准备退出");
							break;
						}
					}

				} catch (SocketException e) {
					e.printStackTrace();
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					if (socket != null) {
						socket.close();
					}
				}

			}

		}).start();

	}

}
